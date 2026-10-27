package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class u0 extends LinearLayout implements rh.a, oe.k {
    public final u6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public r0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable v;
    public int w;
    public final oe.l x;

    public u0(Context context, u6 u6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new oe.l(this, ds.h, 320L);
        this.a = u6Var;
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

    @Override // oe.k
    public final void b(oe.l lVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((t0) obj).setAlpha(c10);
            ((t0) obj).setScaleX(lerp);
            ((t0) obj).setScaleY(lerp);
        }
    }

    @Override // rh.a
    public final void c(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int o12 = y6.o1(navigationBarThirdButtonsFactor, y6.w0(y6.He, this.a));
            int i10 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != o12) {
                gradientDrawable.setColors(new int[]{o12, y6.o1(0.66f, o12), i0.a.o(o12, 0)});
                this.w = o12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, y6.w0(y6.He, this.a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((s0) arrayList.get(i10)).a();
                i10++;
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
        return wh.b(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        oe.l lVar = this.x;
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) ((oe.g) it.next()).a;
            t0Var.setTranslationY(t0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            lVar.a.q(null, true);
            return;
        }
        t0 t0Var2 = new t0(getContext());
        t0Var2.setOrientation(1);
        float f7 = 0.0f;
        t0Var2.setAlpha(0.0f);
        this.b.addView(t0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        float f10 = 4.0f;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (wh.C(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            t0Var2.addView(linearLayout, kb1.o(8.0f, i11 == 0 ? 8.0f : f10, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f7, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = i10;
            while (i12 < keyboardButtonRow.buttons.size()) {
                s0 s0Var = new s0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z11 = i12 == 0;
                boolean z12 = i11 == 0;
                boolean z13 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                s0Var.d = z11;
                s0Var.e = z12;
                s0Var.f = z13;
                s0Var.h = z14;
                s0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(s0Var, kb1.g(-1.0f, -1));
                linearLayout.addView(frameLayout, kb1.q(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                s0Var.setOnClickListener(new ai.s(this, 27));
                kb1.c(s0Var, 0.02f, 1.5f);
                arrayList.add(s0Var);
                s0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
            f7 = 0.0f;
            f10 = 4.0f;
        }
        lVar.h(t0Var2, true);
    }

    public void setDelegate(r0 r0Var) {
        this.d = r0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i10;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (wh.C(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        this.h = max;
        int dp = AndroidUtilities.dp(max);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            int childCount = ((t0) gVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((t0) gVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // rh.a
    public final void d(float f7) {
    }

    @Override // oe.k
    public final /* synthetic */ void a() {
    }
}
