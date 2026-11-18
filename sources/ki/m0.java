package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.n10;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class m0 extends LinearLayout implements rh.a, te.i {
    public final i6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public j0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final te.j y;

    public m0(Context context, i6 i6Var) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new te.j(this, lr.h, 320L);
        this.a = i6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override // rh.a
    public final void b(int i7) {
        if (this.s == i7) {
            return;
        }
        this.s = i7;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i7) {
            scrollView.setPadding(0, 0, 0, i7);
        }
        invalidate();
    }

    public final void d() {
        org.telegram.messenger.g0.x3(this.r, n6.w0(n6.zf, this.a));
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((k0) arrayList.get(i7)).a();
                i7++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.g0.R0(this.s);
        if (R0 > 0.0f) {
            int r12 = n6.r1(R0, n6.w0(n6.zf, this.a));
            int i7 = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i7 != r12) {
                gradientDrawable.setColors(new int[]{r12, n6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override // te.i
    public final void f(te.j jVar) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            ((l0) obj).setAlpha(c10);
            ((l0) obj).setScaleX(T1);
            ((l0) obj).setScaleY(T1);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f) {
            return this.e;
        }
        return org.telegram.messenger.f3.D(4.0f, this.c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r4 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.readByte(true) == r7.readByte(true)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.c;
        if (tL_replyKeyboardMarkup == tL_replyKeyboardMarkup2) {
            return;
        }
        if (tL_replyKeyboardMarkup != null && tL_replyKeyboardMarkup2 != null && (objectSize = tL_replyKeyboardMarkup.getObjectSize()) == (objectSize2 = tL_replyKeyboardMarkup2.getObjectSize())) {
            try {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                tL_replyKeyboardMarkup.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.rewind();
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(objectSize2);
                tL_replyKeyboardMarkup2.serializeToStream(nativeByteBuffer2);
                nativeByteBuffer2.rewind();
                while (true) {
                    if (objectSize < 8) {
                        break;
                    } else if (nativeByteBuffer.readInt64(true) != nativeByteBuffer2.readInt64(true)) {
                        break;
                    } else {
                        objectSize -= 8;
                    }
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        this.c = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.n;
        arrayList.clear();
        ScrollView scrollView = this.r;
        float scrollY = scrollView.getScrollY();
        te.j jVar = this.y;
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) ((te.e) it.next()).a;
            l0Var.setTranslationY(l0Var.getTranslationY() - scrollY);
        }
        int i7 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            jVar.a.m(null, true);
            return;
        }
        l0 l0Var2 = new l0(getContext());
        l0Var2.setOrientation(1);
        float f10 = 0.0f;
        l0Var2.setAlpha(0.0f);
        this.b.addView(l0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        float f11 = 4.0f;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (n10.B(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.g0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.g0.p);
        int i10 = 0;
        while (i10 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i10);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i7);
            l0Var2.addView(linearLayout, ma.k(8.0f, i10 == 0 ? 8.0f : f11, 8.0f, i10 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f10, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i11 = i7;
            while (i11 < keyboardButtonRow.buttons.size()) {
                k0 k0Var = new k0(this, getContext(), keyboardButtonRow.buttons.get(i11));
                boolean z11 = i11 == 0;
                boolean z12 = i10 == 0;
                boolean z13 = i11 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i10 == tL_replyKeyboardMarkup.rows.size() - 1;
                k0Var.d = z11;
                k0Var.e = z12;
                k0Var.f = z13;
                k0Var.h = z14;
                k0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(k0Var, ma.c(-1.0f, -1));
                linearLayout.addView(frameLayout, ma.m(size, 0, -1, 0, i11 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                k0Var.setOnClickListener(new hi.o0(this, 12));
                ra.b(k0Var, 0.02f, 1.5f);
                arrayList.add(k0Var);
                k0Var.a();
                i11++;
            }
            i10++;
            i7 = 0;
            f10 = 0.0f;
            f11 = 4.0f;
        }
        jVar.f(l0Var2, true);
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i7) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i7;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (n10.B(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.g0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.g0.p);
        this.h = max;
        int L = org.telegram.messenger.g0.L(max);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int childCount = ((l0) eVar.a).getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ((l0) eVar.a).getChildAt(i10);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != L) {
                    layoutParams.height = L;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // te.i
    public final /* synthetic */ void a() {
    }

    @Override // rh.a
    public final void c(float f10) {
    }
}
