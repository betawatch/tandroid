package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.k5;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m0 extends LinearLayout implements sh.a, qe.i {
    public final e6 a;
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
    public final qe.j y;

    public m0(Context context, e6 e6Var) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new qe.j(this, xq.h, 320L);
        this.a = e6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override // qe.i
    public final void b(qe.j jVar) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c2);
            ((l0) obj).setAlpha(c2);
            ((l0) obj).setScaleX(T1);
            ((l0) obj).setScaleY(T1);
        }
    }

    @Override // sh.a
    public final void c(int i3) {
        if (this.s == i3) {
            return;
        }
        this.s = i3;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i3) {
            scrollView.setPadding(0, 0, 0, i3);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.g0.R0(this.s);
        if (R0 > 0.0f) {
            int r12 = k6.r1(R0, k6.w0(k6.wf, this.a));
            int i3 = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i3 != r12) {
                gradientDrawable.setColors(new int[]{r12, k6.r1(0.66f, r12), i0.a.o(r12, 0)});
                this.x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        org.telegram.messenger.g0.z3(this.r, k6.w0(k6.wf, this.a));
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i3 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((k0) arrayList.get(i3)).a();
                i3++;
            }
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
        return k5.D(4.0f, this.c.rows.size() - 1, org.telegram.messenger.g0.L(16.0f) + (org.telegram.messenger.g0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        qe.j jVar = this.y;
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) ((qe.e) it.next()).a;
            l0Var.setTranslationY(l0Var.getTranslationY() - scrollY);
        }
        int i3 = 0;
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
        this.h = z10 ? 44 : (int) Math.max(44.0f, (org.telegram.messenger.camera.q.A(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.g0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.g0.p);
        int i10 = 0;
        while (i10 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i10);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i3);
            l0Var2.addView(linearLayout, mf.k(8.0f, i10 == 0 ? 8.0f : f11, 8.0f, i10 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f10, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i11 = i3;
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
                frameLayout.addView(k0Var, mf.c(-1.0f, -1));
                linearLayout.addView(frameLayout, mf.m(size, 0, -1, 0, i11 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                k0Var.setOnClickListener(new m(this, 1));
                pf.b(k0Var, 0.02f, 1.5f);
                arrayList.add(k0Var);
                k0Var.a();
                i11++;
            }
            i10++;
            i3 = 0;
            f10 = 0.0f;
            f11 = 4.0f;
        }
        jVar.h(l0Var2, true);
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i3;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (org.telegram.messenger.camera.q.A(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.g0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.g0.p);
        this.h = max;
        int L = org.telegram.messenger.g0.L(max);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
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

    @Override // sh.a
    public final void d(float f10) {
    }

    @Override // qe.i
    public final /* synthetic */ void a() {
    }
}
