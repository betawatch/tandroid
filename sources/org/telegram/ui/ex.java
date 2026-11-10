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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ex extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ hx f;

    public ex(hx hxVar, Context context) {
        this.f = hxVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 1 || i7 == 3;
    }

    @Override // v4.g0
    public final int b() {
        return this.f.w;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        hx hxVar = this.f;
        if (i7 == hxVar.h) {
            return 1;
        }
        return i7 == hxVar.s ? 0 : 3;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        hx hxVar = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == hxVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = hxVar.x;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751212, null));
                } else if (i11 == 1) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131751211, null));
                }
                if (org.telegram.messenger.iz.s.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131742871, null)));
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
            Long l10 = (Long) hxVar.e.get(i7 - hxVar.n);
            long longValue = l10.longValue();
            if (org.telegram.messenger.m5.E(longValue)) {
                h4Var.e(hxVar.getMessagesController().a2(l10), null, null, i7 != hxVar.r - 1);
                return;
            } else {
                h4Var.e(hxVar.getMessagesController().M0(Long.valueOf(-longValue)), null, null, i7 != hxVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.g(-1, org.telegram.ui.ActionBar.m6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i12 = org.telegram.ui.ActionBar.m6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(m8Var, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.t6.x(m8Var, drawable2, org.telegram.ui.ActionBar.m6.k7, null, mode);
        m8Var.p(org.telegram.messenger.id.M0(2131745668, null), new org.telegram.ui.Components.xp(drawable, drawable2), hxVar.n != -1);
        m8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.t6.Z(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
            frameLayout = z8Var;
        } else if (i7 == 1) {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, null);
            frameLayout = m8Var;
        } else if (i7 != 2) {
            FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.list_reorder);
            e10.setScaleType(ImageView.ScaleType.CENTER);
            h4Var.setTag(R.id.object_tag, e10);
            int i10 = 5;
            h4Var.addView(e10, c8.ha.d(40, -1.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            e10.setOnTouchListener(new fi.n1(i10, this, h4Var));
            org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = h4Var;
        } else {
            hx hxVar = this.f;
            gx gxVar = new gx(hxVar, context);
            hxVar.f = gxVar;
            frameLayout = gxVar;
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 == 3 || i7 == 1) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, d1Var.a, null);
        }
    }
}
