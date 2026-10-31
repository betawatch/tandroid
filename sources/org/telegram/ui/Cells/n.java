package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends View {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public final ArrayList e;
    public float f;
    public float h;
    public Integer n;

    public n(Context context) {
        super(context);
        this.e = new ArrayList();
        this.a = 20;
        this.b = 60;
        this.c = 60;
    }

    public final void a(sg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        String V;
        TLRPC.TL_availableReaction tL_availableReaction2 = o0Var.f != null ? (TLRPC.TL_availableReaction) ui.b0(d20.s0).r.get(o0Var.f) : null;
        if (tL_availableReaction2 == null) {
            document = org.telegram.ui.Components.f5.e(d20.s0, o0Var.g);
            if (document != null && (V = jj.V(document, null, null)) != null) {
                tL_availableReaction2 = (TLRPC.TL_availableReaction) ui.b0(d20.s0).r.get(V);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document != null || tL_availableReaction == null) {
            org.telegram.ui.Components.f5 m10 = document == null ? org.telegram.ui.Components.f5.m(2, o0Var.g, null, d20.s0) : org.telegram.ui.Components.f5.l(2, d20.s0, document);
            if (this.n != null) {
                m10.setColorFilter(new PorterDuffColorFilter(this.n.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            sg.d a2 = sg.d.a(m10, false, !m10.c());
            a2.f(this);
            arrayList.add(a2);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.H0(this);
        int i10 = this.d;
        this.d = i10 + 1;
        imageReceiver.v1 = Integer.toString(i10);
        ic b10 = ic.b(tL_availableReaction.around_animation);
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.b;
        sb2.append(i11);
        sb2.append("_");
        sb2.append(i11);
        sb2.append("_nolimit");
        imageReceiver.q0(b10, sb2.toString(), null, "tgs", tL_availableReaction, 1);
        imageReceiver.W(0);
        imageReceiver.P();
        arrayList.add(imageReceiver);
        invalidate();
    }

    public final void b(float f7, float f10) {
        setTranslationX(f7 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f10 - (getMeasuredHeight() / 2.0f);
        this.f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(this.c);
        int L2 = org.telegram.messenger.i0.L(this.b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f7 = L2;
                imageReceiver.y0((getMeasuredWidth() - L2) / 2.0f, (getMeasuredHeight() - L2) / 2.0f, f7, f7);
                imageReceiver.h(canvas, null);
            } else if (obj instanceof sg.d) {
                sg.d dVar = (sg.d) obj;
                dVar.e((int) ((getMeasuredWidth() - L) / 2.0f), (int) ((getMeasuredHeight() - L) / 2.0f), (int) ((getMeasuredWidth() + L) / 2.0f), (int) ((getMeasuredHeight() + L) / 2.0f));
                dVar.b(canvas);
                if (dVar.c()) {
                    dVar.d(this);
                    arrayList.remove(dVar);
                }
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).R();
                } else if (obj instanceof sg.d) {
                    ((sg.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int max = Math.max(this.a, this.b);
        int i12 = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(Math.max(i12, max)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(Math.max(i12, Math.max(r4, r5))), TLObject.FLAG_30));
    }

    public void setColor(int i10) {
        this.n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i11);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).o1 = porterDuffColorFilter;
            } else if (obj instanceof sg.d) {
                ((sg.d) obj).a.setColorFilter(porterDuffColorFilter2);
            }
            i11++;
        }
    }
}
