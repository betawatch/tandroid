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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class PrivacySettingsActivity extends org.telegram.ui.ActionBar.d implements gk7 {
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
    public dk8 a;
    public final boolean[] a0;
    private int autoDeleteMesages;
    public o39 b;
    public SessionsActivity b0;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    public hd c;
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

    public static String z0(j5 j5Var, int i) {
        String str;
        int i2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        ArrayList v = qu2.r(j5Var.a).v(i);
        int i3 = j5Var.a;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(i3).Y;
        if (v == null || v.size() == 0) {
            return i == 3 ? k96.M0(2131747558, null) : k96.M0(2131748824, null);
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
                    TLRPC.Chat K0 = na7.q1(i3).K0(tL_privacyValueAllowChatParticipants.chats.get(i7));
                    if (K0 != null) {
                        i4 += K0.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    TLRPC.Chat K02 = na7.q1(i3).K0(tL_privacyValueDisallowChatParticipants.chats.get(i8));
                    if (K02 != null) {
                        i5 += K02.participants_count;
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
            return k96.M0(2131746569, null);
        }
        if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return k96.M0(2131746570, null);
        }
        if (c == 0) {
            str = null;
            i2 = 3;
        } else {
            if (c != 65535 || i5 <= 0) {
                if (c != 2 && (c != 65535 || i5 <= 0 || i4 <= 0)) {
                    if (c != 1 && i4 <= 0) {
                        return (bool == null || !bool.booleanValue()) ? "unknown" : k96.M0(2131746568, null);
                    }
                    if (i == 3) {
                        return i4 == 0 ? k96.M0(2131747558, null) : k96.a0(null, null, 2131747557, Integer.valueOf(i4));
                    }
                    if (i4 == 0) {
                        return z ? k96.M0(2131748822, null) : (bool == null || !bool.booleanValue()) ? k96.M0(2131748824, null) : k96.M0(2131746568, null);
                    }
                    return k96.a0(null, null, z ? 2131748821 : 2131748823, Integer.valueOf(i4));
                }
                if (i == 3) {
                    return i4 == 0 ? i5 == 0 ? k96.M0(2131747565, "P2PContacts") : k96.a0(null, null, 2131747564, Integer.valueOf(i5)) : i5 != 0 ? k96.a0(null, null, 2131747563, Integer.valueOf(i5), Integer.valueOf(i4)) : k96.a0(null, null, 2131747562, Integer.valueOf(i4));
                }
                if (i4 == 0) {
                    if (i5 == 0) {
                        return z ? k96.M0(2131748833, null) : (bool == null || !bool.booleanValue()) ? k96.M0(2131748837, null) : k96.M0(2131746654, null);
                    }
                    return k96.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748832 : 2131748836 : 2131746653, Integer.valueOf(i5));
                }
                if (i5 != 0) {
                    return k96.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748831 : 2131748835 : 2131746652, Integer.valueOf(i5), Integer.valueOf(i4));
                }
                return k96.a0(null, null, (bool == null || !bool.booleanValue()) ? z ? 2131748830 : 2131748834 : 2131746651, Integer.valueOf(i4));
            }
            i2 = 3;
            str = null;
        }
        if (i == i2) {
            return i5 == 0 ? k96.M0(2131747560, str) : k96.a0(str, str, 2131747559, Integer.valueOf(i5));
        }
        int i9 = 2131748826;
        int i10 = 2131748827;
        if (i != 12) {
            return i5 == 0 ? k96.M0(2131748827, null) : k96.a0(null, null, 2131748826, Integer.valueOf(i5));
        }
        if (i5 == 0) {
            if (bool != null && !bool.booleanValue()) {
                i10 = 2131746572;
            }
            return k96.M0(i10, null);
        }
        if (bool != null && !bool.booleanValue()) {
            i9 = 2131746571;
        }
        return k96.a0(null, null, i9, Integer.valueOf(i5));
    }

    public final void A0() {
        TwoStepVerificationActivity.e0(this.d);
        if (!getUserConfig().Y && this.d.has_secure_values) {
            getUserConfig().Y = true;
            getUserConfig().u(false);
            E0(true);
            return;
        }
        TL_account.Password password = this.d;
        if (password != null) {
            int i = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z = str != null && i == -1;
            boolean z2 = str == null && i != -1;
            if (z || z2) {
                E0(false);
                dk8 dk8Var = this.a;
                if (dk8Var != null) {
                    if (z) {
                        dk8Var.i(this.emailLoginRow);
                    } else {
                        dk8Var.r(i);
                    }
                }
            }
        }
        dk8 dk8Var2 = this.a;
        if (dk8Var2 != null) {
            dk8Var2.g(this.passwordRow);
        }
    }

    public final void B0(Context context, View view, int i) {
        String str;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().q0 >= 0) {
                    presentFragment(new v60());
                    return;
                }
                return;
            }
            if (i == this.blockedRow) {
                presentFragment(new gk8());
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
                    String M0 = k96.M0(2131751582, "DeleteAccountTitle");
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    String[] strArr = {k96.G(1, "Months", new Object[0]), k96.G(3, "Months", new Object[0]), k96.G(6, "Months", new Object[0]), k96.G(12, "Months", new Object[0]), k96.G(18, "Months", new Object[0]), k96.G(24, "Months", new Object[0])};
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    int i3 = 0;
                    while (i3 < 6) {
                        wy8 wy8Var = new wy8(getParentActivity(), null);
                        wy8Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        wy8Var.setTag(Integer.valueOf(i3));
                        wy8Var.a(bkb.w0(null, bkb.f7, false), bkb.w0(null, bkb.D5, false));
                        wy8Var.b(strArr[i3], b == i3);
                        linearLayout.addView(wy8Var);
                        wy8Var.setOnClickListener(new v16(this, alertDialog$Builder, (byte) 21));
                        i3++;
                    }
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar);
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
                    vib vibVar = new vib();
                    vibVar.a |= 256;
                    vibVar.b = indexOf;
                    int i4 = lastIndexOf + 1;
                    vibVar.c = i4;
                    valueOf.setSpan(new wib(vibVar, 0), indexOf, i4, 0);
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = valueOf;
                hdVar2.U = k96.M0(2131751189, null);
                alertDialog$Builder2.j(k96.M0(2131752536, null), new bk8(this, b));
                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                alertDialog$Builder2.o();
                return;
            }
            if (i == this.passwordRow) {
                TL_account.Password password2 = this.d;
                if (password2 != null) {
                    if (!TwoStepVerificationActivity.a0(password2, false)) {
                        ij.u0(getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                    }
                    TL_account.Password password3 = this.d;
                    if (!password3.has_password) {
                        presentFragment(new p3c(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? (byte) 6 : (byte) 5, this.d));
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
                if (Build.VERSION.SDK_INT < 28 || !w01.i) {
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
                na7.c1().edit().putInt("secretWebpage2", getMessagesController().z2).commit();
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(getMessagesController().z2 == 1);
                    return;
                }
                return;
            }
            if (i == this.contactsDeleteRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                    String M02 = k96.M0(2131744053, "SyncContactsDeleteTitle");
                    hd hdVar3 = alertDialog$Builder3.a;
                    hdVar3.S = M02;
                    hdVar3.U = gl.T2(k96.M0(2131744054, "SyncContactsDeleteText"));
                    alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                    alertDialog$Builder3.j(k96.M0(2131751586, "Delete"), new bk8(this, r7));
                    showDialog(hdVar3);
                    TextView textView = (TextView) hdVar3.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == this.contactsSuggestRow) {
                ahb ahbVar = (ahb) view;
                if (!this.W) {
                    this.W = true;
                    ahbVar.setChecked(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(getParentActivity());
                String M03 = k96.M0(2131744168, "SuggestContactsTitle");
                hd hdVar4 = alertDialog$Builder4.a;
                hdVar4.S = M03;
                hdVar4.U = k96.M0(2131744170, "SuggestContactsAlert");
                alertDialog$Builder4.j(k96.M0(2131748121, "MuteDisable"), new dx6((Object) this, (Object) ahbVar, (byte) 26));
                alertDialog$Builder4.g(k96.M0(2131752577, "Cancel"), null);
                showDialog(hdVar4);
                TextView textView2 = (TextView) hdVar4.c(-1);
                if (textView2 != null) {
                    zkb.X(textView2, bkb.p7, null);
                    return;
                }
                return;
            }
            if (i == this.newChatsRow) {
                boolean z = !this.X;
                this.X = z;
                ((ahb) view).setChecked(z);
                return;
            }
            if (i == this.contactsSyncRow) {
                boolean z2 = !this.U;
                this.U = z2;
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(z2);
                    return;
                }
                return;
            }
            if (i == this.secretMapRow) {
                ij.p0(getParentActivity(), this.currentAccount, new ak8(this, b2), false, null);
                return;
            }
            if (i != this.paymentsClearRow) {
                if (i == this.H) {
                    presentFragment(new vx7(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
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
            String M04 = k96.M0(2131746603, "PrivacyPaymentsClearAlertTitle");
            hd hdVar5 = alertDialog$Builder5.a;
            hdVar5.S = M04;
            hdVar5.U = k96.M0(2131746604, "PrivacyPaymentsClearAlertText");
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(1);
            alertDialog$Builder5.n(linearLayout2);
            int i5 = 0;
            while (i5 < 2) {
                String M05 = i5 == 0 ? k96.M0(2131746655, "PrivacyClearShipping") : k96.M0(2131746656, "PrivacyClearPayment");
                this.a0[i5] = true;
                ag2 ag2Var = new ag2(getParentActivity(), 1, 21, false, null);
                ag2Var.setTag(Integer.valueOf(i5));
                ag2Var.setBackgroundDrawable(bkb.L0(false));
                ag2Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                linearLayout2.addView(ag2Var, nme.o(-1, 50));
                ag2Var.e(M05, null, true, false, false);
                ag2Var.setTextColor(bkb.w0(null, bkb.i5, false));
                ag2Var.setOnClickListener(new fr7(this, (byte) 29));
                i5++;
            }
            alertDialog$Builder5.j(k96.M0(2131752087, "ClearButton"), new bk8(this, b2));
            alertDialog$Builder5.g(k96.M0(2131752577, "Cancel"), null);
            showDialog(hdVar5);
            showDialog(hdVar5);
            TextView textView3 = (TextView) hdVar5.c(-1);
            if (textView3 != null) {
                zkb.X(textView3, bkb.p7, null);
            }
        }
    }

    public final void C0() {
        if (this.a != null) {
            int h0 = this.c0.h0();
            if (this.webSessionsRow >= 0 || h0 <= 0) {
                return;
            }
            E0(true);
        }
    }

    public final void D0() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new n35(this, (byte) 20), 10);
    }

    public final void E0(boolean z) {
        int i;
        this.passkeysRow = -1;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.P = 4;
        this.passcodeRow = 3;
        if (getMessagesController().k4.E.f && Build.VERSION.SDK_INT >= 28 && w01.i) {
            int i2 = this.P;
            this.P = i2 + 1;
            this.passkeysRow = i2;
        }
        TL_account.Password password = this.d;
        if (password == null ? !gba.j1 : password.login_email_pattern == null) {
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
            if (gba.j1 != z2) {
                gba.j1 = z2;
                gba.x();
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
        if (!getMessagesController().E3() || getUserConfig().p()) {
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
        if (getMessagesController().k4.L0.f || getUserConfig().p()) {
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
        dk8 dk8Var = this.a;
        if (dk8Var == null || !z) {
            return;
        }
        dk8Var.f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131746580, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 28));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new dk8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new zr((byte) 13, i, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutAnimation(null);
        this.b.setItemAnimator(null);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 19));
        uo0.c(getParentActivity(), this.currentAccount, new zf7(this, (byte) 18));
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        dk8 dk8Var;
        if (i == kk7.j0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                this.X = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.Y = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.Z = (globalPrivacySettings.flags & 32) != 0;
            }
            dk8 dk8Var2 = this.a;
            if (dk8Var2 != null) {
                dk8Var2.f();
            }
        } else if (i == kk7.f0) {
            this.a.g(this.blockedRow);
        } else if (i == kk7.p0) {
            if (objArr.length > 0) {
                this.d = (TL_account.Password) objArr[0];
                dk8 dk8Var3 = this.a;
                if (dk8Var3 != null) {
                    dk8Var3.g(this.passwordRow);
                }
            } else {
                this.d = null;
                D0();
                E0(true);
            }
        }
        if (i != kk7.u5 || (dk8Var = this.a) == null) {
            return;
        }
        dk8Var.g(this.autoDeleteMesages);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 16, new Class[]{uib.class, ld5.class, ahb.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        byte b = 0;
        getContactsController().D(false);
        getMessagesController().D0(true);
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
        E0(true);
        D0();
        byte b2 = 2;
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new hc(b), new tf8(this, b2));
        getNotificationCenter().b(this, kk7.j0);
        getNotificationCenter().b(this, kk7.f0);
        getNotificationCenter().b(this, kk7.p0);
        getNotificationCenter().b(this, kk7.u5);
        getUserConfig().s();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.b0 = sessionsActivity;
        sessionsActivity.Y = new bk8(this, b2);
        sessionsActivity.o0(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.c0 = sessionsActivity2;
        sessionsActivity2.Y = new bk8(this, (byte) 3);
        sessionsActivity2.o0(false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        boolean z;
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.j0);
        getNotificationCenter().n(this, kk7.f0);
        getNotificationCenter().n(this, kk7.p0);
        getNotificationCenter().n(this, kk7.u5);
        boolean z2 = true;
        byte b = 0;
        if (this.T != this.U) {
            y6c userConfig = getUserConfig();
            boolean z3 = this.U;
            userConfig.V = z3;
            if (z3 && qu2.w()) {
                getContactsController().l();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), k96.M0(2131744056, "SyncContactsAdded"), 0).show();
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
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new ce2(b));
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
                getConnectionsManager().sendRequest(setglobalprivacysettings, new ce2(b));
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

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        dk8 dk8Var = this.a;
        if (dk8Var != null) {
            dk8Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final SpannableStringBuilder y0(String str) {
        if (this.d0 == null) {
            this.d0 = new SpannableString("★");
            ul ulVar = new ul(gl.L(18.0f), gl.L(18.0f), nh8.d().f);
            ulVar.setBounds(0, 0, gl.L(18.0f), gl.L(18.0f));
            this.d0.setSpan(new ImageSpan(ulVar, 2), 0, this.d0.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.d0);
    }
}
