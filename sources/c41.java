// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c41 {
    public final d a;
    public final FrameLayout b;
    public final ylb c;

    public c41(d dVar) {
        if (dVar == null || dVar.getLastStoryViewer() == null || !dVar.getLastStoryViewer().y()) {
            this.a = dVar;
            this.b = null;
            this.c = dVar != null ? dVar.getResourceProvider() : null;
        } else {
            this.a = null;
            a58 currentPeerView = dVar.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.S0 : null;
            this.c = dVar.getLastStoryViewer().E;
        }
    }

    public static u31 A(d dVar, boolean z, ylb ylbVar) {
        return z(dVar, z ? 3 : 4, 0, ylbVar);
    }

    public static u31 B(d dVar, boolean z, up6 up6Var, jm1 jm1Var, ylb ylbVar) {
        String str;
        int i;
        int i2;
        b31 b31Var = new b31(dVar.getParentActivity(), ylbVar);
        b31Var.c(z ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        TextView textView = b31Var.b;
        if (z) {
            str = "MessagePinnedHint";
            i = 2131748301;
        } else {
            str = "MessageUnpinnedHint";
            i = 2131748223;
        }
        textView.setText(jb6.M0(i, str));
        if (z) {
            i2 = 1500;
        } else {
            s31 s31Var = new s31(ylbVar, dVar.getParentActivity(), true);
            s31Var.b = up6Var;
            s31Var.c = jm1Var;
            b31Var.setButton(s31Var);
            i2 = 5000;
        }
        return u31.g(dVar, b31Var, i2);
    }

    public static u31 C(String str, d dVar) {
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        b31Var.d(R.raw.ic_admin, "Shield");
        hg9.q("UserSetAsAdminHint", null, 2131743367, new Object[]{str}, b31Var.b);
        return u31.g(dVar, b31Var, 1500);
    }

    public static u31 D(d dVar, TLRPC.User user, String str) {
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        b31Var.d(R.raw.ic_ban, "Hand");
        hg9.q("UserRemovedFromChatHint", null, 2131743418, new Object[]{user.deleted ? jb6.a0("HiddenName", null, 2131749085, new Object[0]) : user.first_name, str}, b31Var.b);
        return u31.g(dVar, b31Var, 1500);
    }

    public static u31 F(FrameLayout frameLayout, boolean z) {
        return new c41(frameLayout, null).m(z ? b41.h : b41.e, 1, -115203550, -1, null);
    }

    public static u31 S(int i, ylb ylbVar, d dVar) {
        String M0;
        b31 b31Var = new b31(dVar.getParentActivity(), ylbVar);
        boolean z = true;
        if (i == 0) {
            M0 = jb6.M0(2131745008, null);
        } else {
            if (i != 1) {
                i98.g();
                return null;
            }
            M0 = jb6.M0(2131745010, null);
            z = false;
        }
        if (z) {
            b31Var.d(R.raw.sound_on, new String[0]);
        } else {
            b31Var.d(R.raw.sound_off, new String[0]);
        }
        b31Var.b.setText(M0);
        return u31.g(dVar, b31Var, 1500);
    }

    public static String W(String str) {
        return "STARGIFT_ALREADY_TRANSFERRED".equals(str) ? jb6.M0(2131749685, null) : jb6.a0(null, null, 2131743565, str);
    }

    public static c41 Y() {
        d S = LaunchActivity.S();
        if (S == null) {
            return new c41(n21.a(a.b), null);
        }
        Dialog dialog = S.visibleDialog;
        return dialog instanceof my0 ? new c41(((my0) dialog).c, S.getResourceProvider()) : b0(S);
    }

    public static boolean a(d dVar) {
        return (dVar == null || dVar.getParentActivity() == null || dVar.getLayoutContainer() == null) ? false : true;
    }

    public static c41 a0(FrameLayout frameLayout, ylb ylbVar) {
        return new c41(frameLayout, ylbVar);
    }

    public static c41 b0(d dVar) {
        return dVar == null ? Y() : new c41(dVar);
    }

    public static void c0(String str) {
        if (LaunchActivity.E1) {
            Y().t(W(str), null).j();
        }
    }

    public static u31 d(d dVar, boolean z) {
        String M0;
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        if (z) {
            b31Var.d(R.raw.ic_ban, "Hand");
            M0 = jb6.M0(2131743448, null);
        } else {
            b31Var.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = jb6.M0(2131743362, null);
        }
        b31Var.b.setText(gm.S2(M0));
        return u31.g(dVar, b31Var, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, ylb ylbVar) {
        if (LaunchActivity.E1) {
            if (frameLayout == null) {
                c0(str);
                return;
            }
            u31 t = new c41(frameLayout, ylbVar).t(W(str), null);
            t.s = false;
            t.j();
        }
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error == null || tL_error.code != 406) {
                Y().t(W(tL_error.text), null).j();
            }
        }
    }

    public static u31 j(d dVar) {
        return b0(dVar).k(false);
    }

    public static u31 l(String str, d dVar, boolean z) {
        String M0;
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        if (str != null) {
            M0 = jb6.a0(null, null, z ? 2131751349 : 2131751347, str);
        } else {
            M0 = jb6.M0(z ? 2131751350 : 2131751348, null);
        }
        b31Var.b.setText(gm.S2(M0));
        b31Var.d((z || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return u31.g(dVar, b31Var, 5000);
    }

    public static u31 v(Context context, d dVar, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, of2 of2Var) {
        b31 b31Var;
        int i6;
        SpannableStringBuilder S2;
        u31 g;
        byte b = 1;
        if (!z8c.h(z8c.t0).p() || dVar == null || i > 1 || j != z8c.h(z8c.t0).n || z) {
            b31Var = new b31(i3, i4, dVar != null ? dVar.getResourceProvider() : null, context);
        } else {
            b31Var = new f31(i2, dVar);
        }
        b31 b31Var2 = b31Var;
        boolean z2 = of2Var != null;
        y31 y31Var = of2Var != null ? new y31(new boolean[]{false}, of2Var, b) : null;
        if (i > 1) {
            i6 = 2;
            S2 = i2 <= 1 ? gm.S2(jb6.G(i, "FwdMessageToManyChats", new Object[0])) : gm.S2(jb6.G(i, "FwdMessagesToManyChats", new Object[0]));
            b31Var2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j == z8c.h(z8c.t0).n) {
            byte b2 = 14;
            if (i2 <= 1) {
                S2 = gm.N2(jb6.M0(2131750431, null), -1, 2, z ? new jd((byte) 16) : new jd(b2), null);
            } else {
                S2 = gm.N2(jb6.M0(2131750424, null), -1, 2, new jd(b2), null);
            }
            b31Var2.c(R.raw.saved_messages, 30, 30, new String[0]);
            i6 = 2;
        } else {
            i6 = 2;
            of2 of2Var2 = new of2((Object) y31Var, (Object) dVar, j, (byte) 12);
            boolean y = pg3.y(j);
            int i7 = z8c.t0;
            if (y) {
                TLRPC.Chat L0 = oc7.r1(i7).L0(Long.valueOf(-j));
                S2 = i2 <= 1 ? dVar != null ? gm.N2(jb6.a0(null, null, 2131750435, L0.title), -1, 2, of2Var2, null) : gm.S2(jb6.a0(null, null, 2131750435, L0.title)) : dVar != null ? gm.N2(jb6.a0(null, null, 2131750428, L0.title), -1, 2, of2Var2, null) : gm.S2(jb6.a0(null, null, 2131750428, L0.title));
            } else {
                TLRPC.User W1 = oc7.r1(i7).W1(Long.valueOf(j));
                if (i2 <= 1) {
                    int i8 = z2 ? 2131750429 : 2131750430;
                    S2 = dVar != null ? gm.N2(jb6.a0(null, null, i8, m9c.k(W1, true)), -1, 2, of2Var2, null) : gm.S2(jb6.a0(null, null, i8, m9c.k(W1, true)));
                } else {
                    int i9 = z2 ? 2131750422 : 2131750423;
                    S2 = dVar != null ? gm.N2(jb6.a0(null, null, i9, m9c.k(W1, true)), -1, 2, of2Var2, null) : gm.S2(jb6.a0(null, null, i9, m9c.k(W1, true)));
                }
            }
            b31Var2.c(R.raw.forward, 30, 30, new String[0]);
        }
        b31Var2.b.setText(S2);
        if (z2) {
            s31 s31Var = new s31(dVar != null ? dVar.getResourceProvider() : null, b31Var2.getContext(), true, true);
            s31Var.b = null;
            s31Var.c = y31Var;
            b31Var2.setButton(s31Var);
        }
        b31Var2.postDelayed(new v31(b31Var2, b), 300L);
        if (frameLayout != null) {
            g = u31.f(frameLayout, b31Var2, i5);
        } else {
            if (dVar == null) {
                i98.g();
                return null;
            }
            g = u31.g(dVar, b31Var2, i5);
        }
        if (b31Var2 instanceof f31) {
            b31Var2.b.setSingleLine(false);
            b31Var2.b.setMaxLines(i6);
            ((f31) b31Var2).setBulletin(g);
            g.s = false;
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u31 x(Activity activity, FrameLayout frameLayout, int i, long j, int i2, int i3) {
        SpannableStringBuilder S2;
        int i4;
        SpannableStringBuilder spannableStringBuilder;
        b31 b31Var = new b31(i2, i3, null, activity);
        byte b = 0;
        if (i > 1) {
            S2 = gm.S2(jb6.a0("InvLinkToChats", null, 2131748944, jb6.G(i, "Chats", new Object[0])));
            b31Var.c(R.raw.forward, 30, 30, new String[0]);
        } else {
            if (j == z8c.h(z8c.t0).n) {
                spannableStringBuilder = gm.S2(jb6.M0(2131748942, null));
                b31Var.c(R.raw.saved_messages, 30, 30, new String[0]);
                i4 = -1;
                b31Var.b.setText(spannableStringBuilder);
                if (i4 > 0) {
                    b31Var.postDelayed(new v31(b31Var, b), i4);
                }
                return u31.f(frameLayout, b31Var, 1500);
            }
            boolean y = pg3.y(j);
            int i5 = z8c.t0;
            S2 = y ? gm.S2(jb6.a0("InvLinkToGroup", null, 2131748943, oc7.r1(i5).L0(Long.valueOf(-j)).title)) : gm.S2(jb6.a0("InvLinkToUser", null, 2131748941, m9c.k(oc7.r1(i5).W1(Long.valueOf(j)), true)));
            b31Var.c(R.raw.forward, 30, 30, new String[0]);
        }
        SpannableStringBuilder spannableStringBuilder2 = S2;
        i4 = 300;
        spannableStringBuilder = spannableStringBuilder2;
        b31Var.b.setText(spannableStringBuilder);
        if (i4 > 0) {
        }
        return u31.f(frameLayout, b31Var, 1500);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u31 z(d dVar, int i, int i2, ylb ylbVar) {
        String a0;
        boolean z;
        b31 b31Var = new b31(dVar.getParentActivity(), ylbVar);
        boolean z2 = true;
        if (i == 0) {
            a0 = jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.G(1, "Hours", new Object[0]));
        } else if (i == 1) {
            a0 = jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.G(8, "Hours", new Object[0]));
        } else if (i == 2) {
            a0 = jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.G(2, "Days", new Object[0]));
        } else {
            if (i != 3) {
                if (i == 4) {
                    a0 = jb6.M0(2131747588, null);
                    z = false;
                    z2 = false;
                } else {
                    if (i != 5) {
                        i98.g();
                        return null;
                    }
                    a0 = jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.c0(i2));
                    z = true;
                }
                if (!z2) {
                    b31Var.d(R.raw.mute_for, new String[0]);
                } else if (z) {
                    b31Var.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    b31Var.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                b31Var.b.setText(a0);
                return u31.g(dVar, b31Var, 1500);
            }
            a0 = jb6.M0(2131747632, null);
        }
        z = true;
        z2 = false;
        if (!z2) {
        }
        b31Var.b.setText(a0);
        return u31.g(dVar, b31Var, 1500);
    }

    public final u31 E(ylb ylbVar) {
        b31 b31Var = new b31(X(), ylbVar);
        b31Var.d(R.raw.chats_infotip, new String[0]);
        b31Var.b.setText(jb6.M0(2131745955, null));
        return b(b31Var, 1500);
    }

    public final u31 G(int i, int i2, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i3 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i3 >= i2) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i3++;
            }
            charSequence = spannableStringBuilder;
        }
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(i2);
        b31Var.b.setText(charSequence);
        return b(b31Var, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final u31 H(int i, CharSequence charSequence) {
        return Q(i, 36, charSequence);
    }

    public final u31 I(int i, CharSequence charSequence, CharSequence charSequence2) {
        r31 r31Var = new r31(X(), this.c);
        r31Var.c(i, 36, 36, new String[0]);
        r31Var.b.setText(charSequence);
        r31Var.c.setText(charSequence2);
        return b(r31Var, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final u31 J(int i, CharSequence charSequence, String str, int i2, boolean z, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        if (i != 0) {
            b31Var.c(i, 36, 36, new String[0]);
        } else {
            b31Var.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) b31Var.b.getLayoutParams()).leftMargin = gm.L(16.0f);
        }
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setTextDirection(5);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        b31Var.b.setText(charSequence);
        s31 s31Var = new s31(ylbVar, X(), true, z);
        s31Var.e(str);
        s31Var.b = runnable;
        b31Var.setButton(s31Var);
        return b(b31Var, i2);
    }

    public final u31 K(int i, CharSequence charSequence, String str, Runnable runnable) {
        return J(i, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final u31 L(int i, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        r31 r31Var = new r31(X, ylbVar);
        r31Var.c(i, 36, 36, new String[0]);
        r31Var.b.setText(str);
        r31Var.c.setText(charSequence);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(str2);
        s31Var.b = runnable;
        r31Var.setButton(s31Var);
        return b(r31Var, 5000);
    }

    public final u31 M(Drawable drawable, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        s09 s09Var = b31Var.a;
        s09Var.setImageDrawable(drawable);
        if (drawable instanceof x28) {
            ((x28) drawable).e(s09Var);
        }
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 2750);
    }

    public final u31 N(String str, String str2) {
        r31 r31Var = new r31(X(), this.c);
        r31Var.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) r31Var.d.getLayoutParams()).setMarginStart(gm.L(10.0f));
        r31Var.b.setText(str);
        r31Var.c.setText(str2);
        return b(r31Var, 5000);
    }

    public final u31 O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new r21();
        }
        q31 q31Var = new q31(X(), this.c);
        TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(28.0f), true, null, false);
        gn5 c = gn5.c(bc4.w(document.thumbs, gm.L(28.0f), true, w, true), document);
        gn5 c2 = gn5.c(w, document);
        bf0 bf0Var = q31Var.a;
        bf0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        bf0Var.getImageReceiver().q0(gm.L(5.0f));
        TextView textView = q31Var.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(gm.o());
        TextView textView2 = q31Var.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(q31Var, str2.length() < 20 ? 1500 : 2750);
    }

    public final u31 P(int i, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, 36, 36, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setMaxLines(4);
        return b(b31Var, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final u31 Q(int i, int i2, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, i2, i2, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final u31 R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new r21();
        }
        q31 q31Var = new q31(X(), this.c);
        TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(28.0f), true, null, false);
        gn5 c = gn5.c(bc4.w(document.thumbs, gm.L(28.0f), true, w, true), document);
        gn5 c2 = gn5.c(w, document);
        bf0 bf0Var = q31Var.a;
        bf0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        bf0Var.getImageReceiver().q0(gm.L(5.0f));
        TextView textView = q31Var.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        q31Var.c.setVisibility(8);
        return b(q31Var, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final u31 T(String str) {
        b31 b31Var = new b31(X(), null);
        b31Var.d(R.raw.contact_check, new String[0]);
        b31Var.b.setText(str);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 1500);
    }

    public final u31 U(String str, boolean z, Runnable runnable, Runnable runnable2) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.b.setText(str);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        b31Var.setTimer();
        s31 s31Var = new s31(ylbVar, X(), true, z);
        s31Var.e(jb6.M0(2131743572, null));
        s31Var.b = runnable;
        s31Var.c = runnable2;
        b31Var.setButton(s31Var);
        return b(b31Var, 5000);
    }

    public final u31 V(List list, CharSequence charSequence, CharSequence charSequence2, hi2 hi2Var) {
        float f;
        int i;
        Context X = X();
        boolean z = charSequence2 != null;
        ylb ylbVar = this.c;
        t31 t31Var = new t31(ylbVar, X, z);
        hd0 hd0Var = t31Var.a;
        if (list != null) {
            int i2 = 0;
            i = 0;
            for (int i3 = 3; i2 < list.size() && i < i3; i3 = 3) {
                TLObject tLObject = (TLObject) list.get(i2);
                if (tLObject != null) {
                    int i4 = i + 1;
                    hd0Var.setCount(i4);
                    hd0Var.b(i, z8c.t0, tLObject);
                    i = i4;
                }
                i2++;
            }
            f = 4.0f;
            if (list.size() == 1) {
                hd0Var.setTranslationX(gm.L(4.0f));
                hd0Var.setScaleX(1.2f);
                hd0Var.setScaleY(1.2f);
            } else {
                hd0Var.setScaleX(1.0f);
                hd0Var.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        if (charSequence2 != null) {
            l66Var.setSingleLine(true);
            l66Var.setMaxLines(1);
            l66Var.setText(charSequence);
            l66 l66Var2 = t31Var.c;
            l66Var2.setText(charSequence2);
            l66Var2.setSingleLine(false);
            l66Var2.setMaxLines(3);
            LinearLayout linearLayout = t31Var.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = gm.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    L += gm.L(f);
                }
                if (jb6.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            l66Var.setSingleLine(false);
            l66Var.setMaxLines(4);
            l66Var.setText(charSequence);
            if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = gm.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    l66Var.setTranslationY(-gm.L(1.0f));
                    L2 += gm.L(f);
                }
                if (jb6.a0) {
                    ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (hi2Var != null) {
            s31 s31Var = new s31(ylbVar, X(), true);
            s31Var.e(jb6.M0(2131743572, null));
            s31Var.b = (Runnable) hi2Var.b;
            s31Var.c = (Runnable) hi2Var.c;
            t31Var.setButton(s31Var);
        }
        return b(t31Var, 5000);
    }

    public final Context X() {
        Context context;
        d dVar = this.a;
        if (dVar != null) {
            context = dVar.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? a.b : context;
    }

    public final u31 Z(TLRPC.TL_error tL_error) {
        return !LaunchActivity.E1 ? new r21() : tL_error == null ? t(jb6.a0(null, null, 2131743566, new Object[0]), null) : t(W(tL_error.text), null);
    }

    public final u31 b(y21 y21Var, int i) {
        d dVar = this.a;
        return dVar != null ? u31.g(dVar, y21Var, i) : u31.f(this.b, y21Var, i);
    }

    public final u31 c(CharSequence charSequence) {
        if (X() == null) {
            return new r21();
        }
        b31 b31Var = new b31(X(), this.c);
        b31Var.d(R.raw.ic_admin, "Shield");
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        b31Var.b.setText(charSequence);
        return b(b31Var, 2750);
    }

    public final u31 e(boolean z) {
        String M0;
        b31 b31Var = new b31(X(), this.c);
        if (z) {
            b31Var.d(R.raw.ic_ban, "Hand");
            M0 = jb6.M0(2131743448, null);
        } else {
            b31Var.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = jb6.M0(2131743362, null);
        }
        b31Var.b.setText(gm.S2(M0));
        return b(b31Var, 1500);
    }

    public final u31 f(int i, Runnable runnable) {
        b31 b31Var = new b31(X(), null);
        b31Var.d(R.raw.caption_limit, new String[0]);
        String G = jb6.G(i, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(gm.S2(G));
        int indexOf = G.indexOf(42);
        int i2 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i2);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i2, indexOf2));
        valueOf.setSpan(new vl(runnable, (byte) 2), indexOf, indexOf2 - 1, 33);
        b31Var.b.setText(valueOf);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        return b(b31Var, 5000);
    }

    public final void f0(String str, boolean z) {
        if (LaunchActivity.E1) {
            if (TextUtils.isEmpty(str)) {
                u31 t = t(jb6.a0(null, null, 2131743566, new Object[0]), null);
                t.s = false;
                t.k(z);
            } else {
                u31 t2 = t(W(str), null);
                t2.s = false;
                t2.k(z);
            }
        }
    }

    public final u31 g(String str, ArrayList arrayList) {
        hd0 hd0Var;
        t31 t31Var = new t31(this.c, X(), false);
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            hd0Var = t31Var.a;
            if (i >= size || i2 >= 3) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject != null) {
                int i3 = i2 + 1;
                hd0Var.setCount(i3);
                hd0Var.b(i2, z8c.t0, tLObject);
                i2 = i3;
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hd0Var.setTranslationX(gm.L(4.0f));
            hd0Var.setScaleX(1.2f);
            hd0Var.setScaleY(1.2f);
        } else {
            hd0Var.setScaleX(1.0f);
            hd0Var.setScaleY(1.0f);
        }
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(2);
        l66Var.setText(str);
        if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gm.L(74 - ((3 - i2) * 12));
            if (jb6.a0) {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (jb6.a0) {
            hd0Var.setTranslationX(gm.L(32 - ((i2 - 1) * 12)));
        }
        return b(t31Var, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                u31 t = t(jb6.a0(null, null, 2131743566, new Object[0]), null);
                t.s = false;
                t.k(z);
            } else if (tL_error.code != 406) {
                u31 t2 = t(W(tL_error.text), null);
                t2.s = false;
                t2.k(z);
            }
        }
    }

    public final u31 h(TLRPC.Document document, final int i, final qac qacVar) {
        ta6 ta6Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        CharSequence S2;
        final TLRPC.InputStickerSet i1 = k47.i1(document);
        if (i1 == null) {
            return null;
        }
        final byte b = 1;
        TLRPC.TL_messages_stickerSet n0 = hs6.d0(z8c.t0).n0(i1, true);
        final byte b2 = 0;
        if (n0 != null && (stickerSet = n0.set) != null) {
            if (i == 1) {
                S2 = gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, stickerSet.title));
            } else {
                String str = stickerSet.title;
                S2 = i == 2 ? gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, str)) : gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, str));
            }
            return r(document, S2, jb6.M0(2131743247, null), new Runnable() { // from class: w31
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    TLRPC.InputStickerSet inputStickerSet2 = i1;
                    qac qacVar2 = qacVar;
                    switch (b3) {
                        case 0:
                            qacVar2.a(inputStickerSet2);
                            break;
                        default:
                            qacVar2.a(inputStickerSet2);
                            break;
                    }
                }
            });
        }
        SpannableStringBuilder spannableStringBuilder = i == 1 ? new SpannableStringBuilder(gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, "<{LOADING}>"))) : i == 2 ? new SpannableStringBuilder(gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, "<{LOADING}>"))) : new SpannableStringBuilder(gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, "<{LOADING}>")));
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        ylb ylbVar = this.c;
        if (indexOf >= 0) {
            ta6Var = new ta6(null, gm.L(100.0f), gm.L(2.0f), ylbVar);
            spannableStringBuilder.setSpan(ta6Var, indexOf, indexOf + 11, 33);
            int i2 = cmb.xj;
            ta6Var.a(on2.p(cmb.v0(i2, ylbVar), 32), on2.p(cmb.v0(i2, ylbVar), 72));
        } else {
            ta6Var = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        String M0 = jb6.M0(2131743247, null);
        Runnable runnable = new Runnable() { // from class: w31
            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                TLRPC.InputStickerSet inputStickerSet2 = i1;
                qac qacVar2 = qacVar;
                switch (b3) {
                    case 0:
                        qacVar2.a(inputStickerSet2);
                        break;
                    default:
                        qacVar2.a(inputStickerSet2);
                        break;
                }
            }
        };
        Context X = X();
        z21 z21Var = new z21(X, ylbVar);
        l66 l66Var = new l66(X, null);
        z21Var.d = l66Var;
        l66Var.setDisablePaddingsOffset(true);
        l66Var.setSingleLine();
        l66Var.setTypeface(Typeface.SANS_SERIF);
        l66Var.setTextSize(1, 15.0f);
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        l66Var.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        z21Var.b.setVisibility(8);
        z21Var.addView(l66Var, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i3 = cmb.xj;
        z21Var.setTextColor(z21Var.getThemedColor(i3));
        if (k47.B4(document)) {
            inputStickerSet = i1;
            anb.s(z21Var.a, i3, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i1;
        }
        z21Var.e(document, new String[0]);
        z21Var.b.setTextSize(1, 14.0f);
        z21Var.b.setSingleLine(false);
        z21Var.b.setMaxLines(3);
        l66Var.setText(spannableStringBuilder);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(3);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(M0);
        s31Var.b = runnable;
        z21Var.setButton(s31Var);
        final u31 b3 = b(z21Var, 2750);
        if (ta6Var != null) {
            y21 y21Var = b3.e;
            if (y21Var instanceof z21) {
                ta6Var.b = ((z21) y21Var).d;
            }
        }
        hs6.d0(z8c.t0).m0(inputStickerSet, null, false, false, new qac() { // from class: x31
            @Override // qac
            public final void a(Object obj) {
                Object M02;
                TLRPC.StickerSet stickerSet2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                byte b4 = 0;
                if (tL_messages_stickerSet == null || (stickerSet2 = tL_messages_stickerSet.set) == null) {
                    M02 = jb6.M0(2131754432, null);
                } else {
                    String str2 = stickerSet2.title;
                    byte b5 = i;
                    M02 = b5 == 1 ? gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, str2)) : b5 == 2 ? gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, str2)) : gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, str2));
                }
                gm.d3(new y31(b3, M02, b4), Math.max(1L, 750 - (System.currentTimeMillis() - currentTimeMillis)));
            }
        });
        return b3;
    }

    public final boolean h0(int i, long j) {
        d dVar;
        if (z8c.h(z8c.t0).p() && (dVar = this.a) != null) {
            f31 f31Var = new f31(i, dVar);
            if (j == z8c.h(z8c.t0).n) {
                byte b = 14;
                SpannableStringBuilder N2 = i <= 1 ? gm.N2(jb6.M0(2131750431, null), -1, 2, new jd(b), null) : gm.N2(jb6.M0(2131750424, null), -1, 2, new jd(b), null);
                f31Var.c(R.raw.saved_messages, 36, 36, new String[0]);
                f31Var.b.setText(N2);
                f31Var.b.setSingleLine(false);
                f31Var.b.setMaxLines(2);
                u31 b2 = b(f31Var, 3500);
                f31Var.setBulletin(b2);
                b2.s = false;
                b2.k(true);
                return true;
            }
        }
        return false;
    }

    public final u31 i(String str) {
        if (!gm.C3()) {
            return new r21();
        }
        b31 b31Var = new b31(X(), null);
        b31Var.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        b31Var.b.setText(str);
        return b(b31Var, 1500);
    }

    public final u31 k(boolean z) {
        if (!gm.C3()) {
            return new r21();
        }
        ylb ylbVar = this.c;
        if (!z) {
            b31 b31Var = new b31(X(), ylbVar);
            b31Var.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            b31Var.b.setText(jb6.M0(2131748678, null));
            return b(b31Var, 1500);
        }
        r31 r31Var = new r31(X(), ylbVar);
        r31Var.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        r31Var.b.setText(jb6.M0(2131748678, null));
        r31Var.c.setText(jb6.M0(2131748676, null));
        return b(r31Var, 2750);
    }

    public final u31 m(b41 b41Var, int i, int i2, int i3, ylb ylbVar) {
        b31 b31Var = (i2 == 0 || i3 == 0) ? new b31(X(), ylbVar) : new b31(i2, i3, ylbVar, X());
        a41 a41Var = b41Var.d;
        b31Var.d(a41Var.a, a41Var.b);
        TextView textView = b31Var.b;
        boolean z = b41Var.c;
        String str = b41Var.a;
        textView.setText(gm.N2(z ? jb6.G(i, str, new Object[0]) : jb6.M0(b41Var.b, str), -1, 0, new jd((byte) 15), null));
        byte b = b41Var.d.c;
        if (b != 0) {
            b31Var.setIconPaddingBottom(b);
        }
        return b(b31Var, 1500);
    }

    public final u31 n(b41 b41Var, int i, ylb ylbVar) {
        return m(b41Var, i, 0, 0, ylbVar);
    }

    public final u31 o(b41 b41Var, ylb ylbVar) {
        return m(b41Var, 1, 0, 0, ylbVar);
    }

    public final u31 p(long j, String str, String str2) {
        Context X = X();
        ylb ylbVar = this.c;
        p31 p31Var = new p31(X, ylbVar);
        vm vmVar = new vm(1, z8c.t0, j);
        bf0 bf0Var = p31Var.a;
        bf0Var.setAnimatedEmojiDrawable(vmVar);
        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, ylbVar), PorterDuff.Mode.SRC_IN));
        p31Var.b.setText(str);
        p31Var.c.setText(str2);
        return b(p31Var, 2750);
    }

    public final u31 q(TLRPC.Document document, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        if (k47.B4(document)) {
            anb.s(b31Var.a, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        b31Var.e(document, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        return b(b31Var, 2750);
    }

    public final u31 r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        boolean B4 = k47.B4(document);
        s09 s09Var = b31Var.a;
        if (B4) {
            anb.s(s09Var, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        b31Var.e(document, new String[0]);
        if (s09Var.getImageReceiver() != null) {
            s09Var.getImageReceiver().q0(gm.L(4.0f));
        }
        b31Var.b.setText(charSequence);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(str);
        s31Var.b = runnable;
        b31Var.setButton(s31Var);
        return b(b31Var, 2750);
    }

    public final u31 s(TLRPC.Document document, String str, CharSequence charSequence) {
        r31 r31Var = new r31(X(), this.c);
        boolean B4 = k47.B4(document);
        s09 s09Var = r31Var.a;
        if (B4) {
            anb.s(s09Var, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        s09Var.setAutoRepeat(true);
        s09Var.g(36, 36, document);
        r31Var.b.setText(str);
        r31Var.c.setText(charSequence);
        return b(r31Var, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final u31 t(CharSequence charSequence, ylb ylbVar) {
        b31 b31Var = new b31(X(), ylbVar);
        b31Var.d(R.raw.chats_infotip, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 1500);
    }

    public final u31 u(String str, String str2, ylb ylbVar) {
        r31 r31Var = new r31(X(), ylbVar);
        r31Var.c(R.raw.chats_infotip, 32, 32, new String[0]);
        r31Var.b.setText(str);
        r31Var.c.setText(str2);
        return b(r31Var, 1500);
    }

    public final u31 w(int i, CharSequence charSequence) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.setBackground(cmb.v0(cmb.vj, ylbVar), 12);
        b31Var.a.setImageResource(i);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setLines(2);
        b31Var.b.setMaxLines(4);
        TextView textView = b31Var.b;
        textView.setMaxWidth(hg5.a(textView.getText(), b31Var.b.getPaint()));
        b31Var.b.setLineSpacing(gm.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) b31Var.b.getLayoutParams()).rightMargin = gm.L(12.0f);
        b31Var.setWrapWidth();
        return b(b31Var, 5000);
    }

    public final u31 y(int i, TLRPC.Document document, cu cuVar) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        b31Var.removeView(b31Var.b);
        fn fnVar = new fn(b31Var.getContext());
        b31Var.b = fnVar;
        fnVar.setTypeface(Typeface.SANS_SERIF);
        b31Var.b.setTextSize(1, 15.0f);
        b31Var.b.setEllipsize(TextUtils.TruncateAt.END);
        b31Var.b.setPadding(0, 0, 0, gm.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(gm.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new gn(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        b31Var.b.setText(new SpannableStringBuilder(i > 1 ? jb6.G(i, "SavedTagMessagesTagged", new Object[0]) : jb6.M0(2131745612, null)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (cuVar != null) {
            s31 s31Var = new s31(ylbVar, X(), true);
            s31Var.e(jb6.M0(2131743247, null));
            s31Var.b = cuVar;
            b31Var.setButton(s31Var);
        }
        b31Var.setTextColor(cmb.v0(cmb.xj, ylbVar));
        b31Var.addView(b31Var.b, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(b31Var, 2750);
    }

    public c41(FrameLayout frameLayout, ylb ylbVar) {
        this.b = frameLayout;
        this.a = null;
        this.c = ylbVar;
    }
}
