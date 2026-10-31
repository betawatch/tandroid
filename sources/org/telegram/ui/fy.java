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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fy extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ iy f;

    public fy(iy iyVar, Context context) {
        this.f = iyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // s4.g0
    public final int b() {
        return this.f.w;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        iy iyVar = this.f;
        if (i10 == iyVar.h) {
            return 1;
        }
        return i10 == iyVar.s ? 0 : 3;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        iy iyVar = this.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == iyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = iyVar.x;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131751213, null));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131751212, null));
                }
                if (org.telegram.messenger.tz.s.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131742896, null)));
                }
                b9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            Long l4 = (Long) iyVar.e.get(i10 - iyVar.n);
            long longValue = l4.longValue();
            if (org.telegram.messenger.o5.E(longValue)) {
                j4Var.e(iyVar.getMessagesController().Z1(l4), null, null, i10 != iyVar.r - 1);
                return;
            } else {
                j4Var.e(iyVar.getMessagesController().L0(Long.valueOf(-longValue)), null, null, i10 != iyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        p8Var.g(-1, org.telegram.ui.ActionBar.t6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i13 = org.telegram.ui.ActionBar.t6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(p8Var, drawable, i13, null, mode);
        org.telegram.ui.ActionBar.a7.y(p8Var, drawable2, org.telegram.ui.ActionBar.t6.k7, null, mode);
        p8Var.p(org.telegram.messenger.cd.L0(2131745685, null), new org.telegram.ui.Components.eq(drawable, drawable2), iyVar.n != -1);
        p8Var.getImageView().setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
            org.telegram.ui.ActionBar.a7.a0(b9Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
            frameLayout = b9Var;
        } else if (i10 == 1) {
            FrameLayout p8Var = new org.telegram.ui.Cells.p8(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, null);
            frameLayout = p8Var;
        } else if (i10 != 2) {
            FrameLayout j4Var = new org.telegram.ui.Cells.j4(context, 0, 0, false);
            ImageView e = org.telegram.messenger.z20.e(context, R.drawable.list_reorder);
            e.setScaleType(ImageView.ScaleType.CENTER);
            j4Var.setTag(R.id.object_tag, e);
            j4Var.addView(e, w7.b6.d(40, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            e.setOnTouchListener(new org.telegram.ui.ActionBar.d1(4, this, j4Var));
            org.telegram.ui.ActionBar.a7.t(e, org.telegram.ui.ActionBar.t6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = j4Var;
        } else {
            iy iyVar = this.f;
            hy hyVar = new hy(iyVar, context);
            iyVar.f = hyVar;
            frameLayout = hyVar;
        }
        return new org.telegram.ui.Components.ck0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 == 1) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, c1Var.a, null);
        }
    }
}
