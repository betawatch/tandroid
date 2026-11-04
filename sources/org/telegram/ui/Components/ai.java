package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ai extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public ai(ViewGroup viewGroup, int i3) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.fz(this, 29);
        this.d = viewGroup;
        this.b = i3;
    }

    public void a() {
        org.telegram.ui.fz fzVar = (org.telegram.ui.fz) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i3 = this.b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.hs.f(i3).e.remove(fzVar);
            org.telegram.messenger.hs.f(i3).d(fzVar);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            org.telegram.messenger.hs.f(i3).e.remove(fzVar);
            setVisibility(0);
        }
    }

    public void b(th.c cVar, boolean z10) {
        th.c cVar2;
        th.c cVar3;
        ((qe.a) this.d).a(cVar != null, z10);
        if (isAttachedToWindow() && (cVar3 = (th.c) this.e) != null) {
            cVar3.b();
        }
        this.e = cVar;
        if (!isAttachedToWindow() || (cVar2 = (th.c) this.e) == null) {
            return;
        }
        cVar2.a(this);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                th.c cVar = (th.c) this.e;
                if (cVar != null) {
                    cVar.a(this);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                super.onDetachedFromWindow();
                th.c cVar = (th.c) this.e;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                cg.b0 b0Var = (cg.b0) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                int i3 = this.b;
                b0Var.b(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                b0Var.draw(canvas);
                cg.b0 b0Var2 = (cg.b0) this.e;
                b0Var2.b(org.telegram.ui.ActionBar.k6.r1(0.95f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                b0Var2.draw(canvas);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.ze0) arrayList.get(i10)).a(canvas);
                    }
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((qe.a) this.d).e;
                if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    canvas.scale(f11, f11, width, height);
                    ((Drawable) this.c).draw(canvas);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    float f12 = this.b;
                    int L = org.telegram.messenger.g0.L(f12);
                    int width2 = (getWidth() - L) / 2;
                    int height2 = (getHeight() - L) / 2;
                    canvas.save();
                    canvas.translate(width2, height2);
                    canvas.scale(f10, f10, org.telegram.messenger.g0.L(f12) / 2.0f, org.telegram.messenger.g0.L(f12) / 2.0f);
                    th.c cVar = (th.c) this.e;
                    if (cVar != null) {
                        cVar.c(canvas, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
                    }
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.m;
                cg.b0 b0Var = (cg.b0) this.d;
                b0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                b0Var.setBounds(0, 0, i3, org.telegram.messenger.g0.L(52.0f) + i13);
                cg.b0 b0Var2 = (cg.b0) this.e;
                b0Var2.c(i13 / 3, 0);
                b0Var2.setBounds(0, 0, i3, i13);
                break;
            case 1:
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(24.0f);
                int i14 = (i3 - L) / 2;
                int i15 = (i10 - L) / 2;
                ((Drawable) this.c).setBounds(i14, i15, i14 + L, L + i15);
                break;
        }
    }

    public ai(Context context, int i3) {
        super(context);
        this.d = new qe.a(this, xq.h, 380L);
        this.b = i3;
        Drawable g7 = k2.p1.g(context, R.drawable.outline_poll_attach_24);
        this.c = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.o7, null, PorterDuff.Mode.SRC_IN);
    }

    public ai(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = new cg.b0(2);
        this.e = new cg.b0(2);
        this.c = e6Var;
        this.b = i3;
    }
}
