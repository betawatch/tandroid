package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bi extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public bi(ViewGroup viewGroup, int i7) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.hf0(this, 0);
        this.d = viewGroup;
        this.b = i7;
    }

    public void a() {
        org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = this.b;
        if (isEmpty && getVisibility() != 8) {
            org.telegram.messenger.qs.f(i7).e.remove(hf0Var);
            org.telegram.messenger.qs.f(i7).d(hf0Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            org.telegram.messenger.qs.f(i7).e.remove(hf0Var);
            setVisibility(0);
        }
    }

    public void b(sh.d dVar, boolean z9) {
        sh.d dVar2;
        sh.d dVar3;
        ((te.a) this.d).a(dVar != null, z9);
        if (isAttachedToWindow() && (dVar3 = (sh.d) this.e) != null) {
            dVar3.b();
        }
        this.e = dVar;
        if (!isAttachedToWindow() || (dVar2 = (sh.d) this.e) == null) {
            return;
        }
        dVar2.a(this);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                sh.d dVar = (sh.d) this.e;
                if (dVar != null) {
                    dVar.a(this);
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
                sh.d dVar = (sh.d) this.e;
                if (dVar != null) {
                    dVar.b();
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
                bg.c0 c0Var = (bg.c0) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                int i7 = this.b;
                c0Var.b(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                c0Var.draw(canvas);
                bg.c0 c0Var2 = (bg.c0) this.e;
                c0Var2.b(org.telegram.ui.ActionBar.m6.r1(0.95f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                c0Var2.draw(canvas);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.if0) arrayList.get(i10)).a(canvas);
                    }
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.d).e;
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
                    sh.d dVar = (sh.d) this.e;
                    if (dVar != null) {
                        dVar.c(canvas, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12));
                    }
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = org.telegram.messenger.g0.m;
                bg.c0 c0Var = (bg.c0) this.d;
                c0Var.c(org.telegram.messenger.g0.L(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i7, org.telegram.messenger.g0.L(52.0f) + i13);
                bg.c0 c0Var2 = (bg.c0) this.e;
                c0Var2.c(i13 / 3, 0);
                c0Var2.setBounds(0, 0, i7, i13);
                break;
            case 1:
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(24.0f);
                int i14 = (i7 - L) / 2;
                int i15 = (i10 - L) / 2;
                ((Drawable) this.c).setBounds(i14, i15, i14 + L, L + i15);
                break;
        }
    }

    public bi(Context context, int i7) {
        super(context);
        this.d = new te.a(this, wq.h, 380L);
        this.b = i7;
        Drawable h = jg.g.h(context, R.drawable.outline_poll_attach_24);
        this.c = h;
        org.telegram.ui.ActionBar.t6.x(this, h, org.telegram.ui.ActionBar.m6.o7, null, PorterDuff.Mode.SRC_IN);
    }

    public bi(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = new bg.c0(2);
        this.e = new bg.c0(2);
        this.c = h6Var;
        this.b = i7;
    }
}
