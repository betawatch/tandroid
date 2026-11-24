// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hv3 extends q59 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ kv3 f;

    public hv3(kv3 kv3Var, Context context) {
        this.f = kv3Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 1 || i == 3;
    }

    @Override // y59
    public final int b() {
        return this.f.w;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        kv3 kv3Var = this.f;
        if (i == kv3Var.h) {
            return 1;
        }
        return i == kv3Var.s ? 0 : 3;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        kv3 kv3Var = this.f;
        if (i2 == 0) {
            njb njbVar = (njb) view;
            if (i == kv3Var.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = kv3Var.x;
                if (i3 == 0) {
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131751149, null));
                } else if (i3 == 1) {
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131751148, null));
                }
                if (gda.r.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gm.S2(jb6.M0(2131742534, null)));
                }
                njbVar.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 3) {
                xc5 xc5Var = (xc5) view;
                Long l = (Long) kv3Var.e.get(i - kv3Var.n);
                long longValue = l.longValue();
                if (pg3.D(longValue)) {
                    xc5Var.e(kv3Var.getMessagesController().W1(l), null, null, i != kv3Var.r - 1);
                    return;
                } else {
                    xc5Var.e(kv3Var.getMessagesController().L0(Long.valueOf(-longValue)), null, null, i != kv3Var.r - 1);
                    return;
                }
            }
            return;
        }
        xib xibVar = (xib) view;
        xibVar.g(-1, cmb.p6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i4 = cmb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(xibVar, drawable, i4, null, mode);
        anb.x(xibVar, drawable2, cmb.j7, null, mode);
        xibVar.p(jb6.M0(2131745402, null), new sn2(drawable, drawable2), kv3Var.n != -1);
        xibVar.getImageView().setPadding(0, gm.L(7.0f), 0, 0);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout njbVar = new njb(context);
            anb.Z(njbVar, context, R.drawable.greydivider_bottom, cmb.a7);
            frameLayout = njbVar;
        } else if (i != 1) {
            byte b = 2;
            if (i != 2) {
                FrameLayout xc5Var = new xc5(context, 0, 0, false);
                ImageView k = td4.k(context, R.drawable.list_reorder);
                k.setScaleType(ImageView.ScaleType.CENTER);
                xc5Var.setTag(R.id.object_tag, k);
                xc5Var.addView(k, qoe.d(40, -1.0f, (jb6.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                k.setOnTouchListener(new f8(this, xc5Var, b));
                anb.s(k, cmb.a9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout = xc5Var;
            } else {
                kv3 kv3Var = this.f;
                jv3 jv3Var = new jv3(kv3Var, context);
                kv3Var.f = jv3Var;
                frameLayout = jv3Var;
            }
        } else {
            FrameLayout xibVar = new xib(context);
            anb.h(cmb.c6, null, xibVar);
            frameLayout = xibVar;
        }
        return new b59(frameLayout);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        if (i == 3 || i == 1) {
            anb.h(cmb.c6, null, u69Var.a);
        }
    }
}
