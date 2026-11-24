// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class or0 extends LinearLayout implements cp5, l99 {
    public final ylb a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public lr0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final m99 y;

    public or0(Context context, ylb ylbVar) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new m99(this, d53.h, 320L);
        this.a = ylbVar;
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

    @Override // cp5
    public final void a(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i) {
            scrollView.setPadding(0, 0, 0, i);
        }
        invalidate();
    }

    public final void d() {
        gm.u3(this.r, cmb.v0(cmb.yf, this.a));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((mr0) arrayList.get(i)).a();
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float Q0 = gm.Q0(this.s);
        if (Q0 > 0.0f) {
            int p1 = cmb.p1(Q0, cmb.v0(cmb.yf, this.a));
            int i = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i != p1) {
                gradientDrawable.setColors(new int[]{p1, cmb.p1(0.66f, p1), on2.p(p1, 0)});
                this.x = p1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override // l99
    public final void e(m99 m99Var) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            float c = u66Var.c();
            Object obj = u66Var.a;
            float R1 = gm.R1(0.7f, 1.0f, c);
            ((nr0) obj).setAlpha(c);
            ((nr0) obj).setScaleX(R1);
            ((nr0) obj).setScaleY(R1);
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
        return hg9.y(4.0f, this.c.rows.size() - 1, gm.L(16.0f) + (gm.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r4 <= 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r6.readByte(true) != r7.readByte(true)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.c;
        if (tL_replyKeyboardMarkup != tL_replyKeyboardMarkup2) {
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
                } catch (Throwable th) {
                    rjb.m(th);
                    return;
                }
            }
            this.c = tL_replyKeyboardMarkup;
            ArrayList arrayList = this.n;
            arrayList.clear();
            ScrollView scrollView = this.r;
            float scrollY = scrollView.getScrollY();
            m99 m99Var = this.y;
            Iterator it = m99Var.iterator();
            while (it.hasNext()) {
                nr0 nr0Var = (nr0) ((u66) it.next()).a;
                nr0Var.setTranslationY(nr0Var.getTranslationY() - scrollY);
            }
            int i = 0;
            scrollView.scrollTo(0, 0);
            if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
                m99Var.a.m(null, true);
                return;
            }
            nr0 nr0Var2 = new nr0(getContext());
            nr0Var2.setOrientation(1);
            float f = 0.0f;
            nr0Var2.setAlpha(0.0f);
            this.b.addView(nr0Var2);
            boolean z = tL_replyKeyboardMarkup.resize;
            this.f = !z;
            float f2 = 4.0f;
            this.h = z ? 44 : (int) Math.max(44.0f, (((this.e - gm.L(16.0f)) - (gm.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / gm.p);
            int i2 = 0;
            while (i2 < tL_replyKeyboardMarkup.rows.size()) {
                TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i2);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(i);
                nr0Var2.addView(linearLayout, qoe.k(8.0f, i2 == 0 ? 8.0f : f2, 8.0f, i2 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f, -1, this.h));
                float size = 1.0f / keyboardButtonRow.buttons.size();
                int i3 = i;
                while (i3 < keyboardButtonRow.buttons.size()) {
                    mr0 mr0Var = new mr0(this, getContext(), keyboardButtonRow.buttons.get(i3));
                    boolean z2 = i3 == 0;
                    boolean z3 = i2 == 0;
                    boolean z4 = i3 == keyboardButtonRow.buttons.size() - 1;
                    boolean z5 = i2 == tL_replyKeyboardMarkup.rows.size() - 1;
                    mr0Var.d = z2;
                    mr0Var.e = z3;
                    mr0Var.f = z4;
                    mr0Var.h = z5;
                    mr0Var.a();
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.addView(mr0Var, qoe.c(-1.0f, -1));
                    linearLayout.addView(frameLayout, qoe.m(size, 0, -1, 0, i3 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                    mr0Var.setOnClickListener(new j1(this, (byte) 19));
                    rve.b(mr0Var, 0.02f, 1.5f);
                    arrayList.add(mr0Var);
                    mr0Var.a();
                    i3++;
                }
                i2++;
                i = 0;
                f = 0.0f;
                f2 = 4.0f;
            }
            m99Var.h(nr0Var2, true);
        }
    }

    public void setDelegate(lr0 lr0Var) {
        this.d = lr0Var;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (((this.e - gm.L(16.0f)) - (gm.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / gm.p);
        this.h = max;
        int L = gm.L(max);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            int childCount = ((nr0) u66Var.a).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ((nr0) u66Var.a).getChildAt(i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != L) {
                    layoutParams.height = L;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // cp5
    public final void b(float f) {
    }

    @Override // l99
    public final void c() {
    }
}
