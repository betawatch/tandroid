package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fc {
    public final org.telegram.ui.ActionBar.d2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.e6 c;

    public fc(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var == null || d2Var.getLastStoryViewer() == null || !d2Var.getLastStoryViewer().y()) {
            this.a = d2Var;
            this.b = null;
            this.c = d2Var != null ? d2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            ei.j4 currentPeerView = d2Var.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.M0 : null;
            this.c = d2Var.getLastStoryViewer().E;
        }
    }

    public static ac A(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        return z(d2Var, z10 ? 3 : 4, 0, e6Var);
    }

    public static ac B(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, bi.q0 q0Var, org.telegram.ui.ge geVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar = new ib(d2Var.getParentActivity(), e6Var);
        ibVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        ibVar.b.setText(org.telegram.messenger.bd.M0(z10 ? 2131748552 : 2131748474, z10 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z10) {
            yb ybVar = new yb(d2Var.getParentActivity(), e6Var, true);
            ybVar.b = q0Var;
            ybVar.c = geVar;
            ibVar.setButton(ybVar);
        }
        return ac.g(d2Var, ibVar, z10 ? 1500 : 5000);
    }

    public static ac C(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        ibVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743690, new Object[]{str}, ibVar.b);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static ac D(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        ibVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743741, new Object[]{user.deleted ? org.telegram.messenger.bd.a0("HiddenName", null, 2131749336, new Object[0]) : user.first_name, str}, ibVar.b);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static ac F(FrameLayout frameLayout, boolean z10) {
        return new fc(frameLayout, null).m(z10 ? ec.h : ec.e, 1, -115203550, -1, null);
    }

    public static ac S(int i3, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String M0;
        ib ibVar = new ib(d2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i3 == 0) {
            M0 = org.telegram.messenger.bd.M0(2131745284, null);
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException();
            }
            M0 = org.telegram.messenger.bd.M0(2131745286, null);
            z10 = false;
        }
        if (z10) {
            ibVar.d(R.raw.sound_on, new String[0]);
        } else {
            ibVar.d(R.raw.sound_off, new String[0]);
        }
        ibVar.b.setText(M0);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static fc X() {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return new fc(wa.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.t2 ? new fc(((org.telegram.ui.ActionBar.t2) dialog).c, T.getResourceProvider()) : a0(T);
    }

    public static fc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fc(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.d2 d2Var) {
        return (d2Var == null || d2Var.getParentActivity() == null || d2Var.getLayoutContainer() == null) ? false : true;
    }

    public static fc a0(org.telegram.ui.ActionBar.d2 d2Var) {
        return d2Var == null ? X() : new fc(d2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.G1) {
            X().t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (LaunchActivity.G1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            ac t10 = new fc(frameLayout, e6Var).t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null);
            t10.r = false;
            t10.j();
        }
    }

    public static ac d(org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        String M0;
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        if (z10) {
            ibVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.bd.M0(2131743771, null);
        } else {
            ibVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.bd.M0(2131743685, null);
        }
        ibVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return ac.g(d2Var, ibVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.G1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null).j();
            }
        }
    }

    public static ac j(org.telegram.ui.ActionBar.d2 d2Var) {
        return a0(d2Var).k(false);
    }

    public static ac l(String str, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        String M0;
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        if (str != null) {
            M0 = org.telegram.messenger.bd.a0(null, null, z10 ? 2131751413 : 2131751411, str);
        } else {
            M0 = org.telegram.messenger.bd.M0(z10 ? 2131751414 : 2131751412, null);
        }
        ibVar.b.setText(org.telegram.messenger.g0.X2(M0));
        ibVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return ac.g(d2Var, ibVar, 5000);
    }

    public static ac v(Context context, org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, int i3, long j10, int i10, int i11, int i12, int i13, boolean z10, ai.r1 r1Var) {
        ib ibVar;
        int i14;
        SpannableStringBuilder X2;
        ac g7;
        if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() || d2Var == null || i3 > 1 || j10 != org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n || z10) {
            ibVar = new ib(i11, i12, context, d2Var != null ? d2Var.getResourceProvider() : null);
        } else {
            ibVar = new lb(i10, d2Var);
        }
        ib ibVar2 = ibVar;
        boolean z11 = r1Var != null;
        org.telegram.ui.lo loVar = r1Var != null ? new org.telegram.ui.lo(9, new boolean[]{false}, r1Var) : null;
        if (i3 > 1) {
            i14 = 2;
            X2 = i10 <= 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, "FwdMessagesToManyChats", new Object[0]));
            ibVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n) {
            int i15 = 23;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750506, null), -1, 2, z10 ? new org.telegram.messenger.hc(25) : new org.telegram.messenger.hc(i15), null);
            } else {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750499, null), -1, 2, new org.telegram.messenger.hc(i15), null);
            }
            ibVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            ai.r1 r1Var2 = new ai.r1(loVar, d2Var, j10, 20);
            if (org.telegram.messenger.m5.z(j10)) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-j10));
                X2 = i10 <= 1 ? d2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131750510, M0.title), -1, 2, r1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750510, M0.title)) : d2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131750503, M0.title), -1, 2, r1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750503, M0.title));
            } else {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(j10));
                if (i10 <= 1) {
                    int i16 = z11 ? 2131750504 : 2131750505;
                    X2 = d2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, i16, org.telegram.messenger.l10.j(a22, true)), -1, 2, r1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i16, org.telegram.messenger.l10.j(a22, true)));
                } else {
                    int i17 = z11 ? 2131750497 : 2131750498;
                    X2 = d2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, i17, org.telegram.messenger.l10.j(a22, true)), -1, 2, r1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i17, org.telegram.messenger.l10.j(a22, true)));
                }
            }
            ibVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ibVar2.b.setText(X2);
        if (z11) {
            yb ybVar = new yb(ibVar2.getContext(), d2Var != null ? d2Var.getResourceProvider() : null, true, true);
            ybVar.b = null;
            ybVar.c = loVar;
            ibVar2.setButton(ybVar);
        }
        ibVar2.postDelayed(new bc(ibVar2, 1), org.telegram.messenger.hs.X4);
        if (frameLayout != null) {
            g7 = ac.f(frameLayout, ibVar2, i13);
        } else {
            if (d2Var == null) {
                throw new IllegalArgumentException();
            }
            g7 = ac.g(d2Var, ibVar2, i13);
        }
        if (ibVar2 instanceof lb) {
            ibVar2.b.setSingleLine(false);
            ibVar2.b.setMaxLines(i14);
            ((lb) ibVar2).setBulletin(g7);
            g7.r = false;
        }
        return g7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ac x(Activity activity, FrameLayout frameLayout, int i3, long j10, int i10, int i11) {
        SpannableStringBuilder X2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        ib ibVar = new ib(i10, i11, activity, null);
        if (i3 > 1) {
            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("InvLinkToChats", null, 2131749195, org.telegram.messenger.bd.G(i3, "Chats", new Object[0])));
            ibVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749193, null));
                ibVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                ibVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    ibVar.postDelayed(new bc(ibVar, 0), i12);
                }
                return ac.f(frameLayout, ibVar, 1500);
            }
            X2 = org.telegram.messenger.m5.z(j10) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("InvLinkToGroup", null, 2131749194, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-j10)).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("InvLinkToUser", null, 2131749192, org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(j10)), true)));
            ibVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = X2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        ibVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return ac.f(frameLayout, ibVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ac z(org.telegram.ui.ActionBar.d2 d2Var, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        String a02;
        boolean z10;
        ib ibVar = new ib(d2Var.getParentActivity(), e6Var);
        boolean z11 = true;
        if (i3 == 0) {
            a02 = org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.G(1, "Hours", new Object[0]));
        } else if (i3 == 1) {
            a02 = org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.G(8, "Hours", new Object[0]));
        } else if (i3 == 2) {
            a02 = org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.G(2, "Days", new Object[0]));
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    a02 = org.telegram.messenger.bd.M0(2131747863, null);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i3 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.c0(i10));
                    z10 = true;
                }
                if (!z11) {
                    ibVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    ibVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ibVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ibVar.b.setText(a02);
                return ac.g(d2Var, ibVar, 1500);
            }
            a02 = org.telegram.messenger.bd.M0(2131747907, null);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        ibVar.b.setText(a02);
        return ac.g(d2Var, ibVar, 1500);
    }

    public final ac E(org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar = new ib(W(), e6Var);
        ibVar.d(R.raw.chats_infotip, new String[0]);
        ibVar.b.setText(org.telegram.messenger.bd.M0(2131746232, null));
        return b(ibVar, 1500);
    }

    public final ac G(int i3, int i10, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.c);
        ibVar.c(i3, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i11 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i11 >= i10) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i11++;
            }
            charSequence = spannableStringBuilder;
        }
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(i10);
        ibVar.b.setText(charSequence);
        return b(ibVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ac H(int i3, CharSequence charSequence) {
        return Q(i3, 36, charSequence);
    }

    public final ac I(int i3, CharSequence charSequence, CharSequence charSequence2) {
        xb xbVar = new xb(W(), this.c);
        xbVar.c(i3, 36, 36, new String[0]);
        xbVar.b.setText(charSequence);
        xbVar.c.setText(charSequence2);
        return b(xbVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ac J(int i3, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ib ibVar = new ib(W, e6Var);
        if (i3 != 0) {
            ibVar.c(i3, 36, 36, new String[0]);
        } else {
            ibVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ibVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        ibVar.b.setTextSize(1, 14.0f);
        ibVar.b.setTextDirection(5);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        ibVar.b.setText(charSequence);
        yb ybVar = new yb(W(), e6Var, true, z10);
        ybVar.e(charSequence2);
        ybVar.b = runnable;
        ibVar.setButton(ybVar);
        return b(ibVar, i10);
    }

    public final ac K(int i3, CharSequence charSequence, String str, Runnable runnable) {
        return J(i3, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final ac L(int i3, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        xb xbVar = new xb(W, e6Var);
        xbVar.c(i3, 36, 36, new String[0]);
        xbVar.b.setText(str);
        xbVar.c.setText(charSequence);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(str2);
        ybVar.b = runnable;
        xbVar.setButton(ybVar);
        return b(xbVar, 5000);
    }

    public final ac M(Drawable drawable, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.c);
        ibVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.xl0) {
            ((org.telegram.ui.xl0) drawable).e(ibVar.a);
        }
        ibVar.b.setText(charSequence);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(2);
        return b(ibVar, 2750);
    }

    public final ac N(String str, String str2) {
        xb xbVar = new xb(W(), this.c);
        xbVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) xbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        xbVar.b.setText(str);
        xbVar.c.setText(str2);
        return b(xbVar, 5000);
    }

    public final ac O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new ab();
        }
        wb wbVar = new wb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.ac c10 = org.telegram.messenger.ac.c(w10, document);
        k9 k9Var = wbVar.a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c2, c10);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = wbVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = wbVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(wbVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final ac P(int i3, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.c);
        ibVar.c(i3, 36, 36, new String[0]);
        ibVar.b.setText(charSequence);
        ibVar.b.setSingleLine(false);
        ibVar.b.setTextSize(1, 14.0f);
        ibVar.b.setMaxLines(4);
        return b(ibVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ac Q(int i3, int i10, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.c);
        ibVar.c(i3, i10, i10, new String[0]);
        ibVar.b.setText(charSequence);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(2);
        return b(ibVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ac R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new ab();
        }
        wb wbVar = new wb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.ac c10 = org.telegram.messenger.ac.c(w10, document);
        k9 k9Var = wbVar.a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c2, c10);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = wbVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        wbVar.c.setVisibility(8);
        return b(wbVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final ac T(String str) {
        ib ibVar = new ib(W(), null);
        ibVar.d(R.raw.contact_check, new String[0]);
        ibVar.b.setText(str);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(2);
        return b(ibVar, 1500);
    }

    public final ac U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        ya yaVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (isEmpty) {
            ib ibVar = new ib(W(), e6Var);
            ibVar.b.setText(str);
            ibVar.b.setSingleLine(false);
            ibVar.b.setMaxLines(2);
            yaVar = ibVar;
        } else {
            xb xbVar = new xb(W(), e6Var);
            xbVar.b.setText(str);
            xbVar.c.setText((CharSequence) null);
            yaVar = xbVar;
        }
        yaVar.setTimer();
        yb ybVar = new yb(W(), e6Var, true, z10);
        ybVar.e(org.telegram.messenger.bd.M0(2131743895, null));
        ybVar.b = runnable;
        ybVar.c = runnable2;
        yaVar.setButton(ybVar);
        return b(yaVar, 5000);
    }

    public final ac V(List list, CharSequence charSequence, CharSequence charSequence2, m2.t tVar) {
        float f10;
        int i3;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        zb zbVar = new zb(W, e6Var, z10);
        x8 x8Var = zbVar.a;
        if (list != null) {
            int i10 = 0;
            i3 = 0;
            for (int i11 = 3; i10 < list.size() && i3 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i3 + 1;
                    x8Var.setCount(i12);
                    x8Var.b(i3, org.telegram.messenger.h10.t0, tLObject);
                    i3 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                x8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                x8Var.setScaleX(1.2f);
                x8Var.setScaleY(1.2f);
            } else {
                x8Var.setScaleX(1.0f);
                x8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i3 = 0;
        }
        x8Var.a(false);
        s70 s70Var = zbVar.b;
        if (charSequence2 != null) {
            s70Var.setSingleLine(true);
            s70Var.setMaxLines(1);
            s70Var.setText(charSequence);
            s70 s70Var2 = zbVar.c;
            s70Var2.setText(charSequence2);
            s70Var2.setSingleLine(false);
            s70Var2.setMaxLines(3);
            LinearLayout linearLayout = zbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i3) * 12));
                if (i3 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.bd.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            s70Var.setSingleLine(false);
            s70Var.setMaxLines(4);
            s70Var.setText(charSequence);
            if (s70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i3) * 12));
                if (i3 == 1) {
                    s70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.bd.a0) {
                    ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (tVar != null) {
            yb ybVar = new yb(W(), e6Var, true);
            ybVar.e(org.telegram.messenger.bd.M0(2131743895, null));
            ybVar.b = (Runnable) tVar.b;
            ybVar.c = (Runnable) tVar.c;
            zbVar.setButton(ybVar);
        }
        return b(zbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var != null) {
            context = d2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.t0.b : context;
    }

    public final ac Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.G1 ? new ab() : tL_error == null ? t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null) : t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null);
    }

    public final ac b(ya yaVar, int i3) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        return d2Var != null ? ac.g(d2Var, yaVar, i3) : ac.f(this.b, yaVar, i3);
    }

    public final ac c(CharSequence charSequence) {
        if (W() == null) {
            return new ab();
        }
        ib ibVar = new ib(W(), this.c);
        ibVar.d(R.raw.ic_admin, "Shield");
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        ibVar.b.setText(charSequence);
        return b(ibVar, 2750);
    }

    public final ac e(boolean z10) {
        String M0;
        ib ibVar = new ib(W(), this.c);
        if (z10) {
            ibVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.bd.M0(2131743771, null);
        } else {
            ibVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.bd.M0(2131743685, null);
        }
        ibVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return b(ibVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (LaunchActivity.G1) {
            if (TextUtils.isEmpty(str)) {
                ac t10 = t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else {
                ac t11 = t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final ac f(int i3, Runnable runnable) {
        ib ibVar = new ib(W(), null);
        ibVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.bd.G(i3, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        ibVar.b.setText(valueOf);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        return b(ibVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.G1) {
            if (tL_error == null) {
                ac t10 = t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null);
                t10.r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                ac t11 = t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null);
                t11.r = false;
                t11.k(z10);
            }
        }
    }

    public final ac g(String str, ArrayList arrayList) {
        zb zbVar = new zb(W(), this.c, false);
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i3 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i3 + 1;
                zbVar.a.setCount(i11);
                zbVar.a.b(i3, org.telegram.messenger.h10.t0, tLObject);
                i3 = i11;
            }
        }
        if (arrayList.size() == 1) {
            zbVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            zbVar.a.setScaleX(1.2f);
            zbVar.a.setScaleY(1.2f);
        } else {
            zbVar.a.setScaleX(1.0f);
            zbVar.a.setScaleY(1.0f);
        }
        zbVar.a.a(false);
        zbVar.b.setSingleLine(false);
        zbVar.b.setMaxLines(2);
        zbVar.b.setText(str);
        if (zbVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i3) * 12));
            if (org.telegram.messenger.bd.a0) {
                ((ViewGroup.MarginLayoutParams) zbVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) zbVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.bd.a0) {
            zbVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i3 - 1) * 12)));
        }
        return b(zbVar, 5000);
    }

    public final boolean g0(int i3, long j10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q() && (d2Var = this.a) != null) {
            lb lbVar = new lb(i3, d2Var);
            if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).n) {
                int i10 = 23;
                SpannableStringBuilder S2 = i3 <= 1 ? org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750506, null), -1, 2, new org.telegram.messenger.hc(i10), null) : org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750499, null), -1, 2, new org.telegram.messenger.hc(i10), null);
                lbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                lbVar.b.setText(S2);
                lbVar.b.setSingleLine(false);
                lbVar.b.setMaxLines(2);
                ac b10 = b(lbVar, 3500);
                lbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final ac h(TLRPC.Document document, int i3, final org.telegram.messenger.u10 u10Var) {
        x70 x70Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.zi.j1(document);
        if (j12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).m0(j12, true);
        final int i11 = 0;
        if (m0 != null && (stickerSet = m0.set) != null) {
            return r(document, i3 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, stickerSet.title)) : i3 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, stickerSet.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, stickerSet.title)), org.telegram.messenger.bd.M0(2131743573, null), new Runnable() { // from class: org.telegram.ui.Components.cc
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            u10Var.a(j12);
                            break;
                        default:
                            u10Var.a(j12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i3 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, "<{LOADING}>"))) : i3 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (indexOf >= 0) {
            x70Var = new x70(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), e6Var);
            spannableStringBuilder.setSpan(x70Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.k6.vj;
            x70Var.a(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 32), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 72));
        } else {
            x70Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.bd.M0(2131743573, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.cc
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        u10Var.a(j12);
                        break;
                    default:
                        u10Var.a(j12);
                        break;
                }
            }
        };
        Context W = W();
        hb hbVar = new hb(W, e6Var);
        s70 s70Var = new s70(W, null);
        hbVar.d = s70Var;
        s70Var.setDisablePaddingsOffset(true);
        s70Var.setSingleLine();
        s70Var.setTypeface(Typeface.SANS_SERIF);
        s70Var.setTextSize(1, 15.0f);
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        s70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        hbVar.b.setVisibility(8);
        hbVar.addView(s70Var, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.k6.vj;
        hbVar.setTextColor(hbVar.getThemedColor(i13));
        if (org.telegram.messenger.zi.D4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.r6.t(hbVar.a, i13, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        hbVar.e(document, new String[0]);
        hbVar.b.setTextSize(1, 14.0f);
        hbVar.b.setSingleLine(false);
        hbVar.b.setMaxLines(3);
        s70Var.setText(spannableStringBuilder);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setSingleLine(false);
        s70Var.setMaxLines(3);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(M0);
        ybVar.b = runnable;
        hbVar.setButton(ybVar);
        ac b10 = b(hbVar, 2750);
        if (x70Var != null) {
            fb fbVar = b10.e;
            if (fbVar instanceof hb) {
                x70Var.b = ((hb) fbVar).d;
            }
        }
        org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).l0(inputStickerSet, null, false, false, new ci.q3(i3, b10, currentTimeMillis));
        return b10;
    }

    public final ac i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ab();
        }
        ib ibVar = new ib(W(), null);
        ibVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ibVar.b.setText(str);
        return b(ibVar, 1500);
    }

    public final ac k(boolean z10) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ab();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (!z10) {
            ib ibVar = new ib(W(), e6Var);
            ibVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ibVar.b.setText(org.telegram.messenger.bd.M0(2131748929, null));
            return b(ibVar, 1500);
        }
        xb xbVar = new xb(W(), e6Var);
        xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        xbVar.b.setText(org.telegram.messenger.bd.M0(2131748929, null));
        xbVar.c.setText(org.telegram.messenger.bd.M0(2131748927, null));
        return b(xbVar, 2750);
    }

    public final ac m(ec ecVar, int i3, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        dc dcVar = ecVar.d;
        ib ibVar = (i10 == 0 || i11 == 0) ? new ib(W(), e6Var) : new ib(i10, i11, W(), e6Var);
        ibVar.d(dcVar.a, dcVar.b);
        TextView textView = ibVar.b;
        String str = ecVar.a;
        textView.setText(org.telegram.messenger.g0.U2(ecVar.c ? org.telegram.messenger.bd.G(i3, str, new Object[0]) : org.telegram.messenger.bd.M0(ecVar.b, str), new org.telegram.messenger.hc(24)));
        int i12 = dcVar.c;
        if (i12 != 0) {
            ibVar.setIconPaddingBottom(i12);
        }
        return b(ibVar, 1500);
    }

    public final ac n(ec ecVar, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ecVar, i3, 0, 0, e6Var);
    }

    public final ac o(ec ecVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ecVar, 1, 0, 0, e6Var);
    }

    public final ac p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        vb vbVar = new vb(W, e6Var);
        g5 g5Var = new g5(1, org.telegram.messenger.h10.t0, j10);
        k9 k9Var = vbVar.a;
        k9Var.setAnimatedEmojiDrawable(g5Var);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        vbVar.b.setText(str);
        vbVar.c.setText(str2);
        return b(vbVar, 2750);
    }

    public final ac q(TLRPC.Document document, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.c);
        if (org.telegram.messenger.zi.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(ibVar.a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ibVar.e(document, new String[0]);
        ibVar.b.setText(charSequence);
        ibVar.b.setTextSize(1, 14.0f);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        return b(ibVar, 2750);
    }

    public final ac r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ib ibVar = new ib(W, e6Var);
        if (org.telegram.messenger.zi.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(ibVar.a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ibVar.e(document, new String[0]);
        if (ibVar.a.getImageReceiver() != null) {
            ibVar.a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        ibVar.b.setText(charSequence);
        ibVar.b.setTextSize(1, 14.0f);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(3);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(str);
        ybVar.b = runnable;
        ibVar.setButton(ybVar);
        return b(ibVar, 2750);
    }

    public final ac s(TLRPC.Document document, String str, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.c);
        boolean D4 = org.telegram.messenger.zi.D4(document);
        fh0 fh0Var = xbVar.a;
        if (D4) {
            org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        xbVar.b.setText(str);
        xbVar.c.setText(charSequence);
        return b(xbVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final ac t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar = new ib(W(), e6Var);
        ibVar.d(R.raw.chats_infotip, new String[0]);
        ibVar.b.setText(charSequence);
        ibVar.b.setSingleLine(false);
        ibVar.b.setMaxLines(2);
        return b(ibVar, 1500);
    }

    public final ac u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        xb xbVar = new xb(W(), e6Var);
        xbVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        xbVar.b.setText(str);
        xbVar.c.setText(str2);
        return b(xbVar, 1500);
    }

    public final ac w(int i3, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ib ibVar = new ib(W, e6Var);
        ibVar.setBackground(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var), 12);
        ibVar.a.setImageResource(i3);
        ibVar.b.setText(charSequence);
        ibVar.b.setSingleLine(false);
        ibVar.b.setLines(2);
        ibVar.b.setMaxLines(4);
        TextView textView = ibVar.b;
        textView.setMaxWidth(gi.l3.a(textView.getText(), ibVar.b.getPaint()));
        ibVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ibVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        ibVar.setWrapWidth();
        return b(ibVar, 5000);
    }

    public final ac y(int i3, TLRPC.Document document, k2.u uVar) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ib ibVar = new ib(W, e6Var);
        ibVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ibVar.removeView(ibVar.b);
        o5 o5Var = new o5(ibVar.getContext());
        ibVar.b = o5Var;
        o5Var.setTypeface(Typeface.SANS_SERIF);
        ibVar.b.setTextSize(1, 15.0f);
        ibVar.b.setEllipsize(TextUtils.TruncateAt.END);
        ibVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new p5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        ibVar.b.setText(new SpannableStringBuilder(i3 > 1 ? org.telegram.messenger.bd.G(i3, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.bd.M0(2131745888, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (uVar != null) {
            yb ybVar = new yb(W(), e6Var, true);
            ybVar.e(org.telegram.messenger.bd.M0(2131743573, null));
            ybVar.b = uVar;
            ibVar.setButton(ybVar);
        }
        ibVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, e6Var));
        ibVar.addView(ibVar.b, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ibVar, 2750);
    }

    public fc(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = e6Var;
    }
}
