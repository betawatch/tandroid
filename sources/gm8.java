// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gm8 extends q59 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public gm8(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int b = u69Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i = privacySettingsActivity.passcodeRow;
        if (b != i) {
            i2 = privacySettingsActivity.passwordRow;
            if (b != i2) {
                i3 = privacySettingsActivity.passkeysRow;
                if (b != i3) {
                    i4 = privacySettingsActivity.blockedRow;
                    if (b != i4 && b != privacySettingsActivity.s) {
                        i5 = privacySettingsActivity.secretWebpageRow;
                        if (b != i5) {
                            i6 = privacySettingsActivity.webSessionsRow;
                            if (b != i6 && (b != privacySettingsActivity.n || privacySettingsActivity.getContactsController().t(1))) {
                                i7 = privacySettingsActivity.lastSeenRow;
                                if (b != i7 || privacySettingsActivity.getContactsController().t(0)) {
                                    i8 = privacySettingsActivity.callsRow;
                                    if (b != i8 || privacySettingsActivity.getContactsController().t(2)) {
                                        i9 = privacySettingsActivity.profilePhotoRow;
                                        if (b != i9 || privacySettingsActivity.getContactsController().t(4)) {
                                            i10 = privacySettingsActivity.bioRow;
                                            if (b != i10 || privacySettingsActivity.getContactsController().t(9)) {
                                                i11 = privacySettingsActivity.musicRow;
                                                if (b != i11 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i12 = privacySettingsActivity.birthdayRow;
                                                    if (b != i12 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i13 = privacySettingsActivity.giftsRow;
                                                        if (b != i13 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i14 = privacySettingsActivity.forwardsRow;
                                                            if (b != i14 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i15 = privacySettingsActivity.phoneNumberRow;
                                                                if (b != i15 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i16 = privacySettingsActivity.voicesRow;
                                                                    if (b != i16 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i17 = privacySettingsActivity.noncontactsRow;
                                                                        if (b != i17) {
                                                                            i18 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b == i18 && privacySettingsActivity.getContactsController().H == 2) {
                                                                                return true;
                                                                            }
                                                                            i19 = privacySettingsActivity.newChatsRow;
                                                                            if (b != i19 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                i20 = privacySettingsActivity.emailLoginRow;
                                                                                if (b != i20) {
                                                                                    i21 = privacySettingsActivity.paymentsClearRow;
                                                                                    if (b != i21) {
                                                                                        i22 = privacySettingsActivity.secretMapRow;
                                                                                        if (b != i22) {
                                                                                            i23 = privacySettingsActivity.contactsSyncRow;
                                                                                            if (b != i23 && b != privacySettingsActivity.H) {
                                                                                                i24 = privacySettingsActivity.contactsDeleteRow;
                                                                                                if (b != i24) {
                                                                                                    i25 = privacySettingsActivity.contactsSuggestRow;
                                                                                                    if (b != i25) {
                                                                                                        i26 = privacySettingsActivity.autoDeleteMesages;
                                                                                                        if (b != i26 && b != privacySettingsActivity.I) {
                                                                                                            return false;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // y59
    public final int b() {
        return this.d.P;
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i == privacySettingsActivity.H) {
            return 0;
        }
        i2 = privacySettingsActivity.lastSeenRow;
        if (i == i2) {
            return 0;
        }
        i3 = privacySettingsActivity.phoneNumberRow;
        if (i == i3) {
            return 0;
        }
        i4 = privacySettingsActivity.deleteAccountRow;
        if (i == i4) {
            return 0;
        }
        i5 = privacySettingsActivity.webSessionsRow;
        if (i == i5 || i == privacySettingsActivity.n) {
            return 0;
        }
        i6 = privacySettingsActivity.paymentsClearRow;
        if (i == i6) {
            return 0;
        }
        i7 = privacySettingsActivity.secretMapRow;
        if (i == i7) {
            return 0;
        }
        i8 = privacySettingsActivity.contactsDeleteRow;
        if (i == i8 || i == privacySettingsActivity.I) {
            return 0;
        }
        if (i == privacySettingsActivity.h || i == privacySettingsActivity.F || i == privacySettingsActivity.r || i == privacySettingsActivity.w || i == privacySettingsActivity.O || i == privacySettingsActivity.J || i == privacySettingsActivity.M || i == privacySettingsActivity.y) {
            return 1;
        }
        if (i == 0 || i == privacySettingsActivity.E || i == privacySettingsActivity.f || i == privacySettingsActivity.N || i == privacySettingsActivity.G || i == privacySettingsActivity.L || i == privacySettingsActivity.x) {
            return 2;
        }
        i9 = privacySettingsActivity.secretWebpageRow;
        if (i == i9) {
            return 3;
        }
        i10 = privacySettingsActivity.contactsSyncRow;
        if (i == i10) {
            return 3;
        }
        i11 = privacySettingsActivity.contactsSuggestRow;
        if (i == i11) {
            return 3;
        }
        i12 = privacySettingsActivity.newChatsRow;
        if (i == i12) {
            return 3;
        }
        if (i == privacySettingsActivity.K) {
            return 4;
        }
        i13 = privacySettingsActivity.autoDeleteMesages;
        if (i == i13 || i == privacySettingsActivity.s) {
            return 5;
        }
        i14 = privacySettingsActivity.emailLoginRow;
        if (i == i14) {
            return 5;
        }
        i15 = privacySettingsActivity.passwordRow;
        if (i == i15) {
            return 5;
        }
        i16 = privacySettingsActivity.passkeysRow;
        if (i == i16) {
            return 5;
        }
        i17 = privacySettingsActivity.passcodeRow;
        if (i == i17) {
            return 5;
        }
        i18 = privacySettingsActivity.blockedRow;
        return i == i18 ? 5 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z;
        int i18;
        String M0;
        boolean z2;
        int i19;
        boolean z3;
        String A0;
        String A02;
        String A03;
        String A04;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        String str2;
        String str3;
        int i30;
        String str4;
        boolean z4;
        String str5;
        String str6;
        String c0;
        int i31 = u69Var.f;
        byte b = 16;
        String str7 = null;
        boolean z5 = false;
        if (i31 == 0) {
            boolean z6 = u69Var.a.getTag() != null && ((Integer) u69Var.a.getTag()).intValue() == i;
            u69Var.a.setTag(Integer.valueOf(i));
            vkb vkbVar = (vkb) u69Var.a;
            vkbVar.setBetterLayout(true);
            i2 = this.d.webSessionsRow;
            if (i == i2) {
                vkbVar.b(jb6.M0(2131742574, "WebSessionsTitle"), false);
            } else {
                i3 = this.d.phoneNumberRow;
                PrivacySettingsActivity privacySettingsActivity = this.d;
                if (i == i3) {
                    if (privacySettingsActivity.getContactsController().t(6)) {
                        z3 = true;
                        b = 30;
                    } else {
                        str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 6);
                        z3 = false;
                    }
                    vkbVar.c(jb6.M0(2131746525, "PrivacyPhone"), str7, false, true);
                } else {
                    i4 = privacySettingsActivity.lastSeenRow;
                    PrivacySettingsActivity privacySettingsActivity2 = this.d;
                    if (i == i4) {
                        if (privacySettingsActivity2.getContactsController().t(0)) {
                            z3 = true;
                            b = 30;
                        } else {
                            str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 0);
                            z3 = false;
                        }
                        vkbVar.c(jb6.M0(2131746550, "PrivacyLastSeen"), str7, false, true);
                    } else {
                        if (i == privacySettingsActivity2.n) {
                            if (privacySettingsActivity2.getContactsController().t(1)) {
                                A04 = null;
                                z = true;
                                b = 30;
                            } else {
                                A04 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 1);
                                z = false;
                            }
                            vkbVar.c(jb6.M0(2131746552, null), A04, false, false);
                        } else {
                            i5 = privacySettingsActivity2.callsRow;
                            PrivacySettingsActivity privacySettingsActivity3 = this.d;
                            if (i == i5) {
                                if (privacySettingsActivity3.getContactsController().t(2)) {
                                    z3 = true;
                                    b = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 2);
                                    z3 = false;
                                }
                                vkbVar.c(jb6.M0(2131752549, "Calls"), str7, false, true);
                            } else {
                                i6 = privacySettingsActivity3.profilePhotoRow;
                                PrivacySettingsActivity privacySettingsActivity4 = this.d;
                                if (i == i6) {
                                    if (privacySettingsActivity4.getContactsController().t(4)) {
                                        z3 = true;
                                        b = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 4);
                                        z3 = false;
                                    }
                                    vkbVar.c(jb6.M0(2131746512, "PrivacyProfilePhoto"), str7, false, true);
                                } else {
                                    i7 = privacySettingsActivity4.bioRow;
                                    PrivacySettingsActivity privacySettingsActivity5 = this.d;
                                    if (i == i7) {
                                        if (privacySettingsActivity5.getContactsController().t(9)) {
                                            z3 = true;
                                            b = 30;
                                        } else {
                                            str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 9);
                                            z3 = false;
                                        }
                                        vkbVar.c(jb6.M0(2131746602, "PrivacyBio"), str7, false, true);
                                    } else {
                                        i8 = privacySettingsActivity5.musicRow;
                                        PrivacySettingsActivity privacySettingsActivity6 = this.d;
                                        if (i == i8) {
                                            if (privacySettingsActivity6.getContactsController().t(14)) {
                                                A03 = null;
                                                z = true;
                                                b = 30;
                                            } else {
                                                A03 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 14);
                                                z = false;
                                            }
                                            vkbVar.c(jb6.M0(2131746539, null), A03, false, true);
                                        } else {
                                            i9 = privacySettingsActivity6.birthdayRow;
                                            PrivacySettingsActivity privacySettingsActivity7 = this.d;
                                            if (i == i9) {
                                                if (privacySettingsActivity7.getContactsController().t(11)) {
                                                    A02 = null;
                                                    z = true;
                                                    b = 30;
                                                } else {
                                                    A02 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 11);
                                                    z = false;
                                                }
                                                vkbVar.c(jb6.M0(2131746595, null), A02, false, true);
                                            } else {
                                                i10 = privacySettingsActivity7.giftsRow;
                                                PrivacySettingsActivity privacySettingsActivity8 = this.d;
                                                if (i == i10) {
                                                    if (privacySettingsActivity8.getContactsController().t(12)) {
                                                        A0 = null;
                                                        z = true;
                                                        b = 30;
                                                    } else {
                                                        A0 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 12);
                                                        z = false;
                                                    }
                                                    vkbVar.c(jb6.M0(2131746564, null), A0, false, true);
                                                } else {
                                                    i11 = privacySettingsActivity8.forwardsRow;
                                                    PrivacySettingsActivity privacySettingsActivity9 = this.d;
                                                    if (i == i11) {
                                                        if (privacySettingsActivity9.getContactsController().t(5)) {
                                                            z3 = true;
                                                            b = 30;
                                                        } else {
                                                            str7 = PrivacySettingsActivity.A0(this.d.getAccountInstance(), 5);
                                                            z3 = false;
                                                        }
                                                        vkbVar.c(jb6.M0(2131746572, "PrivacyForwards"), str7, false, true);
                                                    } else {
                                                        i12 = privacySettingsActivity9.voicesRow;
                                                        PrivacySettingsActivity privacySettingsActivity10 = this.d;
                                                        int i32 = 2131747486;
                                                        if (i == i12) {
                                                            if (privacySettingsActivity10.getContactsController().t(8)) {
                                                                M0 = null;
                                                                z2 = true;
                                                                b = 30;
                                                            } else {
                                                                M0 = !this.d.getUserConfig().p() ? jb6.M0(2131747486, null) : PrivacySettingsActivity.A0(this.d.getAccountInstance(), 8);
                                                                z2 = false;
                                                            }
                                                            SpannableStringBuilder z0 = this.d.z0(jb6.M0(2131746493, null));
                                                            i19 = this.d.noncontactsRow;
                                                            vkbVar.c(z0, M0, false, i19 != -1);
                                                            anb.s(vkbVar.getValueImageView(), cmb.l6, null, PorterDuff.Mode.MULTIPLY);
                                                            z5 = z2;
                                                        } else {
                                                            i13 = privacySettingsActivity10.noncontactsRow;
                                                            PrivacySettingsActivity privacySettingsActivity11 = this.d;
                                                            if (i == i13) {
                                                                if (privacySettingsActivity11.Z) {
                                                                    i32 = 2131751716;
                                                                } else if (privacySettingsActivity11.Y) {
                                                                    i32 = 2131751715;
                                                                }
                                                                String M02 = jb6.M0(i32, null);
                                                                CharSequence z02 = (!this.d.getMessagesController().l4.n2.f || this.d.getMessagesController().l4.K1.f) ? this.d.z0(jb6.M0(2131746545, null)) : jb6.M0(2131746545, null);
                                                                i18 = this.d.musicRow;
                                                                vkbVar.c(z02, M02, false, i18 != -1);
                                                            } else if (i == privacySettingsActivity11.H) {
                                                                vkbVar.b(jb6.M0(2131743922, "TelegramPassport"), true);
                                                            } else {
                                                                i14 = privacySettingsActivity11.deleteAccountRow;
                                                                PrivacySettingsActivity privacySettingsActivity12 = this.d;
                                                                if (i == i14) {
                                                                    if (privacySettingsActivity12.getContactsController().H != 2) {
                                                                        z = true;
                                                                    } else {
                                                                        int i33 = this.d.getContactsController().I;
                                                                        str7 = i33 <= 182 ? jb6.G(i33 / 30, "Months", new Object[0]) : i33 == 365 ? jb6.G(12, "Months", new Object[0]) : i33 == 548 ? jb6.G(18, "Months", new Object[0]) : i33 == 730 ? jb6.G(24, "Months", new Object[0]) : i33 > 30 ? jb6.G((int) Math.round(i33 / 30.0d), "Months", new Object[0]) : jb6.G(i33, "Days", new Object[0]);
                                                                        z = false;
                                                                    }
                                                                    vkbVar.c(jb6.M0(2131751532, "DeleteAccountIfAwayFor3"), str7, this.d.R, false);
                                                                    this.d.R = false;
                                                                } else {
                                                                    i15 = privacySettingsActivity12.paymentsClearRow;
                                                                    if (i == i15) {
                                                                        vkbVar.b(jb6.M0(2131746532, "PrivacyPaymentsClear"), true);
                                                                    } else {
                                                                        PrivacySettingsActivity privacySettingsActivity13 = this.d;
                                                                        if (i == privacySettingsActivity13.I) {
                                                                            vkbVar.b(jb6.M0(2131746597, null), true);
                                                                        } else {
                                                                            i16 = privacySettingsActivity13.secretMapRow;
                                                                            if (i == i16) {
                                                                                int i34 = gda.l0;
                                                                                vkbVar.c(jb6.M0(2131748446, "MapPreviewProvider"), i34 != 0 ? i34 != 1 ? i34 != 2 ? jb6.M0(2131748441, "MapPreviewProviderYandex") : jb6.M0(2131748444, "MapPreviewProviderNobody") : jb6.M0(2131748445, "MapPreviewProviderGoogle") : jb6.M0(2131748443, "MapPreviewProviderTelegram"), this.d.S, true);
                                                                                this.d.S = false;
                                                                            } else {
                                                                                i17 = this.d.contactsDeleteRow;
                                                                                if (i == i17) {
                                                                                    vkbVar.b(jb6.M0(2131743981, "SyncContactsDelete"), true);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z5 = z;
                    }
                }
                z5 = z3;
            }
            vkbVar.r = z5;
            vkbVar.E = b;
            if (z6) {
                vkbVar.F = true;
            } else {
                vkbVar.y = z5 ? 1.0f : 0.0f;
            }
            vkbVar.invalidate();
            return;
        }
        if (i31 == 1) {
            njb njbVar = (njb) u69Var.a;
            PrivacySettingsActivity privacySettingsActivity14 = this.d;
            if (i == privacySettingsActivity14.F) {
                njbVar.setText(jb6.M0(2131751534, "DeleteAccountHelp"));
                return;
            }
            if (i == privacySettingsActivity14.r) {
                njbVar.setText(jb6.M0(2131749138, "GroupsAndChannelsHelp"));
                return;
            }
            if (i == privacySettingsActivity14.w) {
                njbVar.setText(jb6.M0(2131745286, "SessionsSettingsInfo"));
                return;
            }
            if (i == privacySettingsActivity14.O) {
                njbVar.setText(jb6.M0(2131745417, "SecretWebPageInfo"));
                return;
            }
            if (i == privacySettingsActivity14.J) {
                njbVar.setText(jb6.M0(2131746584, "PrivacyBotsInfo"));
                return;
            }
            if (i == privacySettingsActivity14.h) {
                njbVar.setText(jb6.M0(2131746551, null));
                return;
            } else if (i == privacySettingsActivity14.M) {
                njbVar.setText(jb6.M0(2131744095, "SuggestContactsInfo"));
                return;
            } else {
                if (i == privacySettingsActivity14.y) {
                    njbVar.setText(jb6.M0(2131754135, "ArchiveAndMuteInfo"));
                    return;
                }
                return;
            }
        }
        if (i31 == 2) {
            jf5 jf5Var = (jf5) u69Var.a;
            PrivacySettingsActivity privacySettingsActivity15 = this.d;
            if (i == privacySettingsActivity15.f) {
                jf5Var.setText(jb6.M0(2131746504, "PrivacyTitle"));
                return;
            }
            if (i == 0) {
                jf5Var.setText(jb6.M0(2131745416, "SecurityTitle"));
                return;
            }
            if (i == privacySettingsActivity15.E) {
                jf5Var.setText(jb6.M0(2131751455, "DeleteMyAccount"));
                return;
            }
            if (i == privacySettingsActivity15.N) {
                jf5Var.setText(jb6.M0(2131745429, "SecretChat"));
                return;
            }
            if (i == privacySettingsActivity15.G) {
                jf5Var.setText(jb6.M0(2131746585, "PrivacyBots"));
                return;
            } else if (i == privacySettingsActivity15.L) {
                jf5Var.setText(jb6.M0(2131751717, "Contacts"));
                return;
            } else {
                if (i == privacySettingsActivity15.x) {
                    jf5Var.setText(jb6.M0(2131748042, "NewChatsFromNonContacts"));
                    return;
                }
                return;
            }
        }
        if (i31 == 3) {
            bjb bjbVar = (bjb) u69Var.a;
            i20 = this.d.secretWebpageRow;
            if (i == i20) {
                bjbVar.f(jb6.M0(2131745418, "SecretWebPage"), this.d.getMessagesController().z2 == 1, false);
                return;
            }
            i21 = this.d.contactsSyncRow;
            if (i == i21) {
                bjbVar.f(jb6.M0(2131743983, "SyncContacts"), this.d.U, true);
                return;
            }
            i22 = this.d.contactsSuggestRow;
            if (i == i22) {
                bjbVar.f(jb6.M0(2131744097, "SuggestContacts"), this.d.W, false);
                return;
            }
            i23 = this.d.newChatsRow;
            if (i == i23) {
                bjbVar.f(jb6.M0(2131754136, "ArchiveAndMute"), this.d.X, false);
                return;
            }
            return;
        }
        if (i31 == 5) {
            View view = u69Var.a;
            xib xibVar = (xib) view;
            boolean z7 = view.getTag() != null && ((Integer) u69Var.a.getTag()).intValue() == i;
            u69Var.a.setTag(Integer.valueOf(i));
            xibVar.setPrioritizeTitleOverValue(false);
            i24 = this.d.autoDeleteMesages;
            PrivacySettingsActivity privacySettingsActivity16 = this.d;
            if (i == i24) {
                int i35 = privacySettingsActivity16.getUserConfig().q0;
                if (i35 == -1) {
                    c0 = null;
                    z5 = true;
                } else {
                    c0 = i35 > 0 ? jb6.c0(i35 * 60) : jb6.M0(2131747172, "PasswordOff");
                }
                xibVar.u(jb6.M0(2131753815, "AutoDeleteMessages"), c0, true, R.drawable.msg2_autodelete, true);
            } else {
                String str8 = "";
                if (i == privacySettingsActivity16.s) {
                    if (privacySettingsActivity16.b0.i0() != 0) {
                        str6 = String.format(jb6.D0().y, "%d", Integer.valueOf(this.d.b0.i0()));
                    } else if (this.d.getMessagesController().a == 0) {
                        z5 = true;
                        str6 = str8;
                    } else {
                        str6 = String.format(jb6.D0().y, "%d", Integer.valueOf(this.d.getMessagesController().a));
                    }
                    this.d.getMessagesController().a = this.d.b0.i0();
                    xibVar.u(jb6.M0(2131745285, null), str6, true, R.drawable.msg2_devices, false);
                } else {
                    i25 = privacySettingsActivity16.emailLoginRow;
                    PrivacySettingsActivity privacySettingsActivity17 = this.d;
                    if (i == i25) {
                        TL_account.Password password = privacySettingsActivity17.d;
                        if (password == null) {
                            z4 = true;
                            str5 = str8;
                        } else {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                            int indexOf = this.d.d.login_email_pattern.indexOf(42);
                            int lastIndexOf = this.d.d.login_email_pattern.lastIndexOf(42);
                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                wkb wkbVar = new wkb();
                                wkbVar.a |= 256;
                                wkbVar.b = indexOf;
                                int i36 = lastIndexOf + 1;
                                wkbVar.c = i36;
                                valueOf.setSpan(new xkb(wkbVar, 0), indexOf, i36, 0);
                            }
                            z4 = false;
                            str5 = valueOf;
                        }
                        xibVar.setPrioritizeTitleOverValue(true);
                        String M03 = jb6.M0(2131751139, null);
                        xibVar.x = xibVar.getDefaultImageLeft();
                        xibVar.s = xibVar.c(false);
                        lka lkaVar = xibVar.a;
                        lkaVar.l(M03, false);
                        lkaVar.i(null);
                        lka lkaVar2 = xibVar.d;
                        lkaVar2.setVisibility(0);
                        lkaVar2.l(str5, false);
                        xibVar.c.setVisibility(8);
                        xibVar.h.setVisibility(8);
                        s09 s09Var = xibVar.e;
                        s09Var.setVisibility(0);
                        s09Var.setTranslationX(0.0f);
                        s09Var.setTranslationY(0.0f);
                        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
                        s09Var.setImageResource(R.drawable.msg2_email);
                        xibVar.r = true;
                        xibVar.setWillNotDraw(false);
                        Switch r1 = xibVar.f;
                        if (r1 != null) {
                            r1.setVisibility(8);
                        }
                        tm tmVar = xibVar.L;
                        if (tmVar != null) {
                            tmVar.g(null, false);
                        }
                        z5 = z4;
                    } else {
                        i26 = privacySettingsActivity17.passwordRow;
                        PrivacySettingsActivity privacySettingsActivity18 = this.d;
                        if (i == i26) {
                            TL_account.Password password2 = privacySettingsActivity18.d;
                            int i37 = R.drawable.menu_2sv;
                            if (password2 == null) {
                                i30 = R.drawable.menu_2sv;
                                z5 = true;
                                str4 = str8;
                            } else {
                                if (password2.has_password) {
                                    String M04 = jb6.M0(2131747171, null);
                                    i37 = R.drawable.menu_2sv_on;
                                    str3 = M04;
                                } else {
                                    str3 = jb6.M0(2131747172, null);
                                }
                                i30 = i37;
                                str4 = str3;
                            }
                            xibVar.u(jb6.M0(2131743625, null), str4, true, i30, true);
                        } else {
                            i27 = privacySettingsActivity18.passkeysRow;
                            PrivacySettingsActivity privacySettingsActivity19 = this.d;
                            if (i == i27) {
                                ArrayList arrayList = privacySettingsActivity19.e;
                                if (arrayList == null) {
                                    z5 = true;
                                    str2 = str8;
                                } else if (arrayList.size() == 1 && xibVar.c.getPaint().measureText(((TL_account.Passkey) this.d.e.get(0)).name) < gm.q.x / 3.0f) {
                                    str2 = ((TL_account.Passkey) this.d.e.get(0)).name;
                                } else if (this.d.e.size() > 0) {
                                    str2 = this.d.e.size() + "";
                                } else {
                                    str2 = jb6.M0(2131747172, null);
                                }
                                xibVar.u(jb6.M0(2131747384, null), str2, true, R.drawable.msg2_permissions, true);
                            } else {
                                i28 = privacySettingsActivity19.passcodeRow;
                                if (i == i28) {
                                    xibVar.u(jb6.M0(2131747390, null), gda.r.length() != 0 ? jb6.M0(2131747171, null) : jb6.M0(2131747172, null), true, R.drawable.msg2_secret, true);
                                } else {
                                    i29 = this.d.blockedRow;
                                    if (i == i29) {
                                        int i38 = this.d.getMessagesController().y0;
                                        if (i38 == 0) {
                                            str = jb6.M0(2131753647, "BlockedEmpty");
                                        } else if (i38 > 0) {
                                            str = String.format(jb6.D0().y, "%d", Integer.valueOf(i38));
                                        } else {
                                            z5 = true;
                                            str = str8;
                                        }
                                        xibVar.u(jb6.M0(2131753646, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            xibVar.h(16, z5, z7);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return new b59(i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? new bjb(context) : new xib(context) : new bba(context, (hg9) null) : new jf5(context) : new njb(context) : new vkb(context));
    }
}
