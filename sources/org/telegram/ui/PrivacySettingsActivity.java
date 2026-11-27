package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public sn8 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public d79 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public id c;
    public SessionsActivity c0;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public TL_account.Password d;
    public SpannableString d0;
    private int deleteAccountRow;
    public ArrayList e;
    private int emailLoginRow;
    public int f;
    private int forwardsRow;
    private int giftsRow;
    public int h;
    private int lastSeenRow;
    private int musicRow;
    public int n;
    private int newChatsRow;
    private int noncontactsRow;
    private int passcodeRow;
    private int passkeysRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int profilePhotoRow;
    public int r;
    public int s;
    private int secretMapRow;
    private int secretWebpageRow;
    private int voicesRow;
    public int w;
    private int webSessionsRow;
    public int x;
    public int y;

    public PrivacySettingsActivity() {
        super(null);
        this.Q = new ArrayList();
        this.a0 = new boolean[2];
    }

    public static String A0(k5 k5Var, int i) {
        String str;
        int i2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = lv2.r(k5Var.a).v(i);
        int i3 = k5Var.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i3).Y;
        if (v == null || v.size() == 0) {
            return i == 3 ? ob6.M0(2131747478, null) : ob6.M0(2131748770, null);
        }
        char c = 65535;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        Boolean bool = null;
        for (int i6 = 0; i6 < v.size(); i6++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i6);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.Chat M0 = uc7.s1(i3).M0(tL_privacyValueAllowChatParticipants.chats.get(i7));
                    if (M0 != null) {
                        i4 += M0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    TLRPC.Chat M02 = uc7.s1(i3).M0(tL_privacyValueDisallowChatParticipants.chats.get(i8));
                    if (M02 != null) {
                        i5 += M02.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                i4 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                i5 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z = true;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                bool = Boolean.TRUE;
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                bool = Boolean.FALSE;
            } else if (c == 65535) {
                c = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (char) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
            }
        }
        if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return ob6.M0(2131746489, null);
        }
        if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return ob6.M0(2131746490, null);
        }
        if (c == 0) {
            str = null;
            i2 = 3;
        } else {
            if (c != 65535 || i5 <= 0) {
                if (c != 2 && (c != 65535 || i5 <= 0 || i4 <= 0)) {
                    if (c != 1 && i4 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : ob6.M0(2131746488, null);
                    }
                    if (i == 3) {
                        return i4 == 0 ? ob6.M0(2131747478, null) : ob6.a0(null, null, 2131747477, Integer.valueOf(i4));
                    }
                    if (i4 == 0) {
                        return z ? ob6.M0(2131748768, null) : (bool == null || !bool.booleanValue()) ? ob6.M0(2131748770, null) : ob6.M0(2131746488, null);
                    }
                    return ob6.a0(null, null, z ? 2131748767 : 2131748769, Integer.valueOf(i4));
                }
                if (i == 3) {
                    return i4 == 0 ? i5 == 0 ? ob6.M0(2131747485, "P2PContacts") : ob6.a0(null, null, 2131747484, Integer.valueOf(i5)) : i5 != 0 ? ob6.a0(null, null, 2131747483, Integer.valueOf(i5), Integer.valueOf(i4)) : ob6.a0(null, null, 2131747482, Integer.valueOf(i4));
                }
                if (i4 == 0) {
                    if (i5 == 0) {
                        return z ? ob6.M0(2131748779, null) : (bool == null || !bool.booleanValue()) ? ob6.M0(2131748783, null) : ob6.M0(2131746574, null);
                    }
                    return ob6.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748778 : 2131748782 : 2131746573, Integer.valueOf(i5));
                }
                if (i5 != 0) {
                    return ob6.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748777 : 2131748781 : 2131746572, Integer.valueOf(i5), Integer.valueOf(i4));
                }
                return ob6.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748776 : 2131748780 : 2131746571, Integer.valueOf(i4));
            }
            i2 = 3;
            str = null;
        }
        if (i == i2) {
            return i5 == 0 ? ob6.M0(2131747480, str) : ob6.a0(str, str, 2131747479, Integer.valueOf(i5));
        }
        int i9 = 2131748772;
        int i10 = 2131748773;
        if (i != 12) {
            return i5 == 0 ? ob6.M0(2131748773, null) : ob6.a0(null, null, 2131748772, Integer.valueOf(i5));
        }
        if (i5 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i10 = 2131746492;
            }
            return ob6.M0(i10, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i9 = 2131746491;
        }
        return ob6.a0(null, null, i9, Integer.valueOf(i5));
    }

    public final void B0() {
        TwoStepVerificationActivity.e0(this.d);
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().u(false);
            F0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z = str != null && i == -1;
            boolean z2 = str == null && i != -1;
            if (z || z2) {
                F0(false);
                sn8 sn8Var = this.a;
                if (sn8Var != null) {
                    if (z) {
                        sn8Var.i(this.emailLoginRow);
                    } else {
                        sn8Var.s(i);
                    }
                }
            }
        }
        sn8 sn8Var2 = this.a;
        if (sn8Var2 != null) {
            sn8Var2.g(this.passwordRow);
        }
    }

    public final void C0(Context context, View view, int i) {
        String str;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().q0 >= 0) {
                    presentFragment(new x60());
                    return;
                }
                return;
            }
            if (i == this.blockedRow) {
                presentFragment(new vn8());
                return;
            }
            if (i == this.s) {
                this.b0.resetFragment();
                presentFragment(this.b0);
                return;
            }
            if (i == this.webSessionsRow) {
                this.c0.resetFragment();
                presentFragment(this.c0);
                return;
            }
            byte b = 4;
            float f = 4.0f;
            char c = 1;
            byte b2 = 0;
            if (i == this.deleteAccountRow) {
                if (getParentActivity() != null) {
                    int i2 = getContactsController().I;
                    if (i2 <= 31) {
                        b = 0;
                    } else if (i2 <= 93) {
                        b = 1;
                    } else if (i2 <= 182) {
                        b = 2;
                    } else if (i2 != 548) {
                        b = i2 == 730 ? (byte) 5 : (byte) 3;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131751559, "DeleteAccountTitle");
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    byte b3 = 24;
                    String[] strArr = {ob6.G(1, "Months", new Object[0]), ob6.G(3, "Months", new Object[0]), ob6.G(6, "Months", new Object[0]), ob6.G(12, "Months", new Object[0]), ob6.G(18, "Months", new Object[0]), ob6.G(24, "Months", new Object[0])};
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    int i3 = 0;
                    while (i3 < 6) {
                        j29 j29Var = new j29(getParentActivity(), null);
                        float f2 = f;
                        j29Var.setPadding(hl.L(f), 0, hl.L(f2), 0);
                        j29Var.setTag(Integer.valueOf(i3));
                        j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                        j29Var.b(strArr[i3], b == i3);
                        linearLayout.addView(j29Var);
                        j29Var.setOnClickListener(new uv5(this, alertDialog$Builder, b3));
                        i3++;
                        f = f2;
                    }
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(idVar);
                    return;
                }
                return;
            }
            if (i == this.lastSeenRow) {
                presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i == this.phoneNumberRow) {
                presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i == this.n) {
                presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i == this.callsRow) {
                presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i == this.profilePhotoRow) {
                presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            if (i == this.bioRow) {
                presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i == this.musicRow) {
                presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            byte b4 = 11;
            if (i == this.birthdayRow) {
                presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i == this.giftsRow) {
                presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i == this.forwardsRow) {
                presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            if (i == this.voicesRow) {
                presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i == this.noncontactsRow) {
                presentFragment(new PrivacyControlActivity(10, false));
                return;
            }
            if (i == this.emailLoginRow) {
                TL_account.Password password = this.d;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = this.d.login_email_pattern.indexOf(42);
                int lastIndexOf = this.d.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    rmb rmbVar = new rmb();
                    rmbVar.a |= 256;
                    rmbVar.b = indexOf;
                    int i4 = lastIndexOf + 1;
                    rmbVar.c = i4;
                    valueOf.setSpan(new smb(rmbVar, 0), indexOf, i4, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = valueOf;
                idVar2.U = ob6.M0(2131751166, null);
                alertDialog$Builder2.j(ob6.M0(2131752529, null), new pn8(this, b));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder2.o();
                return;
            }
            if (i == this.passwordRow) {
                TL_account.Password password2 = this.d;
                if (password2 != null) {
                    if (!TwoStepVerificationActivity.a0(password2, false)) {
                        jj.u0(getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                    }
                    TL_account.Password password3 = this.d;
                    if (!password3.has_password) {
                        presentFragment(new o7c(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? (byte) 6 : (byte) 5, this.d));
                        return;
                    }
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.J = this.d;
                    twoStepVerificationActivity.K = false;
                    presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            }
            if (i == this.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !f11.i) {
                    return;
                }
                ArrayList arrayList = this.e;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.e0(this.currentAccount, this.resourceProvider, context, true);
                    return;
                } else {
                    presentFragment(new PasskeysActivity(this.e));
                    return;
                }
            }
            if (i == this.passcodeRow) {
                presentFragment(PasscodeActivity.m0());
                return;
            }
            if (i == this.secretWebpageRow) {
                if (getMessagesController().z2 == 1) {
                    getMessagesController().z2 = 0;
                } else {
                    getMessagesController().z2 = 1;
                }
                uc7.e1().edit().putInt("secretWebpage2", getMessagesController().z2).commit();
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(getMessagesController().z2 == 1);
                    return;
                }
                return;
            }
            if (i == this.contactsDeleteRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    String M02 = ob6.M0(2131743947, "SyncContactsDeleteTitle");
                    id idVar3 = alertDialog$Builder3.a;
                    idVar3.S = M02;
                    idVar3.U = hl.S2(ob6.M0(2131743948, "SyncContactsDeleteText"));
                    alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), null);
                    alertDialog$Builder3.j(ob6.M0(2131751563, "Delete"), new pn8(this, r7));
                    showDialog(idVar3);
                    TextView textView = (TextView) idVar3.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == this.contactsSuggestRow) {
                wkb wkbVar = (wkb) view;
                if (!this.W) {
                    this.W = true;
                    wkbVar.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
                String M03 = ob6.M0(2131744062, "SuggestContactsTitle");
                id idVar4 = alertDialog$Builder4.a;
                idVar4.S = M03;
                idVar4.U = ob6.M0(2131744064, "SuggestContactsAlert");
                alertDialog$Builder4.j(ob6.M0(2131748067, "MuteDisable"), new m88(this, wkbVar, b4));
                alertDialog$Builder4.g(ob6.M0(2131752570, "Cancel"), null);
                showDialog(idVar4);
                TextView textView2 = (TextView) idVar4.c(-1);
                if (textView2 != null) {
                    yob.X(textView2, aob.q7, null);
                    return;
                }
                return;
            }
            if (i == this.newChatsRow) {
                boolean z = !this.X;
                this.X = z;
                ((wkb) view).setChecked(z);
                return;
            }
            if (i == this.contactsSyncRow) {
                boolean z2 = !this.U;
                this.U = z2;
                if (view instanceof wkb) {
                    ((wkb) view).setChecked(z2);
                    return;
                }
                return;
            }
            if (i == this.secretMapRow) {
                jj.p0(getParentActivity(), this.currentAccount, new on8(this, b2), false, null);
                return;
            }
            if (i != this.paymentsClearRow) {
                if (i == this.H) {
                    presentFragment(new b18(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i == this.I) {
                        presentFragment(new vo0());
                        return;
                    }
                    return;
                }
            }
            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getParentActivity());
            String M04 = ob6.M0(2131746523, "PrivacyPaymentsClearAlertTitle");
            id idVar5 = alertDialog$Builder5.a;
            idVar5.S = M04;
            idVar5.U = ob6.M0(2131746524, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.n(linearLayout2);
            int i5 = 0;
            while (i5 < 2) {
                String M05 = i5 == 0 ? ob6.M0(2131746575, "PrivacyClearShipping") : ob6.M0(2131746576, "PrivacyClearPayment");
                this.a0[i5] = true;
                sg2 sg2Var = new sg2(getParentActivity(), 1, 21, false, null);
                sg2Var.setTag(Integer.valueOf(i5));
                sg2Var.setBackgroundDrawable(aob.L0(false));
                sg2Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                linearLayout2.addView(sg2Var, tre.o(-1, 50));
                sg2Var.e(M05, null, true, false, false);
                sg2Var.setTextColor(aob.w0(null, aob.j5, false));
                sg2Var.setOnClickListener(new jn8(this, c == true ? 1 : 0));
                i5++;
            }
            alertDialog$Builder5.j(ob6.M0(2131752064, "ClearButton"), new pn8(this, b2));
            alertDialog$Builder5.g(ob6.M0(2131752570, "Cancel"), null);
            showDialog(idVar5);
            showDialog(idVar5);
            TextView textView3 = (TextView) idVar5.c(-1);
            if (textView3 != null) {
                yob.X(textView3, aob.q7, null);
            }
        }
    }

    public final void D0() {
        if (this.a != null) {
            int h0 = this.c0.h0();
            if (this.webSessionsRow >= 0 || h0 <= 0) {
                return;
            }
            F0(true);
        }
    }

    public final void E0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new w15(this, (byte) 21), 10);
    }

    public final void F0(boolean z) {
        int i;
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (getMessagesController().l4.G.f && Build.VERSION.SDK_INT >= 28 && f11.i) {
            int i2 = this.P;
            this.P = i2 + 1;
            this.passkeysRow = i2;
        }
        TL_account.Password password = this.d;
        if (password == null ? !xea.i1 : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i3 = this.P;
            this.P = i3 + 1;
            this.emailLoginRow = i3;
        }
        int i4 = this.P;
        this.P = i4 + 1;
        this.blockedRow = i4;
        if (password != null) {
            boolean z2 = password.login_email_pattern != null;
            if (xea.i1 != z2) {
                xea.i1 = z2;
                xea.x();
            }
        }
        int i5 = this.P;
        this.s = i5;
        this.w = i5 + 1;
        this.f = i5 + 2;
        this.phoneNumberRow = i5 + 3;
        this.lastSeenRow = i5 + 4;
        this.profilePhotoRow = i5 + 5;
        this.forwardsRow = i5 + 6;
        this.P = i5 + 8;
        this.callsRow = i5 + 7;
        this.r = -1;
        if (!getMessagesController().M3() || getUserConfig().p()) {
            int i6 = this.P;
            this.voicesRow = i6;
            this.P = i6 + 2;
            this.noncontactsRow = i6 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i7 = this.P;
        this.birthdayRow = i7;
        this.giftsRow = i7 + 1;
        this.bioRow = i7 + 2;
        this.musicRow = i7 + 3;
        this.n = i7 + 4;
        this.P = i7 + 6;
        this.h = i7 + 5;
        if (getMessagesController().l4.T0.f || getUserConfig().p()) {
            int i8 = this.P;
            this.x = i8;
            this.newChatsRow = i8 + 1;
            this.P = i8 + 3;
            this.y = i8 + 2;
        } else {
            this.x = -1;
            this.newChatsRow = -1;
            this.y = -1;
        }
        int i9 = this.P;
        this.E = i9;
        this.deleteAccountRow = i9 + 1;
        this.F = i9 + 2;
        this.P = i9 + 4;
        this.G = i9 + 3;
        if (getUserConfig().Y) {
            int i10 = this.P;
            this.P = i10 + 1;
            this.H = i10;
        } else {
            this.H = -1;
        }
        int i11 = this.P;
        this.P = i11 + 1;
        this.paymentsClearRow = i11;
        if (this.Q.isEmpty()) {
            this.I = -1;
        } else {
            int i12 = this.P;
            this.P = i12 + 1;
            this.I = i12;
        }
        SessionsActivity sessionsActivity = this.c0;
        if (sessionsActivity == null || sessionsActivity.h0() <= 0) {
            this.webSessionsRow = -1;
            this.J = -1;
            int i13 = this.P;
            i = i13 + 1;
            this.P = i;
            this.K = i13;
        } else {
            int i14 = this.P;
            int i15 = i14 + 1;
            this.webSessionsRow = i14;
            i = i14 + 2;
            this.P = i;
            this.J = i15;
            this.K = -1;
        }
        this.L = i;
        this.contactsDeleteRow = i + 1;
        this.contactsSyncRow = i + 2;
        this.contactsSuggestRow = i + 3;
        this.M = i + 4;
        this.N = i + 5;
        this.secretMapRow = i + 6;
        this.secretWebpageRow = i + 7;
        this.P = i + 9;
        this.O = i + 8;
        sn8 sn8Var = this.a;
        if (sn8Var == null || !z) {
            return;
        }
        sn8Var.f();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131746500, null));
        Object[] objArr = 0;
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 0));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new sn8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new as((byte) 13, i, objArr == true ? 1 : 0));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        byte b = 19;
        this.b.setOnItemClickListener(new l0(this, context, b));
        uo0.c(getParentActivity(), this.currentAccount, new ji7(this, b));
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sn8 sn8Var;
        if (i == jn7.k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Z = (globalPrivacySettings.flags & 32) != 0;
            }
            sn8 sn8Var2 = this.a;
            if (sn8Var2 != null) {
                sn8Var2.f();
            }
        } else if (i == jn7.g0) {
            this.a.g(this.blockedRow);
        } else if (i == jn7.q0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                sn8 sn8Var3 = this.a;
                if (sn8Var3 != null) {
                    sn8Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                E0();
                F0(true);
            }
        }
        if (i != jn7.v5 || (sn8Var = this.a) == null) {
            return;
        }
        sn8Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, mf5.class, wkb.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        byte b = 0;
        getContactsController().D(false);
        getMessagesController().F0(true);
        boolean z = getUserConfig().V;
        this.U = z;
        this.T = z;
        boolean z2 = getUserConfig().W;
        this.W = z2;
        this.V = z2;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.Z = (globalPrivacySettings.flags & 32) != 0;
        }
        F0(true);
        E0();
        byte b2 = 2;
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new ic(b), new hj8(this, b2));
        getNotificationCenter().b(this, jn7.k0);
        getNotificationCenter().b(this, jn7.g0);
        getNotificationCenter().b(this, jn7.q0);
        getNotificationCenter().b(this, jn7.v5);
        getUserConfig().s();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new pn8(this, b2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new pn8(this, (byte) 3);
        sessionsActivity2.o0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.k0);
        getNotificationCenter().n(this, jn7.g0);
        getNotificationCenter().n(this, jn7.q0);
        getNotificationCenter().n(this, jn7.v5);
        boolean z2 = true;
        byte b = 0;
        if (this.T != this.U) {
            yac userConfig = getUserConfig();
            boolean z3 = this.U;
            userConfig.V = z3;
            if (z3 && lv2.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), ob6.M0(2131743950, "SyncContactsAdded"), 0).show();
                }
            }
            z = true;
        } else {
            z = false;
        }
        boolean z4 = this.W;
        if (z4 != this.V) {
            if (!z4) {
                getMediaDataController().H();
            }
            getUserConfig().W = this.W;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.W;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new xe2(b));
            z = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        if (globalPrivacySettings != null) {
            boolean z5 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z6 = this.X;
            if (z5 != z6) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z6;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().Y;
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    globalPrivacySettings2 = new TLRPC.TL_globalPrivacySettings();
                    setglobalprivacysettings.settings = globalPrivacySettings2;
                }
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = this.X;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new xe2(b));
                if (z2) {
                    return;
                }
                getUserConfig().u(false);
                return;
            }
        }
        z2 = z;
        if (z2) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        sn8 sn8Var = this.a;
        if (sn8Var != null) {
            sn8Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final SpannableStringBuilder z0(String str) {
        if (this.d0 == null) {
            this.d0 = new SpannableString("★");
            vl vlVar = new vl(hl.L(18.0f), hl.L(18.0f), bl8.d().f);
            vlVar.setBounds(0, 0, hl.L(18.0f), hl.L(18.0f));
            this.d0.setSpan(new ImageSpan(vlVar, 2), 0, this.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.d0);
    }
}
