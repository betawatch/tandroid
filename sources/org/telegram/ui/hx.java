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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hx extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ kx f;

    public hx(kx kxVar, Context context) {
        this.f = kxVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 3;
    }

    @Override // v4.i0
    public final int b() {
        return this.f.w;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        kx kxVar = this.f;
        if (i7 == kxVar.h) {
            return 1;
        }
        return i7 == kxVar.s ? 0 : 3;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        kx kxVar = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == kxVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = kxVar.x;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751201, null));
                } else if (i11 == 1) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131751200, null));
                }
                if (org.telegram.messenger.bz.s.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131742613, null)));
                }
                z8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Long l10 = (Long) kxVar.e.get(i7 - kxVar.n);
            long longValue = l10.longValue();
            if (org.telegram.messenger.n5.E(longValue)) {
                h4Var.e(kxVar.getMessagesController().c2(l10), null, null, i7 != kxVar.r - 1);
                return;
            } else {
                h4Var.e(kxVar.getMessagesController().O0(Long.valueOf(-longValue)), null, null, i7 != kxVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.g(-1, org.telegram.ui.ActionBar.n6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i12 = org.telegram.ui.ActionBar.n6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(m8Var, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.u6.x(m8Var, drawable2, org.telegram.ui.ActionBar.n6.k7, null, mode);
        m8Var.p(org.telegram.messenger.gd.M0(2131745473, null), new org.telegram.ui.Components.mq(drawable, drawable2), kxVar.n != -1);
        m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.u6.Z(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
            frameLayout = z8Var;
        } else if (i7 == 1) {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var, null);
            frameLayout = m8Var;
        } else if (i7 != 2) {
            FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
            ImageView e10 = org.telegram.messenger.n10.e(context, R.drawable.list_reorder);
            e10.setScaleType(ImageView.ScaleType.CENTER);
            h4Var.setTag(R.id.object_tag, e10);
            h4Var.addView(e10, c8.ma.d(40, -1.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            e10.setOnTouchListener(new hi.p1(4, this, h4Var));
            org.telegram.ui.ActionBar.u6.s(e10, org.telegram.ui.ActionBar.n6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = h4Var;
        } else {
            kx kxVar = this.f;
            jx jxVar = new jx(kxVar, context);
            kxVar.f = jxVar;
            frameLayout = jxVar;
        }
        return new org.telegram.ui.Components.kj0(frameLayout);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 == 3 || i7 == 1) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, f1Var.a, null);
        }
    }
}
