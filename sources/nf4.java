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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nf4 extends ka {
    public final Context d;
    public final /* synthetic */ qf4 e;

    public nf4(qf4 qf4Var, Context context) {
        this.e = qf4Var;
        this.d = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 3 || i == 0 || i == 2 || i == 5 || i == 9 || i == 11) ? false : true;
    }

    @Override // y59
    public final int b() {
        return this.e.Q.size();
    }

    @Override // y59
    public final int d(int i) {
        gf4 gf4Var = (gf4) this.e.Q.get(i);
        if (gf4Var == null) {
            return 3;
        }
        return gf4Var.a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String M0;
        int i2;
        qf4 qf4Var = this.e;
        ArrayList arrayList = qf4Var.Q;
        gf4 gf4Var = (gf4) arrayList.get(i);
        if (gf4Var != null) {
            int i3 = i + 1;
            boolean z = false;
            boolean z2 = (i3 >= arrayList.size() || (i2 = ((gf4) arrayList.get(i3)).a) == 3 || i2 == 6) ? false : true;
            int i4 = u69Var.f;
            View view = u69Var.a;
            if (i4 == 0) {
                jf5 jf5Var = (jf5) view;
                boolean z3 = gf4Var.f;
                String str = gf4Var.d;
                if (z3) {
                    jf5Var.setText(qf4.E0(0, str, false));
                    return;
                } else {
                    jf5Var.setText(str);
                    return;
                }
            }
            if (i4 == 1) {
                w8c w8cVar = (w8c) view;
                String str2 = gf4Var.i;
                if (str2 != null) {
                    w8cVar.d(str2, gf4Var.d, null, z2);
                    return;
                }
                long j = gf4Var.h;
                if (j > 0) {
                    TLRPC.User W1 = qf4Var.getMessagesController().W1(Long.valueOf(j));
                    if (W1 != null) {
                        w8cVar.d(W1, null, W1.bot ? jb6.M0(2131753121, null) : W1.contact ? jb6.M0(2131750729, null) : jb6.M0(2131750656, null), z2);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = qf4Var.getMessagesController().L0(Long.valueOf(-j));
                if (L0 != null) {
                    if (sd2.Y(L0)) {
                        M0 = jb6.M0(2131751927, null);
                    } else if (L0.participants_count != 0) {
                        boolean V = sd2.V(L0);
                        int i5 = L0.participants_count;
                        M0 = V ? jb6.H(',', "Subscribers", i5) : jb6.H(',', "Members", i5);
                    } else {
                        M0 = !sd2.t0(L0) ? (!sd2.T(L0) || L0.megagroup) ? jb6.M0(2131748398, null) : jb6.M0(2131752271, null) : (!sd2.T(L0) || L0.megagroup) ? jb6.M0(2131748395, null) : jb6.M0(2131752260, null);
                    }
                    w8cVar.d(L0, null, M0, z2);
                    return;
                }
                return;
            }
            if (i4 != 4) {
                switch (i4) {
                    case 6:
                        ((njb) view).setText(gf4Var.d);
                        break;
                    case 7:
                        ((kf4) view).e(gf4Var.m, z2);
                        break;
                    case 8:
                        ye4 ye4Var = (ye4) view;
                        if (ye4Var.c != z2) {
                            ye4Var.c = z2;
                            ye4Var.setWillNotDraw(!z2);
                            break;
                        }
                        break;
                    case 9:
                        ef4 ef4Var = (ef4) view;
                        qf4Var.J = ef4Var;
                        ef4Var.e(gn.cloneSpans(qf4Var.x, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                        qf4Var.J.d(qf4Var.getUserConfig().p() ? qf4Var.F : -1, false);
                        qf4Var.J.setText(jb6.M0(2131750554, null));
                        break;
                    case 10:
                        z28 z28Var = (z28) view;
                        z28Var.setCloseAsLock(!qf4Var.getUserConfig().p());
                        z28Var.a(qf4Var.getUserConfig().p() ? qf4Var.F : -1, false);
                        z28Var.setOnColorClick(new qy1(this, z28Var, (byte) 21));
                        break;
                    case 11:
                        ff4 ff4Var = (ff4) view;
                        qf4Var.K = ff4Var;
                        ff4Var.setText(gf4Var.d);
                        rj rjVar = ff4Var.r;
                        rjVar.setText(gf4Var.e);
                        rjVar.setOnClickListener(gf4Var.c);
                        break;
                }
                return;
            }
            we4 we4Var = (we4) view;
            boolean z4 = gf4Var.l;
            ImageView imageView = we4Var.a;
            TextView textView = we4Var.b;
            anb.s(imageView, z4 ? cmb.p7 : cmb.n6, null, PorterDuff.Mode.MULTIPLY);
            anb.X(textView, z4 ? cmb.o7 : cmb.p6, null);
            int i6 = gf4Var.k;
            String str3 = gf4Var.d;
            ImageView imageView2 = we4Var.a;
            int i7 = jb6.a0 ? -1 : 1;
            if (i6 == 0) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageResource(i6);
            }
            if (jb6.a0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = gm.L(i6 == 0 ? 24.0f : 72.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = gm.L(i6 == 0 ? 24.0f : 72.0f);
            }
            textView.setText(str3);
            if (!z2 && i6 != 0) {
                z = true;
            }
            Boolean bool = we4Var.e;
            if (bool == null || bool.booleanValue() != z) {
                we4Var.e = Boolean.valueOf(z);
                if (we4Var.c == i6) {
                    textView.clearAnimation();
                    textView.animate().translationX(z ? gm.L(i7 * (-7)) : 0.0f).setDuration(180L).setInterpolator(d53.h).start();
                } else {
                    textView.setTranslationX(z ? gm.L(i7 * (-7)) : 0.0f);
                }
            }
            we4Var.d = z2;
            we4Var.setWillNotDraw(!z2);
            we4Var.c = i6;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        int i2;
        View view;
        int i3;
        int i4;
        int i5;
        ylb ylbVar2;
        ylb ylbVar3;
        byte b = 24;
        Context context = this.d;
        qf4 qf4Var = this.e;
        switch (i) {
            case 0:
                view = new jf5(context, 22);
                break;
            case 1:
                w8c w8cVar = new w8c(context, 6, 0, false);
                w8cVar.setSelfAsSavedMessages(true);
                view = w8cVar;
                break;
            case 2:
                ela elaVar = (ela) qf4Var.fragmentView;
                String M0 = jb6.M0(2131750669, null);
                ylbVar = ((d) qf4Var).resourceProvider;
                lf4 lf4Var = new lf4(this.d, elaVar, M0, false, 12, ylbVar);
                qf4Var.L = lf4Var;
                lf4Var.r = false;
                lf4Var.s = true;
                du3 du3Var = lf4Var.b;
                du3Var.getEditText().setEmojiColor(Integer.valueOf(qf4Var.getThemedColor(cmb.Ei)));
                du3Var.setEmojiViewCacheType(25);
                du3Var.setText(qf4Var.x);
                i2 = ((d) qf4Var).currentAccount;
                vm.r(i2, qf4Var.y);
                qu3 editText = du3Var.getEditText();
                editText.addTextChangedListener(new fj());
                editText.addTextChangedListener(new b7(this, b));
                editText.setPadding(gm.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                du3Var.getEditText().setImeOptions(268435462);
                view = lf4Var;
                break;
            case 3:
                view = new bba(context, (hg9) null);
                break;
            case 4:
                we4 we4Var = new we4(context);
                we4Var.d = true;
                we4Var.e = null;
                ImageView imageView = new ImageView(context);
                we4Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                we4Var.addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                we4Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                if (jb6.a0) {
                    i3 = 24;
                    b = 0;
                } else {
                    i3 = 0;
                }
                textView.setPadding(i3, 0, b, 0);
                textView.setGravity(jb6.a0 ? 5 : 3);
                boolean z = jb6.a0;
                we4Var.addView(textView, qoe.d(-1, -2.0f, 23, z ? 0.0f : 72.0f, 0.0f, z ? 72.0f : 0.0f, 0.0f));
                view = we4Var;
                break;
            case 5:
                yd ydVar = new yd(context, (byte) 21);
                s09 s09Var = new s09(context);
                ydVar.b = s09Var;
                s09Var.f(R.raw.filter_new, 100, 100, null);
                s09Var.setScaleType(ImageView.ScaleType.CENTER);
                s09Var.d();
                ydVar.addView(s09Var, qoe.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                s09Var.setOnClickListener(new sf3(ydVar, (byte) 14));
                view = ydVar;
                break;
            case 6:
            default:
                view = new njb(context);
                break;
            case 7:
                i4 = ((d) qf4Var).currentAccount;
                view = new mf4(this, this.d, qf4Var, i4, qf4Var.r.a);
                break;
            case 8:
                view = new ye4(context);
                break;
            case 9:
                view = new ef4(qf4Var, context);
                break;
            case 10:
                Activity parentActivity = qf4Var.getParentActivity();
                i5 = ((d) qf4Var).currentAccount;
                ylbVar2 = ((d) qf4Var).resourceProvider;
                view = new z28(2, i5, ylbVar2, parentActivity);
                break;
            case 11:
                ylbVar3 = ((d) qf4Var).resourceProvider;
                view = new ff4(context, ylbVar3);
                break;
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        if (i == 2 || i != 9) {
            return;
        }
        ef4 ef4Var = (ef4) u69Var.a;
        qf4 qf4Var = this.e;
        ef4Var.e(gn.cloneSpans(qf4Var.x, -1, qf4Var.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
    }

    @Override // y59
    public final void z(u69 u69Var) {
        if (u69Var.f == 2) {
            gu3 gu3Var = (gu3) u69Var.a;
            gu3Var.b.k(true);
            gu3Var.b.d();
        }
    }
}
