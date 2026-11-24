// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class md4 extends ka {
    public final Context d;
    public final /* synthetic */ pd4 e;

    public md4(pd4 pd4Var, Context context) {
        this.e = pd4Var;
        this.d = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 3 || i == 0 || i == 2 || i == 5 || i == 9 || i == 11) ? false : true;
    }

    @Override // w39
    public final int b() {
        return this.e.Q.size();
    }

    @Override // w39
    public final int d(int i) {
        gd4 gd4Var = (gd4) this.e.Q.get(i);
        if (gd4Var == null) {
            return 3;
        }
        return gd4Var.a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String M0;
        int i2;
        pd4 pd4Var = this.e;
        ArrayList arrayList = pd4Var.Q;
        gd4 gd4Var = (gd4) arrayList.get(i);
        if (gd4Var != null) {
            int i3 = i + 1;
            boolean z = false;
            boolean z2 = (i3 >= arrayList.size() || (i2 = ((gd4) arrayList.get(i3)).a) == 3 || i2 == 6) ? false : true;
            int i4 = s49Var.f;
            View view = s49Var.a;
            if (i4 == 0) {
                ld5 ld5Var = (ld5) view;
                boolean z3 = gd4Var.f;
                String str = gd4Var.d;
                if (z3) {
                    ld5Var.setText(pd4.D0(0, str, false));
                    return;
                } else {
                    ld5Var.setText(str);
                    return;
                }
            }
            if (i4 == 1) {
                v6c v6cVar = (v6c) view;
                String str2 = gd4Var.i;
                if (str2 != null) {
                    v6cVar.d(str2, gd4Var.d, null, z2);
                    return;
                }
                long j = gd4Var.h;
                if (j > 0) {
                    TLRPC.User V1 = pd4Var.getMessagesController().V1(Long.valueOf(j));
                    if (V1 != null) {
                        v6cVar.d(V1, null, V1.bot ? k96.M0(2131753153, null) : V1.contact ? k96.M0(2131750780, null) : k96.M0(2131750707, null), z2);
                        return;
                    }
                    return;
                }
                TLRPC.Chat K0 = pd4Var.getMessagesController().K0(Long.valueOf(-j));
                if (K0 != null) {
                    if (hc2.Y(K0)) {
                        M0 = k96.M0(2131751978, null);
                    } else if (K0.participants_count != 0) {
                        boolean V = hc2.V(K0);
                        int i5 = K0.participants_count;
                        M0 = V ? k96.H(',', "Subscribers", i5) : k96.H(',', "Members", i5);
                    } else {
                        M0 = !hc2.t0(K0) ? (!hc2.T(K0) || K0.megagroup) ? k96.M0(2131748449, null) : k96.M0(2131752317, null) : (!hc2.T(K0) || K0.megagroup) ? k96.M0(2131748446, null) : k96.M0(2131752306, null);
                    }
                    v6cVar.d(K0, null, M0, z2);
                    return;
                }
                return;
            }
            if (i4 != 4) {
                switch (i4) {
                    case 6:
                        ((mhb) view).setText(gd4Var.d);
                        break;
                    case 7:
                        ((jd4) view).e(gd4Var.m, z2);
                        break;
                    case 8:
                        yc4 yc4Var = (yc4) view;
                        if (yc4Var.c != z2) {
                            yc4Var.c = z2;
                            yc4Var.setWillNotDraw(!z2);
                            break;
                        }
                        break;
                    case 9:
                        ed4 ed4Var = (ed4) view;
                        pd4Var.J = ed4Var;
                        ed4Var.e(gm.cloneSpans(pd4Var.x, -1, ed4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                        pd4Var.J.d(pd4Var.getUserConfig().p() ? pd4Var.F : -1, false);
                        pd4Var.J.setText(k96.M0(2131750605, null));
                        break;
                    case 10:
                        w08 w08Var = (w08) view;
                        w08Var.setCloseAsLock(!pd4Var.getUserConfig().p());
                        w08Var.a(pd4Var.getUserConfig().p() ? pd4Var.F : -1, false);
                        w08Var.setOnColorClick(new pz1(this, w08Var, (byte) 20));
                        break;
                    case 11:
                        fd4 fd4Var = (fd4) view;
                        pd4Var.K = fd4Var;
                        fd4Var.setText(gd4Var.d);
                        ri riVar = fd4Var.r;
                        riVar.setText(gd4Var.e);
                        riVar.setOnClickListener(gd4Var.c);
                        break;
                }
                return;
            }
            wc4 wc4Var = (wc4) view;
            boolean z4 = gd4Var.l;
            ImageView imageView = wc4Var.a;
            TextView textView = wc4Var.b;
            zkb.s(imageView, z4 ? bkb.p7 : bkb.n6, null, PorterDuff.Mode.MULTIPLY);
            zkb.X(textView, z4 ? bkb.o7 : bkb.p6, null);
            int i6 = gd4Var.k;
            String str3 = gd4Var.d;
            ImageView imageView2 = wc4Var.a;
            int i7 = k96.a0 ? -1 : 1;
            if (i6 == 0) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageResource(i6);
            }
            if (k96.a0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = gl.L(i6 == 0 ? 24.0f : 72.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = gl.L(i6 == 0 ? 24.0f : 72.0f);
            }
            textView.setText(str3);
            if (!z2 && i6 != 0) {
                z = true;
            }
            Boolean bool = wc4Var.e;
            if (bool == null || bool.booleanValue() != z) {
                wc4Var.e = Boolean.valueOf(z);
                if (wc4Var.c == i6) {
                    textView.clearAnimation();
                    textView.animate().translationX(z ? gl.L(i7 * (-7)) : 0.0f).setDuration(180L).setInterpolator(s33.h).start();
                } else {
                    textView.setTranslationX(z ? gl.L(i7 * (-7)) : 0.0f);
                }
            }
            wc4Var.d = z2;
            wc4Var.setWillNotDraw(!z2);
            wc4Var.c = i6;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        int i2;
        View view;
        int i3;
        int i4;
        int i5;
        wjb wjbVar2;
        wjb wjbVar3;
        Context context = this.d;
        pd4 pd4Var = this.e;
        switch (i) {
            case 0:
                view = new ld5(context, 22);
                break;
            case 1:
                v6c v6cVar = new v6c(context, 6, 0, false);
                v6cVar.setSelfAsSavedMessages(true);
                view = v6cVar;
                break;
            case 2:
                cja cjaVar = (cja) pd4Var.fragmentView;
                String M0 = k96.M0(2131750720, null);
                wjbVar = ((d) pd4Var).resourceProvider;
                kd4 kd4Var = new kd4(this.d, cjaVar, M0, false, 12, wjbVar);
                pd4Var.L = kd4Var;
                kd4Var.r = false;
                kd4Var.s = true;
                ts3 ts3Var = kd4Var.b;
                ts3Var.getEditText().setEmojiColor(Integer.valueOf(pd4Var.getThemedColor(bkb.Ei)));
                ts3Var.setEmojiViewCacheType(25);
                ts3Var.setText(pd4Var.x);
                i2 = ((d) pd4Var).currentAccount;
                vl.r(i2, pd4Var.y);
                gt3 editText = ts3Var.getEditText();
                editText.addTextChangedListener(new fi());
                editText.addTextChangedListener(new b7(this, (byte) 23));
                editText.setPadding(gl.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                ts3Var.getEditText().setImeOptions(268435462);
                view = kd4Var;
                break;
            case 3:
                view = new b9a(context, (de9) null);
                break;
            case 4:
                wc4 wc4Var = new wc4(context);
                wc4Var.d = true;
                wc4Var.e = null;
                ImageView imageView = new ImageView(context);
                wc4Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                wc4Var.addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                wc4Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                int i6 = 24;
                if (k96.a0) {
                    i3 = 24;
                    i6 = 0;
                } else {
                    i3 = 0;
                }
                textView.setPadding(i3, 0, i6, 0);
                textView.setGravity(k96.a0 ? 5 : 3);
                boolean z = k96.a0;
                wc4Var.addView(textView, nme.d(-1, -2.0f, 23, z ? 0.0f : 72.0f, 0.0f, z ? 72.0f : 0.0f, 0.0f));
                view = wc4Var;
                break;
            case 5:
                yc ycVar = new yc(context, (byte) 21);
                ry8 ry8Var = new ry8(context);
                ycVar.b = ry8Var;
                ry8Var.f(R.raw.filter_new, 100, 100, null);
                ry8Var.setScaleType(ImageView.ScaleType.CENTER);
                ry8Var.d();
                ycVar.addView(ry8Var, nme.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                ry8Var.setOnClickListener(new yj3(ycVar, (byte) 11));
                view = ycVar;
                break;
            case 6:
            default:
                view = new mhb(context);
                break;
            case 7:
                i4 = ((d) pd4Var).currentAccount;
                view = new ld4(this, this.d, pd4Var, i4, pd4Var.r.a);
                break;
            case 8:
                view = new yc4(context);
                break;
            case 9:
                view = new ed4(pd4Var, context);
                break;
            case 10:
                Activity parentActivity = pd4Var.getParentActivity();
                i5 = ((d) pd4Var).currentAccount;
                wjbVar2 = ((d) pd4Var).resourceProvider;
                view = new w08(2, i5, wjbVar2, parentActivity);
                break;
            case 11:
                wjbVar3 = ((d) pd4Var).resourceProvider;
                view = new fd4(context, wjbVar3);
                break;
        }
        return new y29(view);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        if (i == 2 || i != 9) {
            return;
        }
        ed4 ed4Var = (ed4) s49Var.a;
        pd4 pd4Var = this.e;
        ed4Var.e(gm.cloneSpans(pd4Var.x, -1, pd4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
    }

    @Override // w39
    public final void z(s49 s49Var) {
        if (s49Var.f == 2) {
            ws3 ws3Var = (ws3) s49Var.a;
            ws3Var.b.k(true);
            ws3Var.b.d();
        }
    }
}
