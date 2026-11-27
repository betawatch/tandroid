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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class oq0 extends LinearLayout implements fp5, wa9 {
    public final vnb a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public lq0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final xa9 y;

    public oq0(Context context, vnb vnbVar) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new xa9(this, k43.h, 320L);
        this.a = vnbVar;
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

    @Override // fp5
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
        hl.u3(this.r, aob.v0(aob.zf, this.a));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((mq0) arrayList.get(i)).a();
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float Q0 = hl.Q0(this.s);
        if (Q0 > 0.0f) {
            int p1 = aob.p1(Q0, aob.v0(aob.zf, this.a));
            int i = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i != p1) {
                gradientDrawable.setColors(new int[]{p1, aob.p1(0.66f, p1), vm2.o(p1, 0)});
                this.x = p1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override // wa9
    public final void f(xa9 xa9Var) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            float c = y66Var.c();
            Object obj = y66Var.a;
            float R1 = hl.R1(0.7f, 1.0f, c);
            ((nq0) obj).setAlpha(c);
            ((nq0) obj).setScaleX(R1);
            ((nq0) obj).setScaleY(R1);
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
        return uh9.y(4.0f, this.c.rows.size() - 1, hl.L(16.0f) + (hl.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
                    grb.m(th);
                    return;
                }
            }
            this.c = tL_replyKeyboardMarkup;
            ArrayList arrayList = this.n;
            arrayList.clear();
            ScrollView scrollView = this.r;
            float scrollY = scrollView.getScrollY();
            xa9 xa9Var = this.y;
            Iterator it = xa9Var.iterator();
            while (it.hasNext()) {
                nq0 nq0Var = (nq0) ((y66) it.next()).a;
                nq0Var.setTranslationY(nq0Var.getTranslationY() - scrollY);
            }
            int i = 0;
            scrollView.scrollTo(0, 0);
            if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
                xa9Var.a.m(null, true);
                return;
            }
            nq0 nq0Var2 = new nq0(getContext());
            nq0Var2.setOrientation(1);
            float f = 0.0f;
            nq0Var2.setAlpha(0.0f);
            this.b.addView(nq0Var2);
            boolean z = tL_replyKeyboardMarkup.resize;
            this.f = !z;
            float f2 = 4.0f;
            this.h = z ? 44 : (int) Math.max(44.0f, (((this.e - hl.L(16.0f)) - (hl.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / hl.p);
            int i2 = 0;
            while (i2 < tL_replyKeyboardMarkup.rows.size()) {
                TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i2);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(i);
                nq0Var2.addView(linearLayout, tre.k(8.0f, i2 == 0 ? 8.0f : f2, 8.0f, i2 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f, -1, this.h));
                float size = 1.0f / keyboardButtonRow.buttons.size();
                int i3 = i;
                while (i3 < keyboardButtonRow.buttons.size()) {
                    mq0 mq0Var = new mq0(this, getContext(), keyboardButtonRow.buttons.get(i3));
                    boolean z2 = i3 == 0;
                    boolean z3 = i2 == 0;
                    boolean z4 = i3 == keyboardButtonRow.buttons.size() - 1;
                    boolean z5 = i2 == tL_replyKeyboardMarkup.rows.size() - 1;
                    mq0Var.d = z2;
                    mq0Var.e = z3;
                    mq0Var.f = z4;
                    mq0Var.h = z5;
                    mq0Var.a();
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.addView(mq0Var, tre.c(-1.0f, -1));
                    linearLayout.addView(frameLayout, tre.m(size, 0, -1, 0, i3 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                    mq0Var.setOnClickListener(new k1(this, (byte) 18));
                    iye.b(mq0Var, 0.02f, 1.5f);
                    arrayList.add(mq0Var);
                    mq0Var.a();
                    i3++;
                }
                i2++;
                i = 0;
                f = 0.0f;
                f2 = 4.0f;
            }
            xa9Var.h(nq0Var2, true);
        }
    }

    public void setDelegate(lq0 lq0Var) {
        this.d = lq0Var;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (((this.e - hl.L(16.0f)) - (hl.L(4.0f) * (this.c.rows.size() - 1))) / this.c.rows.size()) / hl.p);
        this.h = max;
        int L = hl.L(max);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            int childCount = ((nq0) y66Var.a).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ((nq0) y66Var.a).getChildAt(i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != L) {
                    layoutParams.height = L;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // wa9
    public final void c() {
    }

    @Override // fp5
    public final void b(float f) {
    }
}
