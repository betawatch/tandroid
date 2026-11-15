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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cc {
    public final org.telegram.ui.ActionBar.e2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.e6 c;

    public cc(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var == null || e2Var.getLastStoryViewer() == null || !e2Var.getLastStoryViewer().y()) {
            this.a = e2Var;
            this.b = null;
            this.c = e2Var != null ? e2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            fi.b4 currentPeerView = e2Var.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.M0 : null;
            this.c = e2Var.getLastStoryViewer().E;
        }
    }

    public static xb A(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        return z(e2Var, z10 ? 3 : 4, 0, e6Var);
    }

    public static xb B(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, ci.p0 p0Var, org.telegram.ui.fe feVar, org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar = new fb(e2Var.getParentActivity(), e6Var);
        fbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        fbVar.b.setText(org.telegram.messenger.hd.M0(z10 ? 2131748544 : 2131748466, z10 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z10) {
            vb vbVar = new vb(e2Var.getParentActivity(), e6Var, true);
            vbVar.b = p0Var;
            vbVar.c = feVar;
            fbVar.setButton(vbVar);
        }
        return xb.g(e2Var, fbVar, z10 ? 1500 : 5000);
    }

    public static xb C(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        fbVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.k5.q("UserSetAsAdminHint", null, 2131743680, new Object[]{str}, fbVar.b);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static xb D(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        fbVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.k5.q("UserRemovedFromChatHint", null, 2131743731, new Object[]{user.deleted ? org.telegram.messenger.hd.a0("HiddenName", null, 2131749328, new Object[0]) : user.first_name, str}, fbVar.b);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static xb F(FrameLayout frameLayout, boolean z10) {
        return new cc(frameLayout, null).m(z10 ? bc.h : bc.e, 1, -115203550, -1, null);
    }

    public static xb S(int i7, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String M0;
        fb fbVar = new fb(e2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i7 == 0) {
            M0 = org.telegram.messenger.hd.M0(2131745274, null);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            M0 = org.telegram.messenger.hd.M0(2131745276, null);
            z10 = false;
        }
        if (z10) {
            fbVar.d(R.raw.sound_on, new String[0]);
        } else {
            fbVar.d(R.raw.sound_off, new String[0]);
        }
        fbVar.b.setText(M0);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static cc X() {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return new cc(ta.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.u2 ? new cc(((org.telegram.ui.ActionBar.u2) dialog).c, T.getResourceProvider()) : a0(T);
    }

    public static cc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new cc(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.e2 e2Var) {
        return (e2Var == null || e2Var.getParentActivity() == null || e2Var.getLayoutContainer() == null) ? false : true;
    }

    public static cc a0(org.telegram.ui.ActionBar.e2 e2Var) {
        return e2Var == null ? X() : new cc(e2Var);
    }

    public static void b0(String str) {
        if (LaunchActivity.E1) {
            X().t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null).j();
        }
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                b0(str);
                return;
            }
            xb t6 = new cc(frameLayout, e6Var).t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null);
            t6.r = false;
            t6.j();
        }
    }

    public static xb d(org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        String M0;
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        if (z10) {
            fbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743761, null);
        } else {
            fbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743675, null);
        }
        fbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return xb.g(e2Var, fbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null).j();
            }
        }
    }

    public static xb j(org.telegram.ui.ActionBar.e2 e2Var) {
        return a0(e2Var).k(false);
    }

    public static xb l(String str, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        String M0;
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        if (str != null) {
            M0 = org.telegram.messenger.hd.a0(null, null, z10 ? 2131751412 : 2131751410, str);
        } else {
            M0 = org.telegram.messenger.hd.M0(z10 ? 2131751413 : 2131751411, null);
        }
        fbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        fbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return xb.g(e2Var, fbVar, 5000);
    }

    public static xb v(Context context, org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.m1 m1Var) {
        fb fbVar;
        int i14;
        SpannableStringBuilder X2;
        xb g10;
        int i15 = 1;
        if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() || e2Var == null || i7 > 1 || j3 != org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n || z10) {
            fbVar = new fb(i11, i12, context, e2Var != null ? e2Var.getResourceProvider() : null);
        } else {
            fbVar = new ib(i10, e2Var);
        }
        fb fbVar2 = fbVar;
        boolean z11 = m1Var != null;
        org.telegram.ui.zg zgVar = m1Var != null ? new org.telegram.ui.zg(23, new boolean[]{false}, m1Var) : null;
        if (i7 > 1) {
            i14 = 2;
            X2 = i10 <= 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            fbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n) {
            int i16 = 25;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750498, null), -1, 2, z10 ? new org.telegram.messenger.c6(27) : new org.telegram.messenger.c6(i16), null);
            } else {
                X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750491, null), -1, 2, new org.telegram.messenger.c6(i16), null);
            }
            fbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            bi.m1 m1Var2 = new bi.m1(zgVar, e2Var, j3, 20);
            if (org.telegram.messenger.m5.z(j3)) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(-j3));
                X2 = i10 <= 1 ? e2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750502, M0.title), -1, 2, m1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750502, M0.title)) : e2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750495, M0.title), -1, 2, m1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750495, M0.title));
            } else {
                TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).a2(Long.valueOf(j3));
                if (i10 <= 1) {
                    int i17 = z11 ? 2131750496 : 2131750497;
                    X2 = e2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i17, org.telegram.messenger.q10.j(a22, true)), -1, 2, m1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i17, org.telegram.messenger.q10.j(a22, true)));
                } else {
                    int i18 = z11 ? 2131750489 : 2131750490;
                    X2 = e2Var != null ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i18, org.telegram.messenger.q10.j(a22, true)), -1, 2, m1Var2, null) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i18, org.telegram.messenger.q10.j(a22, true)));
                }
            }
            fbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        fbVar2.b.setText(X2);
        if (z11) {
            vb vbVar = new vb(fbVar2.getContext(), e2Var != null ? e2Var.getResourceProvider() : null, true, true);
            vbVar.b = null;
            vbVar.c = zgVar;
            fbVar2.setButton(vbVar);
        }
        fbVar2.postDelayed(new yb(fbVar2, i15), org.telegram.messenger.ns.X4);
        if (frameLayout != null) {
            g10 = xb.f(frameLayout, fbVar2, i13);
        } else {
            if (e2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = xb.g(e2Var, fbVar2, i13);
        }
        if (fbVar2 instanceof ib) {
            fbVar2.b.setSingleLine(false);
            fbVar2.b.setMaxLines(i14);
            ((ib) fbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xb x(Activity activity, FrameLayout frameLayout, int i7, long j3, int i10, int i11) {
        SpannableStringBuilder X2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        fb fbVar = new fb(i10, i11, activity, null);
        int i13 = 0;
        if (i7 > 1) {
            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("InvLinkToChats", null, 2131749187, org.telegram.messenger.hd.G(i7, "Chats", new Object[0])));
            fbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749185, null));
                fbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                fbVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    fbVar.postDelayed(new yb(fbVar, i13), i12);
                }
                return xb.f(frameLayout, fbVar, 1500);
            }
            X2 = org.telegram.messenger.m5.z(j3) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("InvLinkToGroup", null, 2131749186, org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("InvLinkToUser", null, 2131749184, org.telegram.messenger.q10.j(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).a2(Long.valueOf(j3)), true)));
            fbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = X2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        fbVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return xb.f(frameLayout, fbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xb z(org.telegram.ui.ActionBar.e2 e2Var, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        String a02;
        boolean z10;
        fb fbVar = new fb(e2Var.getParentActivity(), e6Var);
        boolean z11 = true;
        if (i7 == 0) {
            a02 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.G(1, "Hours", new Object[0]));
        } else if (i7 == 1) {
            a02 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.G(8, "Hours", new Object[0]));
        } else if (i7 == 2) {
            a02 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.G(2, "Days", new Object[0]));
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    a02 = org.telegram.messenger.hd.M0(2131747855, null);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i7 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.hd.c0(i10));
                    z10 = true;
                }
                if (!z11) {
                    fbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    fbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    fbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                fbVar.b.setText(a02);
                return xb.g(e2Var, fbVar, 1500);
            }
            a02 = org.telegram.messenger.hd.M0(2131747899, null);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        fbVar.b.setText(a02);
        return xb.g(e2Var, fbVar, 1500);
    }

    public final xb E(org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar = new fb(W(), e6Var);
        fbVar.d(R.raw.chats_infotip, new String[0]);
        fbVar.b.setText(org.telegram.messenger.hd.M0(2131746222, null));
        return b(fbVar, 1500);
    }

    public final xb G(int i7, int i10, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.c);
        fbVar.c(i7, 36, 36, new String[0]);
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
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(i10);
        fbVar.b.setText(charSequence);
        return b(fbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final xb H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final xb I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        ub ubVar = new ub(W(), this.c);
        ubVar.c(i7, 36, 36, new String[0]);
        ubVar.b.setText(charSequence);
        ubVar.c.setText(charSequence2);
        return b(ubVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final xb J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        fb fbVar = new fb(W, e6Var);
        if (i7 != 0) {
            fbVar.c(i7, 36, 36, new String[0]);
        } else {
            fbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) fbVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        fbVar.b.setTextSize(1, 14.0f);
        fbVar.b.setTextDirection(5);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(3);
        fbVar.b.setText(charSequence);
        vb vbVar = new vb(W(), e6Var, true, z10);
        vbVar.e(charSequence2);
        vbVar.b = runnable;
        fbVar.setButton(vbVar);
        return b(fbVar, i10);
    }

    public final xb K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        return J(i7, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final xb L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        ub ubVar = new ub(W, e6Var);
        ubVar.c(i7, 36, 36, new String[0]);
        ubVar.b.setText(str);
        ubVar.c.setText(charSequence);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(str2);
        vbVar.b = runnable;
        ubVar.setButton(vbVar);
        return b(ubVar, 5000);
    }

    public final xb M(Drawable drawable, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.c);
        fbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.dm0) {
            ((org.telegram.ui.dm0) drawable).e(fbVar.a);
        }
        fbVar.b.setText(charSequence);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(2);
        return b(fbVar, 2750);
    }

    public final xb N(String str, String str2) {
        ub ubVar = new ub(W(), this.c);
        ubVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ubVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ubVar.b.setText(str);
        ubVar.c.setText(str2);
        return b(ubVar, 5000);
    }

    public final xb O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new xa();
        }
        tb tbVar = new tb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        i9 i9Var = tbVar.a;
        i9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = tbVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = tbVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(tbVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final xb P(int i7, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.c);
        fbVar.c(i7, 36, 36, new String[0]);
        fbVar.b.setText(charSequence);
        fbVar.b.setSingleLine(false);
        fbVar.b.setTextSize(1, 14.0f);
        fbVar.b.setMaxLines(4);
        return b(fbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final xb Q(int i7, int i10, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.c);
        fbVar.c(i7, i10, i10, new String[0]);
        fbVar.b.setText(charSequence);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(2);
        return b(fbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final xb R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new xa();
        }
        tb tbVar = new tb(W(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        i9 i9Var = tbVar.a;
        i9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = tbVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        tbVar.c.setVisibility(8);
        return b(tbVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final xb T(String str) {
        fb fbVar = new fb(W(), null);
        fbVar.d(R.raw.contact_check, new String[0]);
        fbVar.b.setText(str);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(2);
        return b(fbVar, 1500);
    }

    public final xb U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        va vaVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (isEmpty) {
            fb fbVar = new fb(W(), e6Var);
            fbVar.b.setText(str);
            fbVar.b.setSingleLine(false);
            fbVar.b.setMaxLines(2);
            vaVar = fbVar;
        } else {
            ub ubVar = new ub(W(), e6Var);
            ubVar.b.setText(str);
            ubVar.c.setText((CharSequence) null);
            vaVar = ubVar;
        }
        vaVar.setTimer();
        vb vbVar = new vb(W(), e6Var, true, z10);
        vbVar.e(org.telegram.messenger.hd.M0(2131743885, null));
        vbVar.b = runnable;
        vbVar.c = runnable2;
        vaVar.setButton(vbVar);
        return b(vaVar, 5000);
    }

    public final xb V(List list, CharSequence charSequence, CharSequence charSequence2, k8.a aVar) {
        float f10;
        int i7;
        Context W = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        wb wbVar = new wb(W, e6Var, z10);
        w8 w8Var = wbVar.a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    w8Var.setCount(i12);
                    w8Var.b(i7, org.telegram.messenger.m10.t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                w8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                w8Var.setScaleX(1.2f);
                w8Var.setScaleY(1.2f);
            } else {
                w8Var.setScaleX(1.0f);
                w8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        w8Var.a(false);
        z70 z70Var = wbVar.b;
        if (charSequence2 != null) {
            z70Var.setSingleLine(true);
            z70Var.setMaxLines(1);
            z70Var.setText(charSequence);
            z70 z70Var2 = wbVar.c;
            z70Var2.setText(charSequence2);
            z70Var2.setSingleLine(false);
            z70Var2.setMaxLines(3);
            LinearLayout linearLayout = wbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            z70Var.setSingleLine(false);
            z70Var.setMaxLines(4);
            z70Var.setText(charSequence);
            if (z70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    z70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.a0) {
                    ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (aVar != null) {
            vb vbVar = new vb(W(), e6Var, true);
            vbVar.e(org.telegram.messenger.hd.M0(2131743885, null));
            vbVar.b = (Runnable) aVar.b;
            vbVar.c = (Runnable) aVar.c;
            wbVar.setButton(vbVar);
        }
        return b(wbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var != null) {
            context = e2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.t0.b : context;
    }

    public final xb Y(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new xa() : tL_error == null ? t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null) : t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null);
    }

    public final xb b(va vaVar, int i7) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        return e2Var != null ? xb.g(e2Var, vaVar, i7) : xb.f(this.b, vaVar, i7);
    }

    public final xb c(CharSequence charSequence) {
        if (W() == null) {
            return new xa();
        }
        fb fbVar = new fb(W(), this.c);
        fbVar.d(R.raw.ic_admin, "Shield");
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(3);
        fbVar.b.setText(charSequence);
        return b(fbVar, 2750);
    }

    public final xb e(boolean z10) {
        String M0;
        fb fbVar = new fb(W(), this.c);
        if (z10) {
            fbVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743761, null);
        } else {
            fbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743675, null);
        }
        fbVar.b.setText(org.telegram.messenger.g0.X2(M0));
        return b(fbVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                xb t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else {
                xb t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final xb f(int i7, Runnable runnable) {
        fb fbVar = new fb(W(), null);
        fbVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.hd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        fbVar.b.setText(valueOf);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(3);
        return b(fbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                xb t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                xb t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final xb g(String str, ArrayList arrayList) {
        wb wbVar = new wb(W(), this.c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                wbVar.a.setCount(i11);
                wbVar.a.b(i7, org.telegram.messenger.m10.t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            wbVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            wbVar.a.setScaleX(1.2f);
            wbVar.a.setScaleY(1.2f);
        } else {
            wbVar.a.setScaleX(1.0f);
            wbVar.a.setScaleY(1.0f);
        }
        wbVar.a.a(false);
        wbVar.b.setSingleLine(false);
        wbVar.b.setMaxLines(2);
        wbVar.b.setText(str);
        if (wbVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.hd.a0) {
                ((ViewGroup.MarginLayoutParams) wbVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) wbVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.hd.a0) {
            wbVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(wbVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q() && (e2Var = this.a) != null) {
            ib ibVar = new ib(i7, e2Var);
            if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).n) {
                int i10 = 25;
                SpannableStringBuilder S2 = i7 <= 1 ? org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750498, null), -1, 2, new org.telegram.messenger.c6(i10), null) : org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750491, null), -1, 2, new org.telegram.messenger.c6(i10), null);
                ibVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                ibVar.b.setText(S2);
                ibVar.b.setSingleLine(false);
                ibVar.b.setMaxLines(2);
                xb b10 = b(ibVar, 3500);
                ibVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final xb h(TLRPC.Document document, int i7, final org.telegram.messenger.z10 z10Var) {
        e80 e80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.gj.i1(document);
        if (i12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).m0(i12, true);
        final int i11 = 0;
        if (m0 != null && (stickerSet = m0.set) != null) {
            return r(document, i7 == 1 ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title)) : i7 == 2 ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title)), org.telegram.messenger.hd.M0(2131743563, null), new Runnable() { // from class: org.telegram.ui.Components.zb
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            z10Var.a(i12);
                            break;
                        default:
                            z10Var.a(i12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i7 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, "<{LOADING}>"))) : i7 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (indexOf >= 0) {
            e80Var = new e80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), e6Var);
            spannableStringBuilder.setSpan(e80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.j6.yj;
            e80Var.a(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i13, e6Var), 32), i0.a.o(org.telegram.ui.ActionBar.j6.w0(i13, e6Var), 72));
        } else {
            e80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.hd.M0(2131743563, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.zb
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        z10Var.a(i12);
                        break;
                    default:
                        z10Var.a(i12);
                        break;
                }
            }
        };
        Context W = W();
        eb ebVar = new eb(W, e6Var);
        z70 z70Var = new z70(W, null);
        ebVar.d = z70Var;
        z70Var.setDisablePaddingsOffset(true);
        z70Var.setSingleLine();
        z70Var.setTypeface(Typeface.SANS_SERIF);
        z70Var.setTextSize(1, 15.0f);
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        z70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ebVar.b.setVisibility(8);
        ebVar.addView(z70Var, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.j6.yj;
        ebVar.setTextColor(ebVar.getThemedColor(i14));
        if (org.telegram.messenger.gj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.q6.s(ebVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        ebVar.e(document, new String[0]);
        ebVar.b.setTextSize(1, 14.0f);
        ebVar.b.setSingleLine(false);
        ebVar.b.setMaxLines(3);
        z70Var.setText(spannableStringBuilder);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setSingleLine(false);
        z70Var.setMaxLines(3);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(M0);
        vbVar.b = runnable;
        ebVar.setButton(vbVar);
        xb b10 = b(ebVar, 2750);
        if (e80Var != null) {
            cb cbVar = b10.e;
            if (cbVar instanceof eb) {
                e80Var.b = ((eb) cbVar).d;
            }
        }
        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).l0(inputStickerSet, null, false, false, new di.h3(i7, b10, currentTimeMillis));
        return b10;
    }

    public final xb i(String str) {
        if (!org.telegram.messenger.g0.H3()) {
            return new xa();
        }
        fb fbVar = new fb(W(), null);
        fbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        fbVar.b.setText(str);
        return b(fbVar, 1500);
    }

    public final xb k(boolean z10) {
        if (!org.telegram.messenger.g0.H3()) {
            return new xa();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        if (!z10) {
            fb fbVar = new fb(W(), e6Var);
            fbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            fbVar.b.setText(org.telegram.messenger.hd.M0(2131748921, null));
            return b(fbVar, 1500);
        }
        ub ubVar = new ub(W(), e6Var);
        ubVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ubVar.b.setText(org.telegram.messenger.hd.M0(2131748921, null));
        ubVar.c.setText(org.telegram.messenger.hd.M0(2131748919, null));
        return b(ubVar, 2750);
    }

    public final xb m(bc bcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        ac acVar = bcVar.d;
        fb fbVar = (i10 == 0 || i11 == 0) ? new fb(W(), e6Var) : new fb(i10, i11, W(), e6Var);
        fbVar.d(acVar.a, acVar.b);
        TextView textView = fbVar.b;
        String str = bcVar.a;
        textView.setText(org.telegram.messenger.g0.U2(bcVar.c ? org.telegram.messenger.hd.G(i7, str, new Object[0]) : org.telegram.messenger.hd.M0(bcVar.b, str), new org.telegram.messenger.c6(26)));
        int i12 = acVar.c;
        if (i12 != 0) {
            fbVar.setIconPaddingBottom(i12);
        }
        return b(fbVar, 1500);
    }

    public final xb n(bc bcVar, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(bcVar, i7, 0, 0, e6Var);
    }

    public final xb o(bc bcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(bcVar, 1, 0, 0, e6Var);
    }

    public final xb p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        sb sbVar = new sb(W, e6Var);
        g5 g5Var = new g5(1, org.telegram.messenger.m10.t0, j3);
        i9 i9Var = sbVar.a;
        i9Var.setAnimatedEmojiDrawable(g5Var);
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        sbVar.b.setText(str);
        sbVar.c.setText(str2);
        return b(sbVar, 2750);
    }

    public final xb q(TLRPC.Document document, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.c);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.q6.s(fbVar.a, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fbVar.e(document, new String[0]);
        fbVar.b.setText(charSequence);
        fbVar.b.setTextSize(1, 14.0f);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(3);
        return b(fbVar, 2750);
    }

    public final xb r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        fb fbVar = new fb(W, e6Var);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.q6.s(fbVar.a, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fbVar.e(document, new String[0]);
        if (fbVar.a.getImageReceiver() != null) {
            fbVar.a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        fbVar.b.setText(charSequence);
        fbVar.b.setTextSize(1, 14.0f);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(3);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(str);
        vbVar.b = runnable;
        fbVar.setButton(vbVar);
        return b(fbVar, 2750);
    }

    public final xb s(TLRPC.Document document, String str, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.c);
        boolean C4 = org.telegram.messenger.gj.C4(document);
        fh0 fh0Var = ubVar.a;
        if (C4) {
            org.telegram.ui.ActionBar.q6.s(fh0Var, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        ubVar.b.setText(str);
        ubVar.c.setText(charSequence);
        return b(ubVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final xb t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar = new fb(W(), e6Var);
        fbVar.d(R.raw.chats_infotip, new String[0]);
        fbVar.b.setText(charSequence);
        fbVar.b.setSingleLine(false);
        fbVar.b.setMaxLines(2);
        return b(fbVar, 1500);
    }

    public final xb u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        ub ubVar = new ub(W(), e6Var);
        ubVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ubVar.b.setText(str);
        ubVar.c.setText(str2);
        return b(ubVar, 1500);
    }

    public final xb w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        fb fbVar = new fb(W, e6Var);
        fbVar.setBackground(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, e6Var), 12);
        fbVar.a.setImageResource(i7);
        fbVar.b.setText(charSequence);
        fbVar.b.setSingleLine(false);
        fbVar.b.setLines(2);
        fbVar.b.setMaxLines(4);
        TextView textView = fbVar.b;
        textView.setMaxWidth(hi.l3.a(textView.getText(), fbVar.b.getPaint()));
        fbVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) fbVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        fbVar.setWrapWidth();
        return b(fbVar, 5000);
    }

    public final xb y(int i7, TLRPC.Document document, jg.q qVar) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        fb fbVar = new fb(W, e6Var);
        fbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        fbVar.removeView(fbVar.b);
        o5 o5Var = new o5(fbVar.getContext());
        fbVar.b = o5Var;
        o5Var.setTypeface(Typeface.SANS_SERIF);
        fbVar.b.setTextSize(1, 15.0f);
        fbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        fbVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new p5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        fbVar.b.setText(new SpannableStringBuilder(i7 > 1 ? org.telegram.messenger.hd.G(i7, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.hd.M0(2131745878, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            vb vbVar = new vb(W(), e6Var, true);
            vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
            vbVar.b = qVar;
            fbVar.setButton(vbVar);
        }
        fbVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, e6Var));
        fbVar.addView(fbVar.b, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(fbVar, 2750);
    }

    public cc(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = e6Var;
    }
}
