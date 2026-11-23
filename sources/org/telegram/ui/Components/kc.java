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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kc {
    public final org.telegram.ui.ActionBar.g2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.i6 c;

    public kc(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == null || g2Var.getLastStoryViewer() == null || !g2Var.getLastStoryViewer().y()) {
            this.a = g2Var;
            this.b = null;
            this.c = g2Var != null ? g2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            fi.z3 currentPeerView = g2Var.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.M0 : null;
            this.c = g2Var.getLastStoryViewer().E;
        }
    }

    public static fc A(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        return z(g2Var, z10 ? 3 : 4, 0, i6Var);
    }

    public static fc B(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, ai.x0 x0Var, org.telegram.ui.he heVar, org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar = new nb(g2Var.getParentActivity(), i6Var);
        nbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        nbVar.b.setText(org.telegram.messenger.gd.N0(z10 ? 2131748351 : 2131748273, z10 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z10) {
            dc dcVar = new dc(g2Var.getParentActivity(), i6Var, true);
            dcVar.b = x0Var;
            dcVar.c = heVar;
            nbVar.setButton(dcVar);
        }
        return fc.g(g2Var, nbVar, z10 ? 1500 : 5000);
    }

    public static fc C(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        nbVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.f3.q("UserSetAsAdminHint", null, 2131743433, new Object[]{str}, nbVar.b);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static fc D(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        nbVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.f3.q("UserRemovedFromChatHint", null, 2131743484, new Object[]{user.deleted ? org.telegram.messenger.gd.a0("HiddenName", null, 2131749135, new Object[0]) : user.first_name, str}, nbVar.b);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static fc F(FrameLayout frameLayout, boolean z10) {
        return new kc(frameLayout, null).m(z10 ? jc.h : jc.e, 1, -115203550, -1, null);
    }

    public static fc S(int i7, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String N0;
        nb nbVar = new nb(g2Var.getParentActivity(), i6Var);
        boolean z10 = true;
        if (i7 == 0) {
            N0 = org.telegram.messenger.gd.N0(2131745078, null);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            N0 = org.telegram.messenger.gd.N0(2131745080, null);
            z10 = false;
        }
        if (z10) {
            nbVar.d(R.raw.sound_on, new String[0]);
        } else {
            nbVar.d(R.raw.sound_off, new String[0]);
        }
        nbVar.b.setText(N0);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static String W(String str) {
        return "STARGIFT_ALREADY_TRANSFERRED".equals(str) ? org.telegram.messenger.gd.N0(2131749735, null) : org.telegram.messenger.gd.a0(null, null, 2131743631, str);
    }

    public static kc Y() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return new kc(bb.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.w2 ? new kc(((org.telegram.ui.ActionBar.w2) dialog).c, T.getResourceProvider()) : b0(T);
    }

    public static boolean a(org.telegram.ui.ActionBar.g2 g2Var) {
        return (g2Var == null || g2Var.getParentActivity() == null || g2Var.getLayoutContainer() == null) ? false : true;
    }

    public static kc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        return new kc(frameLayout, i6Var);
    }

    public static kc b0(org.telegram.ui.ActionBar.g2 g2Var) {
        return g2Var == null ? Y() : new kc(g2Var);
    }

    public static void c0(String str) {
        if (LaunchActivity.E1) {
            Y().t(W(str), null).j();
        }
    }

    public static fc d(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        String N0;
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (z10) {
            nbVar.d(R.raw.ic_ban, "Hand");
            N0 = org.telegram.messenger.gd.N0(2131743514, null);
        } else {
            nbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.gd.N0(2131743428, null);
        }
        nbVar.b.setText(org.telegram.messenger.g0.W2(N0));
        return fc.g(g2Var, nbVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                c0(str);
                return;
            }
            fc t6 = new kc(frameLayout, i6Var).t(W(str), null);
            t6.r = false;
            t6.j();
        }
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error == null || tL_error.code != 406) {
                Y().t(W(tL_error.text), null).j();
            }
        }
    }

    public static fc j(org.telegram.ui.ActionBar.g2 g2Var) {
        return b0(g2Var).k(false);
    }

    public static fc l(String str, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        String N0;
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (str != null) {
            N0 = org.telegram.messenger.gd.a0(null, null, z10 ? 2131751400 : 2131751398, str);
        } else {
            N0 = org.telegram.messenger.gd.N0(z10 ? 2131751401 : 2131751399, null);
        }
        nbVar.b.setText(org.telegram.messenger.g0.W2(N0));
        nbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return fc.g(g2Var, nbVar, 5000);
    }

    public static fc v(Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.s2 s2Var) {
        nb nbVar;
        int i14;
        SpannableStringBuilder W2;
        fc g10;
        int i15 = 1;
        if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q() || g2Var == null || i7 > 1 || j3 != org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).n || z10) {
            nbVar = new nb(i11, i12, context, g2Var != null ? g2Var.getResourceProvider() : null);
        } else {
            nbVar = new qb(i10, g2Var);
        }
        nb nbVar2 = nbVar;
        boolean z11 = s2Var != null;
        org.telegram.ui.ah ahVar = s2Var != null ? new org.telegram.ui.ah(23, new boolean[]{false}, s2Var) : null;
        if (i7 > 1) {
            i14 = 2;
            W2 = i10 <= 1 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            nbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).n) {
            int i16 = 27;
            if (i10 <= 1) {
                W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750481, null), -1, 2, z10 ? new org.telegram.messenger.j2(29) : new org.telegram.messenger.j2(i16), null);
            } else {
                W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(i16), null);
            }
            nbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            bi.s2 s2Var2 = new bi.s2(ahVar, g2Var, j3, 20);
            if (org.telegram.messenger.n5.z(j3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).O0(Long.valueOf(-j3));
                W2 = i10 <= 1 ? g2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750485, O0.title), -1, 2, s2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750485, O0.title)) : g2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750478, O0.title), -1, 2, s2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750478, O0.title));
            } else {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).c2(Long.valueOf(j3));
                if (i10 <= 1) {
                    int i17 = z11 ? 2131750479 : 2131750480;
                    W2 = g2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i17, org.telegram.messenger.n10.k(c22, true)), -1, 2, s2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i17, org.telegram.messenger.n10.k(c22, true)));
                } else {
                    int i18 = z11 ? 2131750472 : 2131750473;
                    W2 = g2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i18, org.telegram.messenger.n10.k(c22, true)), -1, 2, s2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i18, org.telegram.messenger.n10.k(c22, true)));
                }
            }
            nbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        nbVar2.b.setText(W2);
        if (z11) {
            dc dcVar = new dc(nbVar2.getContext(), g2Var != null ? g2Var.getResourceProvider() : null, true, true);
            dcVar.b = null;
            dcVar.c = ahVar;
            nbVar2.setButton(dcVar);
        }
        nbVar2.postDelayed(new gc(nbVar2, i15), org.telegram.messenger.ks.X4);
        if (frameLayout != null) {
            g10 = fc.f(frameLayout, nbVar2, i13);
        } else {
            if (g2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = fc.g(g2Var, nbVar2, i13);
        }
        if (nbVar2 instanceof qb) {
            nbVar2.b.setSingleLine(false);
            nbVar2.b.setMaxLines(i14);
            ((qb) nbVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fc x(Activity activity, FrameLayout frameLayout, int i7, long j3, int i10, int i11) {
        SpannableStringBuilder W2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        nb nbVar = new nb(i10, i11, activity, null);
        int i13 = 0;
        if (i7 > 1) {
            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToChats", null, 2131748994, org.telegram.messenger.gd.G(i7, "Chats", new Object[0])));
            nbVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748992, null));
                nbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                nbVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    nbVar.postDelayed(new gc(nbVar, i13), i12);
                }
                return fc.f(frameLayout, nbVar, 1500);
            }
            W2 = org.telegram.messenger.n5.z(j3) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToGroup", null, 2131748993, org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).O0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToUser", null, 2131748991, org.telegram.messenger.n10.k(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).c2(Long.valueOf(j3)), true)));
            nbVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = W2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        nbVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return fc.f(frameLayout, nbVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fc z(org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        String a02;
        boolean z10;
        nb nbVar = new nb(g2Var.getParentActivity(), i6Var);
        boolean z11 = true;
        if (i7 == 0) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.G(1, "Hours", new Object[0]));
        } else if (i7 == 1) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.G(8, "Hours", new Object[0]));
        } else if (i7 == 2) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.G(2, "Days", new Object[0]));
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    a02 = org.telegram.messenger.gd.N0(2131747661, null);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i7 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.c0(i10));
                    z10 = true;
                }
                if (!z11) {
                    nbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    nbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    nbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                nbVar.b.setText(a02);
                return fc.g(g2Var, nbVar, 1500);
            }
            a02 = org.telegram.messenger.gd.N0(2131747705, null);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        nbVar.b.setText(a02);
        return fc.g(g2Var, nbVar, 1500);
    }

    public final fc E(org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar = new nb(X(), i6Var);
        nbVar.d(R.raw.chats_infotip, new String[0]);
        nbVar.b.setText(org.telegram.messenger.gd.N0(2131746026, null));
        return b(nbVar, 1500);
    }

    public final fc G(int i7, int i10, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.c);
        nbVar.c(i7, 36, 36, new String[0]);
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
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(i10);
        nbVar.b.setText(charSequence);
        return b(nbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final fc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final fc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        cc ccVar = new cc(X(), this.c);
        ccVar.c(i7, 36, 36, new String[0]);
        ccVar.b.setText(charSequence);
        ccVar.c.setText(charSequence2);
        return b(ccVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final fc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        nb nbVar = new nb(X, i6Var);
        if (i7 != 0) {
            nbVar.c(i7, 36, 36, new String[0]);
        } else {
            nbVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) nbVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setTextDirection(5);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        nbVar.b.setText(charSequence);
        dc dcVar = new dc(X(), i6Var, true, z10);
        dcVar.e(charSequence2);
        dcVar.b = runnable;
        nbVar.setButton(dcVar);
        return b(nbVar, i10);
    }

    public final fc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        return J(i7, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final fc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        cc ccVar = new cc(X, i6Var);
        ccVar.c(i7, 36, 36, new String[0]);
        ccVar.b.setText(str);
        ccVar.c.setText(charSequence);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(str2);
        dcVar.b = runnable;
        ccVar.setButton(dcVar);
        return b(ccVar, 5000);
    }

    public final fc M(Drawable drawable, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.c);
        nbVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.em0) {
            ((org.telegram.ui.em0) drawable).e(nbVar.a);
        }
        nbVar.b.setText(charSequence);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(2);
        return b(nbVar, 2750);
    }

    public final fc N(String str, String str2) {
        cc ccVar = new cc(X(), this.c);
        ccVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ccVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ccVar.b.setText(str);
        ccVar.c.setText(str2);
        return b(ccVar, 5000);
    }

    public final fc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new fb();
        }
        bc bcVar = new bc(X(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        p9 p9Var = bcVar.a;
        p9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = bcVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = bcVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(bcVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final fc P(int i7, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.c);
        nbVar.c(i7, 36, 36, new String[0]);
        nbVar.b.setText(charSequence);
        nbVar.b.setSingleLine(false);
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setMaxLines(4);
        return b(nbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final fc Q(int i7, int i10, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.c);
        nbVar.c(i7, i10, i10, new String[0]);
        nbVar.b.setText(charSequence);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(2);
        return b(nbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final fc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new fb();
        }
        bc bcVar = new bc(X(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        p9 p9Var = bcVar.a;
        p9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = bcVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        bcVar.c.setVisibility(8);
        return b(bcVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final fc T(String str) {
        nb nbVar = new nb(X(), null);
        nbVar.d(R.raw.contact_check, new String[0]);
        nbVar.b.setText(str);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(2);
        return b(nbVar, 1500);
    }

    public final fc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        db dbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (isEmpty) {
            nb nbVar = new nb(X(), i6Var);
            nbVar.b.setText(str);
            nbVar.b.setSingleLine(false);
            nbVar.b.setMaxLines(2);
            dbVar = nbVar;
        } else {
            cc ccVar = new cc(X(), i6Var);
            ccVar.b.setText(str);
            ccVar.c.setText((CharSequence) null);
            dbVar = ccVar;
        }
        dbVar.setTimer();
        dc dcVar = new dc(X(), i6Var, true, z10);
        dcVar.e(org.telegram.messenger.gd.N0(2131743638, null));
        dcVar.b = runnable;
        dcVar.c = runnable2;
        dbVar.setButton(dcVar);
        return b(dbVar, 5000);
    }

    public final fc V(List list, CharSequence charSequence, CharSequence charSequence2, jb.m mVar) {
        float f10;
        int i7;
        Context X = X();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ec ecVar = new ec(X, i6Var, z10);
        d9 d9Var = ecVar.a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    d9Var.setCount(i12);
                    d9Var.b(i7, org.telegram.messenger.i10.t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                d9Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                d9Var.setScaleX(1.2f);
                d9Var.setScaleY(1.2f);
            } else {
                d9Var.setScaleX(1.0f);
                d9Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        d9Var.a(false);
        j80 j80Var = ecVar.b;
        if (charSequence2 != null) {
            j80Var.setSingleLine(true);
            j80Var.setMaxLines(1);
            j80Var.setText(charSequence);
            j80 j80Var2 = ecVar.c;
            j80Var2.setText(charSequence2);
            j80Var2.setSingleLine(false);
            j80Var2.setMaxLines(3);
            LinearLayout linearLayout = ecVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            j80Var.setSingleLine(false);
            j80Var.setMaxLines(4);
            j80Var.setText(charSequence);
            if (j80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    j80Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.a0) {
                    ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (mVar != null) {
            dc dcVar = new dc(X(), i6Var, true);
            dcVar.e(org.telegram.messenger.gd.N0(2131743638, null));
            dcVar.b = (Runnable) mVar.b;
            dcVar.c = (Runnable) mVar.c;
            ecVar.setButton(dcVar);
        }
        return b(ecVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.g2 g2Var = this.a;
        if (g2Var != null) {
            context = g2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.t0.b : context;
    }

    public final fc Z(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new fb() : tL_error == null ? t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null) : t(W(tL_error.text), null);
    }

    public final fc b(db dbVar, int i7) {
        org.telegram.ui.ActionBar.g2 g2Var = this.a;
        return g2Var != null ? fc.g(g2Var, dbVar, i7) : fc.f(this.b, dbVar, i7);
    }

    public final fc c(CharSequence charSequence) {
        if (X() == null) {
            return new fb();
        }
        nb nbVar = new nb(X(), this.c);
        nbVar.d(R.raw.ic_admin, "Shield");
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        nbVar.b.setText(charSequence);
        return b(nbVar, 2750);
    }

    public final fc e(boolean z10) {
        String N0;
        nb nbVar = new nb(X(), this.c);
        if (z10) {
            nbVar.d(R.raw.ic_ban, "Hand");
            N0 = org.telegram.messenger.gd.N0(2131743514, null);
        } else {
            nbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.gd.N0(2131743428, null);
        }
        nbVar.b.setText(org.telegram.messenger.g0.W2(N0));
        return b(nbVar, 1500);
    }

    public final fc f(int i7, Runnable runnable) {
        nb nbVar = new nb(X(), null);
        nbVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.gd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.W2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        nbVar.b.setText(valueOf);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        return b(nbVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                fc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else {
                fc t10 = t(W(str), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final fc g(String str, ArrayList arrayList) {
        ec ecVar = new ec(X(), this.c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                ecVar.a.setCount(i11);
                ecVar.a.b(i7, org.telegram.messenger.i10.t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            ecVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            ecVar.a.setScaleX(1.2f);
            ecVar.a.setScaleY(1.2f);
        } else {
            ecVar.a.setScaleX(1.0f);
            ecVar.a.setScaleY(1.0f);
        }
        ecVar.a.a(false);
        ecVar.b.setSingleLine(false);
        ecVar.b.setMaxLines(2);
        ecVar.b.setText(str);
        if (ecVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.gd.a0) {
                ((ViewGroup.MarginLayoutParams) ecVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) ecVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.gd.a0) {
            ecVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(ecVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                fc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                fc t10 = t(W(tL_error.text), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final fc h(TLRPC.Document document, int i7, final org.telegram.messenger.w10 w10Var) {
        o80 o80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(document);
        if (i12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).o0(i12, true);
        final int i11 = 0;
        if (o02 != null && (stickerSet = o02.set) != null) {
            return r(document, i7 == 1 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743777, stickerSet.title)) : i7 == 2 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744455, stickerSet.title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748403, stickerSet.title)), org.telegram.messenger.gd.N0(2131743313, null), new Runnable() { // from class: org.telegram.ui.Components.hc
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            w10Var.a(i12);
                            break;
                        default:
                            w10Var.a(i12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i7 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743777, "<{LOADING}>"))) : i7 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744455, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748403, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (indexOf >= 0) {
            o80Var = new o80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), i6Var);
            spannableStringBuilder.setSpan(o80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.n6.yj;
            o80Var.a(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 32), i0.a.o(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 72));
        } else {
            o80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String N0 = org.telegram.messenger.gd.N0(2131743313, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.hc
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        w10Var.a(i12);
                        break;
                    default:
                        w10Var.a(i12);
                        break;
                }
            }
        };
        Context X = X();
        mb mbVar = new mb(X, i6Var);
        j80 j80Var = new j80(X, null);
        mbVar.d = j80Var;
        j80Var.setDisablePaddingsOffset(true);
        j80Var.setSingleLine();
        j80Var.setTypeface(Typeface.SANS_SERIF);
        j80Var.setTextSize(1, 15.0f);
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        j80Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        mbVar.b.setVisibility(8);
        mbVar.addView(j80Var, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.n6.yj;
        mbVar.setTextColor(mbVar.getThemedColor(i14));
        if (org.telegram.messenger.fj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.u6.s(mbVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        mbVar.e(document, new String[0]);
        mbVar.b.setTextSize(1, 14.0f);
        mbVar.b.setSingleLine(false);
        mbVar.b.setMaxLines(3);
        j80Var.setText(spannableStringBuilder);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setSingleLine(false);
        j80Var.setMaxLines(3);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(N0);
        dcVar.b = runnable;
        mbVar.setButton(dcVar);
        fc b10 = b(mbVar, 2750);
        if (o80Var != null) {
            kb kbVar = b10.e;
            if (kbVar instanceof mb) {
                o80Var.b = ((mb) kbVar).d;
            }
        }
        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).n0(inputStickerSet, null, false, false, new bi.d5(i7, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i7, long j3) {
        org.telegram.ui.ActionBar.g2 g2Var;
        if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q() && (g2Var = this.a) != null) {
            qb qbVar = new qb(i7, g2Var);
            if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).n) {
                int i10 = 27;
                SpannableStringBuilder R2 = i7 <= 1 ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750481, null), -1, 2, new org.telegram.messenger.j2(i10), null) : org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(i10), null);
                qbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                qbVar.b.setText(R2);
                qbVar.b.setSingleLine(false);
                qbVar.b.setMaxLines(2);
                fc b10 = b(qbVar, 3500);
                qbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final fc i(String str) {
        if (!org.telegram.messenger.g0.G3()) {
            return new fb();
        }
        nb nbVar = new nb(X(), null);
        nbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        nbVar.b.setText(str);
        return b(nbVar, 1500);
    }

    public final fc k(boolean z10) {
        if (!org.telegram.messenger.g0.G3()) {
            return new fb();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (!z10) {
            nb nbVar = new nb(X(), i6Var);
            nbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            nbVar.b.setText(org.telegram.messenger.gd.N0(2131748728, null));
            return b(nbVar, 1500);
        }
        cc ccVar = new cc(X(), i6Var);
        ccVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ccVar.b.setText(org.telegram.messenger.gd.N0(2131748728, null));
        ccVar.c.setText(org.telegram.messenger.gd.N0(2131748726, null));
        return b(ccVar, 2750);
    }

    public final fc m(jc jcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        ic icVar = jcVar.d;
        nb nbVar = (i10 == 0 || i11 == 0) ? new nb(X(), i6Var) : new nb(i10, i11, X(), i6Var);
        nbVar.d(icVar.a, icVar.b);
        TextView textView = nbVar.b;
        String str = jcVar.a;
        textView.setText(org.telegram.messenger.g0.T2(jcVar.c ? org.telegram.messenger.gd.G(i7, str, new Object[0]) : org.telegram.messenger.gd.N0(jcVar.b, str), new org.telegram.messenger.j2(28)));
        int i12 = icVar.c;
        if (i12 != 0) {
            nbVar.setIconPaddingBottom(i12);
        }
        return b(nbVar, 1500);
    }

    public final fc n(jc jcVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(jcVar, i7, 0, 0, i6Var);
    }

    public final fc o(jc jcVar, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(jcVar, 1, 0, 0, i6Var);
    }

    public final fc p(long j3, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ac acVar = new ac(X, i6Var);
        o5 o5Var = new o5(1, org.telegram.messenger.i10.t0, j3);
        p9 p9Var = acVar.a;
        p9Var.setAnimatedEmojiDrawable(o5Var);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
        acVar.b.setText(str);
        acVar.c.setText(str2);
        return b(acVar, 2750);
    }

    public final fc q(TLRPC.Document document, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.c);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(nbVar.a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        nbVar.e(document, new String[0]);
        nbVar.b.setText(charSequence);
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        return b(nbVar, 2750);
    }

    public final fc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        nb nbVar = new nb(X, i6Var);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(nbVar.a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        nbVar.e(document, new String[0]);
        if (nbVar.a.getImageReceiver() != null) {
            nbVar.a.getImageReceiver().K0(org.telegram.messenger.g0.L(4.0f));
        }
        nbVar.b.setText(charSequence);
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(str);
        dcVar.b = runnable;
        nbVar.setButton(dcVar);
        return b(nbVar, 2750);
    }

    public final fc s(TLRPC.Document document, String str, CharSequence charSequence) {
        cc ccVar = new cc(X(), this.c);
        boolean C4 = org.telegram.messenger.fj.C4(document);
        qh0 qh0Var = ccVar.a;
        if (C4) {
            org.telegram.ui.ActionBar.u6.s(qh0Var, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        qh0Var.setAutoRepeat(true);
        qh0Var.g(36, 36, document);
        ccVar.b.setText(str);
        ccVar.c.setText(charSequence);
        return b(ccVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final fc t(CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar = new nb(X(), i6Var);
        nbVar.d(R.raw.chats_infotip, new String[0]);
        nbVar.b.setText(charSequence);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(2);
        return b(nbVar, 1500);
    }

    public final fc u(String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        cc ccVar = new cc(X(), i6Var);
        ccVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ccVar.b.setText(str);
        ccVar.c.setText(str2);
        return b(ccVar, 1500);
    }

    public final fc w(int i7, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        nb nbVar = new nb(X, i6Var);
        nbVar.setBackground(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, i6Var), 12);
        nbVar.a.setImageResource(i7);
        nbVar.b.setText(charSequence);
        nbVar.b.setSingleLine(false);
        nbVar.b.setLines(2);
        nbVar.b.setMaxLines(4);
        TextView textView = nbVar.b;
        textView.setMaxWidth(hi.u3.a(textView.getText(), nbVar.b.getPaint()));
        nbVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) nbVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        nbVar.setWrapWidth();
        return b(nbVar, 5000);
    }

    public final fc y(int i7, TLRPC.Document document, jg.q qVar) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        nb nbVar = new nb(X, i6Var);
        nbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        nbVar.removeView(nbVar.b);
        w5 w5Var = new w5(nbVar.getContext());
        nbVar.b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        nbVar.b.setTextSize(1, 15.0f);
        nbVar.b.setEllipsize(TextUtils.TruncateAt.END);
        nbVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        nbVar.b.setText(new SpannableStringBuilder(i7 > 1 ? org.telegram.messenger.gd.G(i7, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.gd.N0(2131745682, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            dc dcVar = new dc(X(), i6Var, true);
            dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
            dcVar.b = qVar;
            nbVar.setButton(dcVar);
        }
        nbVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var));
        nbVar.addView(nbVar.b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(nbVar, 2750);
    }

    public kc(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = i6Var;
    }
}
