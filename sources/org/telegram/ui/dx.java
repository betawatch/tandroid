package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dx extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ gx f;

    public dx(gx gxVar, Context context) {
        this.f = gxVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 1 || i7 == 3;
    }

    @Override // v4.h0
    public final int b() {
        return this.f.w;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        gx gxVar = this.f;
        if (i7 == gxVar.h) {
            return 1;
        }
        return i7 == gxVar.s ? 0 : 3;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        gx gxVar = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == gxVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = gxVar.x;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751212, null));
                } else if (i11 == 1) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131751211, null));
                }
                if (org.telegram.messenger.gz.s.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742871, null)));
                }
                y8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Long l10 = (Long) gxVar.e.get(i7 - gxVar.n);
            long longValue = l10.longValue();
            if (org.telegram.messenger.m5.E(longValue)) {
                h4Var.e(gxVar.getMessagesController().a2(l10), null, null, i7 != gxVar.r - 1);
                return;
            } else {
                h4Var.e(gxVar.getMessagesController().M0(Long.valueOf(-longValue)), null, null, i7 != gxVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        l8Var.g(-1, org.telegram.ui.ActionBar.j6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.x(l8Var, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.q6.x(l8Var, drawable2, org.telegram.ui.ActionBar.j6.k7, null, mode);
        l8Var.p(org.telegram.messenger.hd.M0(2131745668, null), new org.telegram.ui.Components.fq(drawable, drawable2), gxVar.n != -1);
        l8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.q6.Z(y8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
            frameLayout = y8Var;
        } else if (i7 == 1) {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, null);
            frameLayout = l8Var;
        } else if (i7 != 2) {
            FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
            ImageView e10 = org.telegram.messenger.i20.e(context, R.drawable.list_reorder);
            e10.setScaleType(ImageView.ScaleType.CENTER);
            h4Var.setTag(R.id.object_tag, e10);
            int i10 = 5;
            h4Var.addView(e10, c8.ja.d(40, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            e10.setOnTouchListener(new hi.p1(i10, this, h4Var));
            org.telegram.ui.ActionBar.q6.s(e10, org.telegram.ui.ActionBar.j6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = h4Var;
        } else {
            gx gxVar = this.f;
            fx fxVar = new fx(gxVar, context);
            gxVar.f = fxVar;
            frameLayout = fxVar;
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f;
        if (i7 == 3 || i7 == 1) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, e1Var.a, null);
        }
    }
}
