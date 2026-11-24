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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dk8 extends n39 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public dk8(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
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
        int b = s49Var.b();
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

    @Override // w39
    public final int b() {
        return this.d.P;
    }

    @Override // w39
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
    @Override // w39
    public final void t(s49 s49Var, int i) {
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
        String z0;
        String z02;
        String z03;
        String z04;
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
        int i31 = s49Var.f;
        byte b = 16;
        String str7 = null;
        boolean z5 = false;
        if (i31 == 0) {
            boolean z6 = s49Var.a.getTag() != null && ((Integer) s49Var.a.getTag()).intValue() == i;
            s49Var.a.setTag(Integer.valueOf(i));
            uib uibVar = (uib) s49Var.a;
            uibVar.setBetterLayout(true);
            i2 = this.d.webSessionsRow;
            if (i == i2) {
                uibVar.b(k96.M0(2131742648, "WebSessionsTitle"), false);
            } else {
                i3 = this.d.phoneNumberRow;
                PrivacySettingsActivity privacySettingsActivity = this.d;
                if (i == i3) {
                    if (privacySettingsActivity.getContactsController().t(6)) {
                        z3 = true;
                        b = 30;
                    } else {
                        str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 6);
                        z3 = false;
                    }
                    uibVar.c(k96.M0(2131746599, "PrivacyPhone"), str7, false, true);
                } else {
                    i4 = privacySettingsActivity.lastSeenRow;
                    PrivacySettingsActivity privacySettingsActivity2 = this.d;
                    if (i == i4) {
                        if (privacySettingsActivity2.getContactsController().t(0)) {
                            z3 = true;
                            b = 30;
                        } else {
                            str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 0);
                            z3 = false;
                        }
                        uibVar.c(k96.M0(2131746624, "PrivacyLastSeen"), str7, false, true);
                    } else {
                        if (i == privacySettingsActivity2.n) {
                            if (privacySettingsActivity2.getContactsController().t(1)) {
                                z04 = null;
                                z = true;
                                b = 30;
                            } else {
                                z04 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 1);
                                z = false;
                            }
                            uibVar.c(k96.M0(2131746626, null), z04, false, false);
                        } else {
                            i5 = privacySettingsActivity2.callsRow;
                            PrivacySettingsActivity privacySettingsActivity3 = this.d;
                            if (i == i5) {
                                if (privacySettingsActivity3.getContactsController().t(2)) {
                                    z3 = true;
                                    b = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 2);
                                    z3 = false;
                                }
                                uibVar.c(k96.M0(2131752584, "Calls"), str7, false, true);
                            } else {
                                i6 = privacySettingsActivity3.profilePhotoRow;
                                PrivacySettingsActivity privacySettingsActivity4 = this.d;
                                if (i == i6) {
                                    if (privacySettingsActivity4.getContactsController().t(4)) {
                                        z3 = true;
                                        b = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 4);
                                        z3 = false;
                                    }
                                    uibVar.c(k96.M0(2131746586, "PrivacyProfilePhoto"), str7, false, true);
                                } else {
                                    i7 = privacySettingsActivity4.bioRow;
                                    PrivacySettingsActivity privacySettingsActivity5 = this.d;
                                    if (i == i7) {
                                        if (privacySettingsActivity5.getContactsController().t(9)) {
                                            z3 = true;
                                            b = 30;
                                        } else {
                                            str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 9);
                                            z3 = false;
                                        }
                                        uibVar.c(k96.M0(2131746676, "PrivacyBio"), str7, false, true);
                                    } else {
                                        i8 = privacySettingsActivity5.musicRow;
                                        PrivacySettingsActivity privacySettingsActivity6 = this.d;
                                        if (i == i8) {
                                            if (privacySettingsActivity6.getContactsController().t(14)) {
                                                z03 = null;
                                                z = true;
                                                b = 30;
                                            } else {
                                                z03 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 14);
                                                z = false;
                                            }
                                            uibVar.c(k96.M0(2131746613, null), z03, false, true);
                                        } else {
                                            i9 = privacySettingsActivity6.birthdayRow;
                                            PrivacySettingsActivity privacySettingsActivity7 = this.d;
                                            if (i == i9) {
                                                if (privacySettingsActivity7.getContactsController().t(11)) {
                                                    z02 = null;
                                                    z = true;
                                                    b = 30;
                                                } else {
                                                    z02 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 11);
                                                    z = false;
                                                }
                                                uibVar.c(k96.M0(2131746669, null), z02, false, true);
                                            } else {
                                                i10 = privacySettingsActivity7.giftsRow;
                                                PrivacySettingsActivity privacySettingsActivity8 = this.d;
                                                if (i == i10) {
                                                    if (privacySettingsActivity8.getContactsController().t(12)) {
                                                        z0 = null;
                                                        z = true;
                                                        b = 30;
                                                    } else {
                                                        z0 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 12);
                                                        z = false;
                                                    }
                                                    uibVar.c(k96.M0(2131746638, null), z0, false, true);
                                                } else {
                                                    i11 = privacySettingsActivity8.forwardsRow;
                                                    PrivacySettingsActivity privacySettingsActivity9 = this.d;
                                                    if (i == i11) {
                                                        if (privacySettingsActivity9.getContactsController().t(5)) {
                                                            z3 = true;
                                                            b = 30;
                                                        } else {
                                                            str7 = PrivacySettingsActivity.z0(this.d.getAccountInstance(), 5);
                                                            z3 = false;
                                                        }
                                                        uibVar.c(k96.M0(2131746646, "PrivacyForwards"), str7, false, true);
                                                    } else {
                                                        i12 = privacySettingsActivity9.voicesRow;
                                                        PrivacySettingsActivity privacySettingsActivity10 = this.d;
                                                        int i32 = 2131747560;
                                                        if (i == i12) {
                                                            if (privacySettingsActivity10.getContactsController().t(8)) {
                                                                M0 = null;
                                                                z2 = true;
                                                                b = 30;
                                                            } else {
                                                                M0 = !this.d.getUserConfig().p() ? k96.M0(2131747560, null) : PrivacySettingsActivity.z0(this.d.getAccountInstance(), 8);
                                                                z2 = false;
                                                            }
                                                            SpannableStringBuilder y0 = this.d.y0(k96.M0(2131746567, null));
                                                            i19 = this.d.noncontactsRow;
                                                            uibVar.c(y0, M0, false, i19 != -1);
                                                            zkb.s(uibVar.getValueImageView(), bkb.l6, null, PorterDuff.Mode.MULTIPLY);
                                                            z5 = z2;
                                                        } else {
                                                            i13 = privacySettingsActivity10.noncontactsRow;
                                                            PrivacySettingsActivity privacySettingsActivity11 = this.d;
                                                            if (i == i13) {
                                                                if (privacySettingsActivity11.Z) {
                                                                    i32 = 2131751767;
                                                                } else if (privacySettingsActivity11.Y) {
                                                                    i32 = 2131751766;
                                                                }
                                                                String M02 = k96.M0(i32, null);
                                                                CharSequence y02 = (!this.d.getMessagesController().k4.n2.f || this.d.getMessagesController().k4.K1.f) ? this.d.y0(k96.M0(2131746619, null)) : k96.M0(2131746619, null);
                                                                i18 = this.d.musicRow;
                                                                uibVar.c(y02, M02, false, i18 != -1);
                                                            } else if (i == privacySettingsActivity11.H) {
                                                                uibVar.b(k96.M0(2131743996, "TelegramPassport"), true);
                                                            } else {
                                                                i14 = privacySettingsActivity11.deleteAccountRow;
                                                                PrivacySettingsActivity privacySettingsActivity12 = this.d;
                                                                if (i == i14) {
                                                                    if (privacySettingsActivity12.getContactsController().H != 2) {
                                                                        z = true;
                                                                    } else {
                                                                        int i33 = this.d.getContactsController().I;
                                                                        str7 = i33 <= 182 ? k96.G(i33 / 30, "Months", new Object[0]) : i33 == 365 ? k96.G(12, "Months", new Object[0]) : i33 == 548 ? k96.G(18, "Months", new Object[0]) : i33 == 730 ? k96.G(24, "Months", new Object[0]) : i33 > 30 ? k96.G((int) Math.round(i33 / 30.0d), "Months", new Object[0]) : k96.G(i33, "Days", new Object[0]);
                                                                        z = false;
                                                                    }
                                                                    uibVar.c(k96.M0(2131751583, "DeleteAccountIfAwayFor3"), str7, this.d.R, false);
                                                                    this.d.R = false;
                                                                } else {
                                                                    i15 = privacySettingsActivity12.paymentsClearRow;
                                                                    if (i == i15) {
                                                                        uibVar.b(k96.M0(2131746606, "PrivacyPaymentsClear"), true);
                                                                    } else {
                                                                        PrivacySettingsActivity privacySettingsActivity13 = this.d;
                                                                        if (i == privacySettingsActivity13.I) {
                                                                            uibVar.b(k96.M0(2131746671, null), true);
                                                                        } else {
                                                                            i16 = privacySettingsActivity13.secretMapRow;
                                                                            if (i == i16) {
                                                                                int i34 = gba.l0;
                                                                                uibVar.c(k96.M0(2131748497, "MapPreviewProvider"), i34 != 0 ? i34 != 1 ? i34 != 2 ? k96.M0(2131748492, "MapPreviewProviderYandex") : k96.M0(2131748495, "MapPreviewProviderNobody") : k96.M0(2131748496, "MapPreviewProviderGoogle") : k96.M0(2131748494, "MapPreviewProviderTelegram"), this.d.S, true);
                                                                                this.d.S = false;
                                                                            } else {
                                                                                i17 = this.d.contactsDeleteRow;
                                                                                if (i == i17) {
                                                                                    uibVar.b(k96.M0(2131744055, "SyncContactsDelete"), true);
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
            uibVar.r = z5;
            uibVar.E = b;
            if (z6) {
                uibVar.F = true;
            } else {
                uibVar.y = z5 ? 1.0f : 0.0f;
            }
            uibVar.invalidate();
            return;
        }
        if (i31 == 1) {
            mhb mhbVar = (mhb) s49Var.a;
            PrivacySettingsActivity privacySettingsActivity14 = this.d;
            if (i == privacySettingsActivity14.F) {
                mhbVar.setText(k96.M0(2131751585, "DeleteAccountHelp"));
                return;
            }
            if (i == privacySettingsActivity14.r) {
                mhbVar.setText(k96.M0(2131749189, "GroupsAndChannelsHelp"));
                return;
            }
            if (i == privacySettingsActivity14.w) {
                mhbVar.setText(k96.M0(2131745360, "SessionsSettingsInfo"));
                return;
            }
            if (i == privacySettingsActivity14.O) {
                mhbVar.setText(k96.M0(2131745491, "SecretWebPageInfo"));
                return;
            }
            if (i == privacySettingsActivity14.J) {
                mhbVar.setText(k96.M0(2131746658, "PrivacyBotsInfo"));
                return;
            }
            if (i == privacySettingsActivity14.h) {
                mhbVar.setText(k96.M0(2131746625, null));
                return;
            } else if (i == privacySettingsActivity14.M) {
                mhbVar.setText(k96.M0(2131744169, "SuggestContactsInfo"));
                return;
            } else {
                if (i == privacySettingsActivity14.y) {
                    mhbVar.setText(k96.M0(2131754167, "ArchiveAndMuteInfo"));
                    return;
                }
                return;
            }
        }
        if (i31 == 2) {
            ld5 ld5Var = (ld5) s49Var.a;
            PrivacySettingsActivity privacySettingsActivity15 = this.d;
            if (i == privacySettingsActivity15.f) {
                ld5Var.setText(k96.M0(2131746578, "PrivacyTitle"));
                return;
            }
            if (i == 0) {
                ld5Var.setText(k96.M0(2131745490, "SecurityTitle"));
                return;
            }
            if (i == privacySettingsActivity15.E) {
                ld5Var.setText(k96.M0(2131751506, "DeleteMyAccount"));
                return;
            }
            if (i == privacySettingsActivity15.N) {
                ld5Var.setText(k96.M0(2131745503, "SecretChat"));
                return;
            }
            if (i == privacySettingsActivity15.G) {
                ld5Var.setText(k96.M0(2131746659, "PrivacyBots"));
                return;
            } else if (i == privacySettingsActivity15.L) {
                ld5Var.setText(k96.M0(2131751768, "Contacts"));
                return;
            } else {
                if (i == privacySettingsActivity15.x) {
                    ld5Var.setText(k96.M0(2131748093, "NewChatsFromNonContacts"));
                    return;
                }
                return;
            }
        }
        if (i31 == 3) {
            ahb ahbVar = (ahb) s49Var.a;
            i20 = this.d.secretWebpageRow;
            if (i == i20) {
                ahbVar.f(k96.M0(2131745492, "SecretWebPage"), this.d.getMessagesController().z2 == 1, false);
                return;
            }
            i21 = this.d.contactsSyncRow;
            if (i == i21) {
                ahbVar.f(k96.M0(2131744057, "SyncContacts"), this.d.U, true);
                return;
            }
            i22 = this.d.contactsSuggestRow;
            if (i == i22) {
                ahbVar.f(k96.M0(2131744171, "SuggestContacts"), this.d.W, false);
                return;
            }
            i23 = this.d.newChatsRow;
            if (i == i23) {
                ahbVar.f(k96.M0(2131754168, "ArchiveAndMute"), this.d.X, false);
                return;
            }
            return;
        }
        if (i31 == 5) {
            View view = s49Var.a;
            wgb wgbVar = (wgb) view;
            boolean z7 = view.getTag() != null && ((Integer) s49Var.a.getTag()).intValue() == i;
            s49Var.a.setTag(Integer.valueOf(i));
            wgbVar.setPrioritizeTitleOverValue(false);
            i24 = this.d.autoDeleteMesages;
            PrivacySettingsActivity privacySettingsActivity16 = this.d;
            if (i == i24) {
                int i35 = privacySettingsActivity16.getUserConfig().q0;
                if (i35 == -1) {
                    c0 = null;
                    z5 = true;
                } else {
                    c0 = i35 > 0 ? k96.c0(i35 * 60) : k96.M0(2131747246, "PasswordOff");
                }
                wgbVar.u(k96.M0(2131753847, "AutoDeleteMessages"), c0, true, R.drawable.msg2_autodelete, true);
            } else {
                String str8 = "";
                if (i == privacySettingsActivity16.s) {
                    if (privacySettingsActivity16.b0.h0() != 0) {
                        str6 = String.format(k96.D0().y, "%d", Integer.valueOf(this.d.b0.h0()));
                    } else if (this.d.getMessagesController().a == 0) {
                        z5 = true;
                        str6 = str8;
                    } else {
                        str6 = String.format(k96.D0().y, "%d", Integer.valueOf(this.d.getMessagesController().a));
                    }
                    this.d.getMessagesController().a = this.d.b0.h0();
                    wgbVar.u(k96.M0(2131745359, null), str6, true, R.drawable.msg2_devices, false);
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
                                vib vibVar = new vib();
                                vibVar.a |= 256;
                                vibVar.b = indexOf;
                                int i36 = lastIndexOf + 1;
                                vibVar.c = i36;
                                valueOf.setSpan(new wib(vibVar, 0), indexOf, i36, 0);
                            }
                            z4 = false;
                            str5 = valueOf;
                        }
                        wgbVar.setPrioritizeTitleOverValue(true);
                        String M03 = k96.M0(2131751190, null);
                        wgbVar.x = wgbVar.getDefaultImageLeft();
                        wgbVar.s = wgbVar.c(false);
                        jia jiaVar = wgbVar.a;
                        jiaVar.l(M03, false);
                        jiaVar.i(null);
                        jia jiaVar2 = wgbVar.d;
                        jiaVar2.setVisibility(0);
                        jiaVar2.l(str5, false);
                        wgbVar.c.setVisibility(8);
                        wgbVar.h.setVisibility(8);
                        ry8 ry8Var = wgbVar.e;
                        ry8Var.setVisibility(0);
                        ry8Var.setTranslationX(0.0f);
                        ry8Var.setTranslationY(0.0f);
                        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
                        ry8Var.setImageResource(R.drawable.msg2_email);
                        wgbVar.r = true;
                        wgbVar.setWillNotDraw(false);
                        Switch r1 = wgbVar.f;
                        if (r1 != null) {
                            r1.setVisibility(8);
                        }
                        tl tlVar = wgbVar.L;
                        if (tlVar != null) {
                            tlVar.g(null, false);
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
                                    String M04 = k96.M0(2131747245, null);
                                    i37 = R.drawable.menu_2sv_on;
                                    str3 = M04;
                                } else {
                                    str3 = k96.M0(2131747246, null);
                                }
                                i30 = i37;
                                str4 = str3;
                            }
                            wgbVar.u(k96.M0(2131743699, null), str4, true, i30, true);
                        } else {
                            i27 = privacySettingsActivity18.passkeysRow;
                            PrivacySettingsActivity privacySettingsActivity19 = this.d;
                            if (i == i27) {
                                ArrayList arrayList = privacySettingsActivity19.e;
                                if (arrayList == null) {
                                    z5 = true;
                                    str2 = str8;
                                } else if (arrayList.size() == 1 && wgbVar.c.getPaint().measureText(((TL_account.Passkey) this.d.e.get(0)).name) < gl.q.x / 3.0f) {
                                    str2 = ((TL_account.Passkey) this.d.e.get(0)).name;
                                } else if (this.d.e.size() > 0) {
                                    str2 = this.d.e.size() + "";
                                } else {
                                    str2 = k96.M0(2131747246, null);
                                }
                                wgbVar.u(k96.M0(2131747458, null), str2, true, R.drawable.msg2_permissions, true);
                            } else {
                                i28 = privacySettingsActivity19.passcodeRow;
                                if (i == i28) {
                                    wgbVar.u(k96.M0(2131747464, null), gba.r.length() != 0 ? k96.M0(2131747245, null) : k96.M0(2131747246, null), true, R.drawable.msg2_secret, true);
                                } else {
                                    i29 = this.d.blockedRow;
                                    if (i == i29) {
                                        int i38 = this.d.getMessagesController().y0;
                                        if (i38 == 0) {
                                            str = k96.M0(2131753679, "BlockedEmpty");
                                        } else if (i38 > 0) {
                                            str = String.format(k96.D0().y, "%d", Integer.valueOf(i38));
                                        } else {
                                            z5 = true;
                                            str = str8;
                                        }
                                        wgbVar.u(k96.M0(2131753678, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            wgbVar.h(16, z5, z7);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return new y29(i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 5 ? new ahb(context) : new wgb(context) : new b9a(context, (de9) null) : new ld5(context) : new mhb(context) : new uib(context));
    }
}
