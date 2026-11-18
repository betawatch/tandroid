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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class lc {
    public final org.telegram.ui.ActionBar.h2 a;
    public final FrameLayout b;
    public final org.telegram.ui.ActionBar.i6 c;

    public lc(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var == null || h2Var.getLastStoryViewer() == null || !h2Var.getLastStoryViewer().y()) {
            this.a = h2Var;
            this.b = null;
            this.c = h2Var != null ? h2Var.getResourceProvider() : null;
        } else {
            this.a = null;
            fi.z3 currentPeerView = h2Var.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.M0 : null;
            this.c = h2Var.getLastStoryViewer().E;
        }
    }

    public static gc A(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        return z(h2Var, z10 ? 3 : 4, 0, i6Var);
    }

    public static gc B(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, bi.t4 t4Var, org.telegram.ui.he heVar, org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar = new ob(h2Var.getParentActivity(), i6Var);
        obVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        obVar.b.setText(org.telegram.messenger.gd.M0(z10 ? 2131748352 : 2131748274, z10 ? "MessagePinnedHint" : "MessageUnpinnedHint"));
        if (!z10) {
            ec ecVar = new ec(h2Var.getParentActivity(), i6Var, true);
            ecVar.b = t4Var;
            ecVar.c = heVar;
            obVar.setButton(ecVar);
        }
        return gc.g(h2Var, obVar, z10 ? 1500 : 5000);
    }

    public static gc C(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        obVar.d(R.raw.ic_admin, "Shield");
        org.telegram.messenger.f3.q("UserSetAsAdminHint", null, 2131743443, new Object[]{str}, obVar.b);
        return gc.g(h2Var, obVar, 1500);
    }

    public static gc D(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, String str) {
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        obVar.d(R.raw.ic_ban, "Hand");
        org.telegram.messenger.f3.q("UserRemovedFromChatHint", null, 2131743494, new Object[]{user.deleted ? org.telegram.messenger.gd.a0("HiddenName", null, 2131749136, new Object[0]) : user.first_name, str}, obVar.b);
        return gc.g(h2Var, obVar, 1500);
    }

    public static gc F(FrameLayout frameLayout, boolean z10) {
        return new lc(frameLayout, null).m(z10 ? kc.h : kc.e, 1, -115203550, -1, null);
    }

    public static gc S(int i7, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String M0;
        ob obVar = new ob(h2Var.getParentActivity(), i6Var);
        boolean z10 = true;
        if (i7 == 0) {
            M0 = org.telegram.messenger.gd.M0(2131745079, null);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            M0 = org.telegram.messenger.gd.M0(2131745081, null);
            z10 = false;
        }
        if (z10) {
            obVar.d(R.raw.sound_on, new String[0]);
        } else {
            obVar.d(R.raw.sound_off, new String[0]);
        }
        obVar.b.setText(M0);
        return gc.g(h2Var, obVar, 1500);
    }

    public static String W(String str) {
        return "STARGIFT_ALREADY_TRANSFERRED".equals(str) ? org.telegram.messenger.gd.M0(2131749736, null) : org.telegram.messenger.gd.a0(null, null, 2131743641, str);
    }

    public static lc Y() {
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T == null) {
            return new lc(cb.a(org.telegram.messenger.t0.b), null);
        }
        Dialog dialog = T.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.x2 ? new lc(((org.telegram.ui.ActionBar.x2) dialog).c, T.getResourceProvider()) : b0(T);
    }

    public static boolean a(org.telegram.ui.ActionBar.h2 h2Var) {
        return (h2Var == null || h2Var.getParentActivity() == null || h2Var.getLayoutContainer() == null) ? false : true;
    }

    public static lc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        return new lc(frameLayout, i6Var);
    }

    public static lc b0(org.telegram.ui.ActionBar.h2 h2Var) {
        return h2Var == null ? Y() : new lc(h2Var);
    }

    public static void c0(String str) {
        if (LaunchActivity.E1) {
            Y().t(W(str), null).j();
        }
    }

    public static gc d(org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        String M0;
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.gd.M0(2131743524, null);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.gd.M0(2131743438, null);
        }
        obVar.b.setText(org.telegram.messenger.g0.W2(M0));
        return gc.g(h2Var, obVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                c0(str);
                return;
            }
            gc t6 = new lc(frameLayout, i6Var).t(W(str), null);
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

    public static gc j(org.telegram.ui.ActionBar.h2 h2Var) {
        return b0(h2Var).k(false);
    }

    public static gc l(String str, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        String M0;
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        if (str != null) {
            M0 = org.telegram.messenger.gd.a0(null, null, z10 ? 2131751401 : 2131751399, str);
        } else {
            M0 = org.telegram.messenger.gd.M0(z10 ? 2131751402 : 2131751400, null);
        }
        obVar.b.setText(org.telegram.messenger.g0.W2(M0));
        obVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return gc.g(h2Var, obVar, 5000);
    }

    public static gc v(Context context, org.telegram.ui.ActionBar.h2 h2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.m2 m2Var) {
        ob obVar;
        int i14;
        SpannableStringBuilder W2;
        gc g10;
        int i15 = 1;
        if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q() || h2Var == null || i7 > 1 || j3 != org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n || z10) {
            obVar = new ob(i11, i12, context, h2Var != null ? h2Var.getResourceProvider() : null);
        } else {
            obVar = new rb(i10, h2Var);
        }
        ob obVar2 = obVar;
        boolean z11 = m2Var != null;
        org.telegram.ui.ci ciVar = m2Var != null ? new org.telegram.ui.ci(19, new boolean[]{false}, m2Var) : null;
        if (i7 > 1) {
            i14 = 2;
            W2 = i10 <= 1 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessageToManyChats", new Object[0])) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            obVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n) {
            int i16 = 27;
            if (i10 <= 1) {
                W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750482, null), -1, 2, z10 ? new org.telegram.messenger.j2(29) : new org.telegram.messenger.j2(i16), null);
            } else {
                W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750475, null), -1, 2, new org.telegram.messenger.j2(i16), null);
            }
            obVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i14 = 2;
        } else {
            i14 = 2;
            bi.m2 m2Var2 = new bi.m2(ciVar, h2Var, j3, 20);
            if (org.telegram.messenger.n5.z(j3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(-j3));
                W2 = i10 <= 1 ? h2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750486, O0.title), -1, 2, m2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750486, O0.title)) : h2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750479, O0.title), -1, 2, m2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750479, O0.title));
            } else {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).c2(Long.valueOf(j3));
                if (i10 <= 1) {
                    int i17 = z11 ? 2131750480 : 2131750481;
                    W2 = h2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i17, org.telegram.messenger.o10.k(c22, true)), -1, 2, m2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i17, org.telegram.messenger.o10.k(c22, true)));
                } else {
                    int i18 = z11 ? 2131750473 : 2131750474;
                    W2 = h2Var != null ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i18, org.telegram.messenger.o10.k(c22, true)), -1, 2, m2Var2, null) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i18, org.telegram.messenger.o10.k(c22, true)));
                }
            }
            obVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        obVar2.b.setText(W2);
        if (z11) {
            ec ecVar = new ec(obVar2.getContext(), h2Var != null ? h2Var.getResourceProvider() : null, true, true);
            ecVar.b = null;
            ecVar.c = ciVar;
            obVar2.setButton(ecVar);
        }
        obVar2.postDelayed(new hc(obVar2, i15), org.telegram.messenger.ks.X4);
        if (frameLayout != null) {
            g10 = gc.f(frameLayout, obVar2, i13);
        } else {
            if (h2Var == null) {
                throw new IllegalArgumentException();
            }
            g10 = gc.g(h2Var, obVar2, i13);
        }
        if (obVar2 instanceof rb) {
            obVar2.b.setSingleLine(false);
            obVar2.b.setMaxLines(i14);
            ((rb) obVar2).setBulletin(g10);
            g10.r = false;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc x(Activity activity, FrameLayout frameLayout, int i7, long j3, int i10, int i11) {
        SpannableStringBuilder W2;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        ob obVar = new ob(i10, i11, activity, null);
        int i13 = 0;
        if (i7 > 1) {
            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToChats", null, 2131748995, org.telegram.messenger.gd.G(i7, "Chats", new Object[0])));
            obVar.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n) {
                spannableStringBuilder = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748993, null));
                obVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i12 = -1;
                obVar.b.setText(spannableStringBuilder);
                if (i12 > 0) {
                    obVar.postDelayed(new hc(obVar, i13), i12);
                }
                return gc.f(frameLayout, obVar, 1500);
            }
            W2 = org.telegram.messenger.n5.z(j3) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToGroup", null, 2131748994, org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(-j3)).title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("InvLinkToUser", null, 2131748992, org.telegram.messenger.o10.k(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).c2(Long.valueOf(j3)), true)));
            obVar.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = W2;
        i12 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        obVar.b.setText(spannableStringBuilder);
        if (i12 > 0) {
        }
        return gc.f(frameLayout, obVar, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc z(org.telegram.ui.ActionBar.h2 h2Var, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        String a02;
        boolean z10;
        ob obVar = new ob(h2Var.getParentActivity(), i6Var);
        boolean z11 = true;
        if (i7 == 0) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.G(1, "Hours", new Object[0]));
        } else if (i7 == 1) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.G(8, "Hours", new Object[0]));
        } else if (i7 == 2) {
            a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.G(2, "Days", new Object[0]));
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    a02 = org.telegram.messenger.gd.M0(2131747662, null);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i7 != 5) {
                        throw new IllegalArgumentException();
                    }
                    a02 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.c0(i10));
                    z10 = true;
                }
                if (!z11) {
                    obVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    obVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    obVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                obVar.b.setText(a02);
                return gc.g(h2Var, obVar, 1500);
            }
            a02 = org.telegram.messenger.gd.M0(2131747706, null);
        }
        z10 = true;
        z11 = false;
        if (!z11) {
        }
        obVar.b.setText(a02);
        return gc.g(h2Var, obVar, 1500);
    }

    public final gc E(org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar = new ob(X(), i6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(org.telegram.messenger.gd.M0(2131746027, null));
        return b(obVar, 1500);
    }

    public final gc G(int i7, int i10, CharSequence charSequence) {
        ob obVar = new ob(X(), this.c);
        obVar.c(i7, 36, 36, new String[0]);
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
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(i10);
        obVar.b.setText(charSequence);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final gc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        dc dcVar = new dc(X(), this.c);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.b.setText(charSequence);
        dcVar.c.setText(charSequence2);
        return b(dcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ob obVar = new ob(X, i6Var);
        if (i7 != 0) {
            obVar.c(i7, 36, 36, new String[0]);
        } else {
            obVar.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) obVar.b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setTextDirection(5);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        obVar.b.setText(charSequence);
        ec ecVar = new ec(X(), i6Var, true, z10);
        ecVar.e(charSequence2);
        ecVar.b = runnable;
        obVar.setButton(ecVar);
        return b(obVar, i10);
    }

    public final gc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        return J(i7, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final gc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        dc dcVar = new dc(X, i6Var);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.b.setText(str);
        dcVar.c.setText(charSequence);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(str2);
        ecVar.b = runnable;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc M(Drawable drawable, CharSequence charSequence) {
        ob obVar = new ob(X(), this.c);
        obVar.a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.gm0) {
            ((org.telegram.ui.gm0) drawable).e(obVar.a);
        }
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 2750);
    }

    public final gc N(String str, String str2) {
        dc dcVar = new dc(X(), this.c);
        dcVar.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        dcVar.b.setText(str);
        dcVar.c.setText(str2);
        return b(dcVar, 5000);
    }

    public final gc O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new gb();
        }
        cc ccVar = new cc(X(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        q9 q9Var = ccVar.a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = ccVar.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(ccVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final gc P(int i7, CharSequence charSequence) {
        ob obVar = new ob(X(), this.c);
        obVar.c(i7, 36, 36, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setMaxLines(4);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc Q(int i7, int i10, CharSequence charSequence) {
        ob obVar = new ob(X(), this.c);
        obVar.c(i7, i10, i10, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final gc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new gb();
        }
        cc ccVar = new cc(X(), this.c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        q9 q9Var = ccVar.a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ccVar.c.setVisibility(8);
        return b(ccVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final gc T(String str) {
        ob obVar = new ob(X(), null);
        obVar.d(R.raw.contact_check, new String[0]);
        obVar.b.setText(str);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        eb ebVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (isEmpty) {
            ob obVar = new ob(X(), i6Var);
            obVar.b.setText(str);
            obVar.b.setSingleLine(false);
            obVar.b.setMaxLines(2);
            ebVar = obVar;
        } else {
            dc dcVar = new dc(X(), i6Var);
            dcVar.b.setText(str);
            dcVar.c.setText((CharSequence) null);
            ebVar = dcVar;
        }
        ebVar.setTimer();
        ec ecVar = new ec(X(), i6Var, true, z10);
        ecVar.e(org.telegram.messenger.gd.M0(2131743648, null));
        ecVar.b = runnable;
        ecVar.c = runnable2;
        ebVar.setButton(ecVar);
        return b(ebVar, 5000);
    }

    public final gc V(List list, CharSequence charSequence, CharSequence charSequence2, k8.a aVar) {
        float f10;
        int i7;
        Context X = X();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        fc fcVar = new fc(X, i6Var, z10);
        e9 e9Var = fcVar.a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    e9Var.setCount(i12);
                    e9Var.b(i7, org.telegram.messenger.j10.t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                e9Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                e9Var.setScaleX(1.2f);
                e9Var.setScaleY(1.2f);
            } else {
                e9Var.setScaleX(1.0f);
                e9Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        e9Var.a(false);
        k80 k80Var = fcVar.b;
        if (charSequence2 != null) {
            k80Var.setSingleLine(true);
            k80Var.setMaxLines(1);
            k80Var.setText(charSequence);
            k80 k80Var2 = fcVar.c;
            k80Var2.setText(charSequence2);
            k80Var2.setSingleLine(false);
            k80Var2.setMaxLines(3);
            LinearLayout linearLayout = fcVar.d;
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
            k80Var.setSingleLine(false);
            k80Var.setMaxLines(4);
            k80Var.setText(charSequence);
            if (k80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    k80Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.a0) {
                    ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (aVar != null) {
            ec ecVar = new ec(X(), i6Var, true);
            ecVar.e(org.telegram.messenger.gd.M0(2131743648, null));
            ecVar.b = (Runnable) aVar.b;
            ecVar.c = (Runnable) aVar.c;
            fcVar.setButton(ecVar);
        }
        return b(fcVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var != null) {
            context = h2Var.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? org.telegram.messenger.t0.b : context;
    }

    public final gc Z(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new gb() : tL_error == null ? t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null) : t(W(tL_error.text), null);
    }

    public final gc b(eb ebVar, int i7) {
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        return h2Var != null ? gc.g(h2Var, ebVar, i7) : gc.f(this.b, ebVar, i7);
    }

    public final gc c(CharSequence charSequence) {
        if (X() == null) {
            return new gb();
        }
        ob obVar = new ob(X(), this.c);
        obVar.d(R.raw.ic_admin, "Shield");
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        obVar.b.setText(charSequence);
        return b(obVar, 2750);
    }

    public final gc e(boolean z10) {
        String M0;
        ob obVar = new ob(X(), this.c);
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            M0 = org.telegram.messenger.gd.M0(2131743524, null);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.gd.M0(2131743438, null);
        }
        obVar.b.setText(org.telegram.messenger.g0.W2(M0));
        return b(obVar, 1500);
    }

    public final gc f(int i7, Runnable runnable) {
        ob obVar = new ob(X(), null);
        obVar.d(R.raw.caption_limit, new String[0]);
        String G = org.telegram.messenger.gd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.W2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        obVar.b.setText(valueOf);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        return b(obVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                gc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else {
                gc t10 = t(W(str), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final gc g(String str, ArrayList arrayList) {
        fc fcVar = new fc(X(), this.c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                fcVar.a.setCount(i11);
                fcVar.a.b(i7, org.telegram.messenger.j10.t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            fcVar.a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            fcVar.a.setScaleX(1.2f);
            fcVar.a.setScaleY(1.2f);
        } else {
            fcVar.a.setScaleX(1.0f);
            fcVar.a.setScaleY(1.0f);
        }
        fcVar.a.a(false);
        fcVar.b.setSingleLine(false);
        fcVar.b.setMaxLines(2);
        fcVar.b.setText(str);
        if (fcVar.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.gd.a0) {
                ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) fcVar.b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.gd.a0) {
            fcVar.a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(fcVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                gc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null);
                t6.r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                gc t10 = t(W(tL_error.text), null);
                t10.r = false;
                t10.k(z10);
            }
        }
    }

    public final gc h(TLRPC.Document document, int i7, final org.telegram.messenger.x10 x10Var) {
        p80 p80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(document);
        if (i12 == null) {
            return null;
        }
        final int i10 = 1;
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.t0).o0(i12, true);
        final int i11 = 0;
        if (o02 != null && (stickerSet = o02.set) != null) {
            return r(document, i7 == 1 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, stickerSet.title)) : i7 == 2 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, stickerSet.title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, stickerSet.title)), org.telegram.messenger.gd.M0(2131743326, null), new Runnable() { // from class: org.telegram.ui.Components.ic
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            x10Var.a(i12);
                            break;
                        default:
                            x10Var.a(i12);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i7 == 1 ? new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, "<{LOADING}>"))) : i7 == 2 ? new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, "<{LOADING}>"))) : new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (indexOf >= 0) {
            p80Var = new p80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), i6Var);
            spannableStringBuilder.setSpan(p80Var, indexOf, indexOf + 11, 33);
            int i13 = org.telegram.ui.ActionBar.n6.yj;
            p80Var.a(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 32), i0.a.o(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 72));
        } else {
            p80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.gd.M0(2131743326, null);
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ic
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        x10Var.a(i12);
                        break;
                    default:
                        x10Var.a(i12);
                        break;
                }
            }
        };
        Context X = X();
        nb nbVar = new nb(X, i6Var);
        k80 k80Var = new k80(X, null);
        nbVar.d = k80Var;
        k80Var.setDisablePaddingsOffset(true);
        k80Var.setSingleLine();
        k80Var.setTypeface(Typeface.SANS_SERIF);
        k80Var.setTextSize(1, 15.0f);
        k80Var.setEllipsize(TextUtils.TruncateAt.END);
        k80Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        nbVar.b.setVisibility(8);
        nbVar.addView(k80Var, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i14 = org.telegram.ui.ActionBar.n6.yj;
        nbVar.setTextColor(nbVar.getThemedColor(i14));
        if (org.telegram.messenger.fj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.u6.s(nbVar.a, i14, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        nbVar.e(document, new String[0]);
        nbVar.b.setTextSize(1, 14.0f);
        nbVar.b.setSingleLine(false);
        nbVar.b.setMaxLines(3);
        k80Var.setText(spannableStringBuilder);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setSingleLine(false);
        k80Var.setMaxLines(3);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(M0);
        ecVar.b = runnable;
        nbVar.setButton(ecVar);
        gc b10 = b(nbVar, 2750);
        if (p80Var != null) {
            lb lbVar = b10.e;
            if (lbVar instanceof nb) {
                p80Var.b = ((nb) lbVar).d;
            }
        }
        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.t0).n0(inputStickerSet, null, false, false, new bi.x4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i7, long j3) {
        org.telegram.ui.ActionBar.h2 h2Var;
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q() && (h2Var = this.a) != null) {
            rb rbVar = new rb(i7, h2Var);
            if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).n) {
                int i10 = 27;
                SpannableStringBuilder R2 = i7 <= 1 ? org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750482, null), -1, 2, new org.telegram.messenger.j2(i10), null) : org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750475, null), -1, 2, new org.telegram.messenger.j2(i10), null);
                rbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                rbVar.b.setText(R2);
                rbVar.b.setSingleLine(false);
                rbVar.b.setMaxLines(2);
                gc b10 = b(rbVar, 3500);
                rbVar.setBulletin(b10);
                b10.r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final gc i(String str) {
        if (!org.telegram.messenger.g0.G3()) {
            return new gb();
        }
        ob obVar = new ob(X(), null);
        obVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        obVar.b.setText(str);
        return b(obVar, 1500);
    }

    public final gc k(boolean z10) {
        if (!org.telegram.messenger.g0.G3()) {
            return new gb();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        if (!z10) {
            ob obVar = new ob(X(), i6Var);
            obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            obVar.b.setText(org.telegram.messenger.gd.M0(2131748729, null));
            return b(obVar, 1500);
        }
        dc dcVar = new dc(X(), i6Var);
        dcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        dcVar.b.setText(org.telegram.messenger.gd.M0(2131748729, null));
        dcVar.c.setText(org.telegram.messenger.gd.M0(2131748727, null));
        return b(dcVar, 2750);
    }

    public final gc m(kc kcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        jc jcVar = kcVar.d;
        ob obVar = (i10 == 0 || i11 == 0) ? new ob(X(), i6Var) : new ob(i10, i11, X(), i6Var);
        obVar.d(jcVar.a, jcVar.b);
        TextView textView = obVar.b;
        String str = kcVar.a;
        textView.setText(org.telegram.messenger.g0.T2(kcVar.c ? org.telegram.messenger.gd.G(i7, str, new Object[0]) : org.telegram.messenger.gd.M0(kcVar.b, str), new org.telegram.messenger.j2(28)));
        int i12 = jcVar.c;
        if (i12 != 0) {
            obVar.setIconPaddingBottom(i12);
        }
        return b(obVar, 1500);
    }

    public final gc n(kc kcVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(kcVar, i7, 0, 0, i6Var);
    }

    public final gc o(kc kcVar, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(kcVar, 1, 0, 0, i6Var);
    }

    public final gc p(long j3, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        bc bcVar = new bc(X, i6Var);
        o5 o5Var = new o5(1, org.telegram.messenger.j10.t0, j3);
        q9 q9Var = bcVar.a;
        q9Var.setAnimatedEmojiDrawable(o5Var);
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
        bcVar.b.setText(str);
        bcVar.c.setText(str2);
        return b(bcVar, 2750);
    }

    public final gc q(TLRPC.Document document, CharSequence charSequence) {
        ob obVar = new ob(X(), this.c);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(obVar.a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        return b(obVar, 2750);
    }

    public final gc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ob obVar = new ob(X, i6Var);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(obVar.a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        if (obVar.a.getImageReceiver() != null) {
            obVar.a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        obVar.b.setText(charSequence);
        obVar.b.setTextSize(1, 14.0f);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(3);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(str);
        ecVar.b = runnable;
        obVar.setButton(ecVar);
        return b(obVar, 2750);
    }

    public final gc s(TLRPC.Document document, String str, CharSequence charSequence) {
        dc dcVar = new dc(X(), this.c);
        boolean C4 = org.telegram.messenger.fj.C4(document);
        ph0 ph0Var = dcVar.a;
        if (C4) {
            org.telegram.ui.ActionBar.u6.s(ph0Var, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        ph0Var.setAutoRepeat(true);
        ph0Var.g(36, 36, document);
        dcVar.b.setText(str);
        dcVar.c.setText(charSequence);
        return b(dcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final gc t(CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar = new ob(X(), i6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc u(String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        dc dcVar = new dc(X(), i6Var);
        dcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        dcVar.b.setText(str);
        dcVar.c.setText(str2);
        return b(dcVar, 1500);
    }

    public final gc w(int i7, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ob obVar = new ob(X, i6Var);
        obVar.setBackground(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, i6Var), 12);
        obVar.a.setImageResource(i7);
        obVar.b.setText(charSequence);
        obVar.b.setSingleLine(false);
        obVar.b.setLines(2);
        obVar.b.setMaxLines(4);
        TextView textView = obVar.b;
        textView.setMaxWidth(hi.m3.a(textView.getText(), obVar.b.getPaint()));
        obVar.b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) obVar.b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        obVar.setWrapWidth();
        return b(obVar, 5000);
    }

    public final gc y(int i7, TLRPC.Document document, jg.q qVar) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ob obVar = new ob(X, i6Var);
        obVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        obVar.removeView(obVar.b);
        w5 w5Var = new w5(obVar.getContext());
        obVar.b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        obVar.b.setTextSize(1, 15.0f);
        obVar.b.setEllipsize(TextUtils.TruncateAt.END);
        obVar.b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        obVar.b.setText(new SpannableStringBuilder(i7 > 1 ? org.telegram.messenger.gd.G(i7, "SavedTagMessagesTagged", new Object[0]) : org.telegram.messenger.gd.M0(2131745683, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            ec ecVar = new ec(X(), i6Var, true);
            ecVar.e(org.telegram.messenger.gd.M0(2131743326, null));
            ecVar.b = qVar;
            obVar.setButton(ecVar);
        }
        obVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var));
        obVar.addView(obVar.b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(obVar, 2750);
    }

    public lc(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.b = frameLayout;
        this.a = null;
        this.c = i6Var;
    }
}
