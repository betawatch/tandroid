package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ot0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public ot0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
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
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int b10 = d1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i7 = privacySettingsActivity.passcodeRow;
        if (b10 != i7) {
            i10 = privacySettingsActivity.passwordRow;
            if (b10 != i10) {
                i11 = privacySettingsActivity.passkeysRow;
                if (b10 != i11) {
                    i12 = privacySettingsActivity.blockedRow;
                    if (b10 != i12 && b10 != privacySettingsActivity.s) {
                        i13 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i13) {
                            i14 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i14 && (b10 != privacySettingsActivity.n || privacySettingsActivity.getContactsController().t(1))) {
                                i15 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i15 || privacySettingsActivity.getContactsController().t(0)) {
                                    i16 = privacySettingsActivity.callsRow;
                                    if (b10 != i16 || privacySettingsActivity.getContactsController().t(2)) {
                                        i17 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i17 || privacySettingsActivity.getContactsController().t(4)) {
                                            i18 = privacySettingsActivity.bioRow;
                                            if (b10 != i18 || privacySettingsActivity.getContactsController().t(9)) {
                                                i19 = privacySettingsActivity.musicRow;
                                                if (b10 != i19 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i20 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i20 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i21 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i21 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i22 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i22 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i23 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i23 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i24 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i24 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i25 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i25) {
                                                                            i26 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 == i26 && privacySettingsActivity.getContactsController().G == 2) {
                                                                                return true;
                                                                            }
                                                                            i27 = privacySettingsActivity.newChatsRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().F != 2) {
                                                                                i28 = privacySettingsActivity.emailLoginRow;
                                                                                if (b10 != i28) {
                                                                                    i29 = privacySettingsActivity.paymentsClearRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.secretMapRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.contactsSyncRow;
                                                                                            if (b10 != i31 && b10 != privacySettingsActivity.G) {
                                                                                                i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                if (b10 != i32) {
                                                                                                    i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                        if (b10 != i34 && b10 != privacySettingsActivity.H) {
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

    @Override // v4.g0
    public final int b() {
        return this.d.O;
    }

    @Override // v4.g0
    public final int d(int i7) {
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
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i7 == privacySettingsActivity.G) {
            return 0;
        }
        i10 = privacySettingsActivity.lastSeenRow;
        if (i7 == i10) {
            return 0;
        }
        i11 = privacySettingsActivity.phoneNumberRow;
        if (i7 == i11) {
            return 0;
        }
        i12 = privacySettingsActivity.deleteAccountRow;
        if (i7 == i12) {
            return 0;
        }
        i13 = privacySettingsActivity.webSessionsRow;
        if (i7 == i13 || i7 == privacySettingsActivity.n) {
            return 0;
        }
        i14 = privacySettingsActivity.paymentsClearRow;
        if (i7 == i14) {
            return 0;
        }
        i15 = privacySettingsActivity.secretMapRow;
        if (i7 == i15) {
            return 0;
        }
        i16 = privacySettingsActivity.contactsDeleteRow;
        if (i7 == i16 || i7 == privacySettingsActivity.H) {
            return 0;
        }
        if (i7 == privacySettingsActivity.h || i7 == privacySettingsActivity.E || i7 == privacySettingsActivity.r || i7 == privacySettingsActivity.w || i7 == privacySettingsActivity.N || i7 == privacySettingsActivity.I || i7 == privacySettingsActivity.L || i7 == privacySettingsActivity.y) {
            return 1;
        }
        if (i7 == 0 || i7 == privacySettingsActivity.D || i7 == privacySettingsActivity.f || i7 == privacySettingsActivity.M || i7 == privacySettingsActivity.F || i7 == privacySettingsActivity.K || i7 == privacySettingsActivity.x) {
            return 2;
        }
        i17 = privacySettingsActivity.secretWebpageRow;
        if (i7 == i17) {
            return 3;
        }
        i18 = privacySettingsActivity.contactsSyncRow;
        if (i7 == i18) {
            return 3;
        }
        i19 = privacySettingsActivity.contactsSuggestRow;
        if (i7 == i19) {
            return 3;
        }
        i20 = privacySettingsActivity.newChatsRow;
        if (i7 == i20) {
            return 3;
        }
        if (i7 == privacySettingsActivity.J) {
            return 4;
        }
        i21 = privacySettingsActivity.autoDeleteMesages;
        if (i7 == i21 || i7 == privacySettingsActivity.s) {
            return 5;
        }
        i22 = privacySettingsActivity.emailLoginRow;
        if (i7 == i22) {
            return 5;
        }
        i23 = privacySettingsActivity.passwordRow;
        if (i7 == i23) {
            return 5;
        }
        i24 = privacySettingsActivity.passkeysRow;
        if (i7 == i24) {
            return 5;
        }
        i25 = privacySettingsActivity.passcodeRow;
        if (i7 == i25) {
            return 5;
        }
        i26 = privacySettingsActivity.blockedRow;
        return i7 == i26 ? 5 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
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
        boolean z9;
        int i26;
        String M0;
        boolean z10;
        int i27;
        String C0;
        String C02;
        boolean z11;
        String C03;
        String C04;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        String str;
        String format;
        String M02;
        String str2;
        String M03;
        int i38;
        String str3;
        boolean z12;
        String str4;
        String format2;
        String str5;
        String c02;
        int i39 = d1Var.f;
        View view = d1Var.a;
        String str6 = null;
        boolean z13 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i39 == 0) {
            int i40 = 16;
            boolean z14 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i7;
            view.setTag(Integer.valueOf(i7));
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            w9Var.setBetterLayout(true);
            i10 = privacySettingsActivity.webSessionsRow;
            if (i7 == i10) {
                w9Var.b(org.telegram.messenger.id.M0(2131742914, "WebSessionsTitle"), false);
            } else {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i7 == i11) {
                    if (privacySettingsActivity.getContactsController().t(6)) {
                        z9 = true;
                        i40 = 30;
                    } else {
                        str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 6);
                        z9 = false;
                    }
                    w9Var.c(org.telegram.messenger.id.M0(2131746791, "PrivacyPhone"), str6, false, true);
                } else {
                    i12 = privacySettingsActivity.lastSeenRow;
                    if (i7 == i12) {
                        if (privacySettingsActivity.getContactsController().t(0)) {
                            z9 = true;
                            i40 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 0);
                            z9 = false;
                        }
                        w9Var.c(org.telegram.messenger.id.M0(2131746816, "PrivacyLastSeen"), str6, false, true);
                    } else {
                        if (i7 == privacySettingsActivity.n) {
                            if (privacySettingsActivity.getContactsController().t(1)) {
                                C04 = null;
                                z11 = true;
                                i40 = 30;
                            } else {
                                C04 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 1);
                                z11 = false;
                            }
                            w9Var.c(org.telegram.messenger.id.M0(2131746818, null), C04, false, false);
                        } else {
                            i13 = privacySettingsActivity.callsRow;
                            if (i7 == i13) {
                                if (privacySettingsActivity.getContactsController().t(2)) {
                                    z9 = true;
                                    i40 = 30;
                                } else {
                                    str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 2);
                                    z9 = false;
                                }
                                w9Var.c(org.telegram.messenger.id.M0(2131752596, "Calls"), str6, false, true);
                            } else {
                                i14 = privacySettingsActivity.profilePhotoRow;
                                if (i7 == i14) {
                                    if (privacySettingsActivity.getContactsController().t(4)) {
                                        z9 = true;
                                        i40 = 30;
                                    } else {
                                        str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 4);
                                        z9 = false;
                                    }
                                    w9Var.c(org.telegram.messenger.id.M0(2131746778, "PrivacyProfilePhoto"), str6, false, true);
                                } else {
                                    i15 = privacySettingsActivity.bioRow;
                                    if (i7 == i15) {
                                        if (privacySettingsActivity.getContactsController().t(9)) {
                                            z9 = true;
                                            i40 = 30;
                                        } else {
                                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 9);
                                            z9 = false;
                                        }
                                        w9Var.c(org.telegram.messenger.id.M0(2131746868, "PrivacyBio"), str6, false, true);
                                    } else {
                                        i16 = privacySettingsActivity.musicRow;
                                        if (i7 == i16) {
                                            if (privacySettingsActivity.getContactsController().t(14)) {
                                                C03 = null;
                                                z11 = true;
                                                i40 = 30;
                                            } else {
                                                C03 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 14);
                                                z11 = false;
                                            }
                                            w9Var.c(org.telegram.messenger.id.M0(2131746805, null), C03, false, true);
                                        } else {
                                            i17 = privacySettingsActivity.birthdayRow;
                                            if (i7 == i17) {
                                                if (privacySettingsActivity.getContactsController().t(11)) {
                                                    C02 = null;
                                                    z11 = true;
                                                    i40 = 30;
                                                } else {
                                                    C02 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 11);
                                                    z11 = false;
                                                }
                                                w9Var.c(org.telegram.messenger.id.M0(2131746861, null), C02, false, true);
                                            } else {
                                                i18 = privacySettingsActivity.giftsRow;
                                                if (i7 == i18) {
                                                    if (privacySettingsActivity.getContactsController().t(12)) {
                                                        C0 = null;
                                                        z10 = true;
                                                        i40 = 30;
                                                    } else {
                                                        C0 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 12);
                                                        z10 = false;
                                                    }
                                                    w9Var.c(org.telegram.messenger.id.M0(2131746830, null), C0, false, true);
                                                } else {
                                                    i19 = privacySettingsActivity.forwardsRow;
                                                    if (i7 == i19) {
                                                        if (privacySettingsActivity.getContactsController().t(5)) {
                                                            z9 = true;
                                                            i40 = 30;
                                                        } else {
                                                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 5);
                                                            z9 = false;
                                                        }
                                                        w9Var.c(org.telegram.messenger.id.M0(2131746838, "PrivacyForwards"), str6, false, true);
                                                    } else {
                                                        i20 = privacySettingsActivity.voicesRow;
                                                        int i41 = 2131747754;
                                                        if (i7 == i20) {
                                                            if (privacySettingsActivity.getContactsController().t(8)) {
                                                                M0 = null;
                                                                z10 = true;
                                                                i40 = 30;
                                                            } else {
                                                                M0 = !privacySettingsActivity.getUserConfig().q() ? org.telegram.messenger.id.M0(2131747754, null) : PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 8);
                                                                z10 = false;
                                                            }
                                                            SpannableStringBuilder z02 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.id.M0(2131746759, null));
                                                            i27 = privacySettingsActivity.noncontactsRow;
                                                            w9Var.c(z02, M0, false, i27 != -1);
                                                            org.telegram.ui.ActionBar.r6.t(w9Var.getValueImageView(), org.telegram.ui.ActionBar.k6.m6, null, PorterDuff.Mode.MULTIPLY);
                                                        } else {
                                                            i21 = privacySettingsActivity.noncontactsRow;
                                                            if (i7 == i21) {
                                                                if (privacySettingsActivity.Y) {
                                                                    i41 = 2131751779;
                                                                } else if (privacySettingsActivity.X) {
                                                                    i41 = 2131751778;
                                                                }
                                                                String M04 = org.telegram.messenger.id.M0(i41, null);
                                                                CharSequence z03 = (!privacySettingsActivity.getMessagesController().J5 || privacySettingsActivity.getMessagesController().L6) ? PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.id.M0(2131746811, null)) : org.telegram.messenger.id.M0(2131746811, null);
                                                                i26 = privacySettingsActivity.musicRow;
                                                                w9Var.c(z03, M04, false, i26 != -1);
                                                            } else if (i7 == privacySettingsActivity.G) {
                                                                w9Var.b(org.telegram.messenger.id.M0(2131744240, "TelegramPassport"), true);
                                                            } else {
                                                                i22 = privacySettingsActivity.deleteAccountRow;
                                                                if (i7 == i22) {
                                                                    if (privacySettingsActivity.getContactsController().G != 2) {
                                                                        z9 = true;
                                                                    } else {
                                                                        int i42 = privacySettingsActivity.getContactsController().H;
                                                                        str6 = i42 <= 182 ? org.telegram.messenger.id.G(i42 / 30, "Months", new Object[0]) : i42 == 365 ? org.telegram.messenger.id.G(12, "Months", new Object[0]) : i42 == 548 ? org.telegram.messenger.id.G(18, "Months", new Object[0]) : i42 == 730 ? org.telegram.messenger.id.G(24, "Months", new Object[0]) : i42 > 30 ? org.telegram.messenger.id.G((int) Math.round(i42 / 30.0d), "Months", new Object[0]) : org.telegram.messenger.id.G(i42, "Days", new Object[0]);
                                                                        z9 = false;
                                                                    }
                                                                    w9Var.c(org.telegram.messenger.id.M0(2131751596, "DeleteAccountIfAwayFor3"), str6, privacySettingsActivity.Q, false);
                                                                    privacySettingsActivity.Q = false;
                                                                } else {
                                                                    i23 = privacySettingsActivity.paymentsClearRow;
                                                                    if (i7 == i23) {
                                                                        w9Var.b(org.telegram.messenger.id.M0(2131746798, "PrivacyPaymentsClear"), true);
                                                                    } else if (i7 == privacySettingsActivity.H) {
                                                                        w9Var.b(org.telegram.messenger.id.M0(2131746863, null), true);
                                                                    } else {
                                                                        i24 = privacySettingsActivity.secretMapRow;
                                                                        if (i7 == i24) {
                                                                            int i43 = org.telegram.messenger.iz.o0;
                                                                            w9Var.c(org.telegram.messenger.id.M0(2131748690, "MapPreviewProvider"), i43 != 0 ? i43 != 1 ? i43 != 2 ? org.telegram.messenger.id.M0(2131748685, "MapPreviewProviderYandex") : org.telegram.messenger.id.M0(2131748688, "MapPreviewProviderNobody") : org.telegram.messenger.id.M0(2131748689, "MapPreviewProviderGoogle") : org.telegram.messenger.id.M0(2131748687, "MapPreviewProviderTelegram"), privacySettingsActivity.R, true);
                                                                            privacySettingsActivity.R = false;
                                                                        } else {
                                                                            i25 = privacySettingsActivity.contactsDeleteRow;
                                                                            if (i7 == i25) {
                                                                                w9Var.b(org.telegram.messenger.id.M0(2131744299, "SyncContactsDelete"), true);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z13 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z13 = z11;
                    }
                }
                z13 = z9;
            }
            w9Var.r = z13;
            w9Var.D = i40;
            if (z14) {
                w9Var.E = true;
            } else {
                w9Var.y = z13 ? 1.0f : 0.0f;
            }
            w9Var.invalidate();
            return;
        }
        if (i39 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == privacySettingsActivity.E) {
                z8Var.setText(org.telegram.messenger.id.M0(2131751598, "DeleteAccountHelp"));
                return;
            }
            if (i7 == privacySettingsActivity.r) {
                z8Var.setText(org.telegram.messenger.id.M0(2131749382, "GroupsAndChannelsHelp"));
                return;
            }
            if (i7 == privacySettingsActivity.w) {
                z8Var.setText(org.telegram.messenger.id.M0(2131745555, "SessionsSettingsInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.N) {
                z8Var.setText(org.telegram.messenger.id.M0(2131745686, "SecretWebPageInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.I) {
                z8Var.setText(org.telegram.messenger.id.M0(2131746850, "PrivacyBotsInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.h) {
                z8Var.setText(org.telegram.messenger.id.M0(2131746817, null));
                return;
            } else if (i7 == privacySettingsActivity.L) {
                z8Var.setText(org.telegram.messenger.id.M0(2131744413, "SuggestContactsInfo"));
                return;
            } else {
                if (i7 == privacySettingsActivity.y) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131754170, "ArchiveAndMuteInfo"));
                    return;
                }
                return;
            }
        }
        if (i39 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == privacySettingsActivity.f) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746770, "PrivacyTitle"));
                return;
            }
            if (i7 == 0) {
                n4Var.setText(org.telegram.messenger.id.M0(2131745685, "SecurityTitle"));
                return;
            }
            if (i7 == privacySettingsActivity.D) {
                n4Var.setText(org.telegram.messenger.id.M0(2131751519, "DeleteMyAccount"));
                return;
            }
            if (i7 == privacySettingsActivity.M) {
                n4Var.setText(org.telegram.messenger.id.M0(2131745698, "SecretChat"));
                return;
            }
            if (i7 == privacySettingsActivity.F) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746851, "PrivacyBots"));
                return;
            } else if (i7 == privacySettingsActivity.K) {
                n4Var.setText(org.telegram.messenger.id.M0(2131751780, "Contacts"));
                return;
            } else {
                if (i7 == privacySettingsActivity.x) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131748286, "NewChatsFromNonContacts"));
                    return;
                }
                return;
            }
        }
        if (i39 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            i28 = privacySettingsActivity.secretWebpageRow;
            if (i7 == i28) {
                r8Var.f(org.telegram.messenger.id.M0(2131745687, "SecretWebPage"), privacySettingsActivity.getMessagesController().G2 == 1, false);
                return;
            }
            i29 = privacySettingsActivity.contactsSyncRow;
            if (i7 == i29) {
                r8Var.f(org.telegram.messenger.id.M0(2131744301, "SyncContacts"), privacySettingsActivity.T, true);
                return;
            }
            i30 = privacySettingsActivity.contactsSuggestRow;
            if (i7 == i30) {
                r8Var.f(org.telegram.messenger.id.M0(2131744415, "SuggestContacts"), privacySettingsActivity.V, false);
                return;
            }
            i31 = privacySettingsActivity.newChatsRow;
            if (i7 == i31) {
                r8Var.f(org.telegram.messenger.id.M0(2131754171, "ArchiveAndMute"), privacySettingsActivity.W, false);
                return;
            }
            return;
        }
        if (i39 != 5) {
            return;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i7;
        view.setTag(Integer.valueOf(i7));
        m8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.j6 j6Var = m8Var.c;
        i32 = privacySettingsActivity.autoDeleteMesages;
        if (i7 == i32) {
            int i44 = privacySettingsActivity.getUserConfig().p0;
            if (i44 == -1) {
                c02 = null;
                z13 = true;
            } else {
                c02 = i44 > 0 ? org.telegram.messenger.id.c0(i44 * 60) : org.telegram.messenger.id.M0(2131747440, "PasswordOff");
            }
            m8Var.u(org.telegram.messenger.id.M0(2131753850, "AutoDeleteMessages"), c02, true, R.drawable.msg2_autodelete, true);
        } else {
            String str7 = "";
            if (i7 == privacySettingsActivity.s) {
                if (privacySettingsActivity.a0.o0() != 0) {
                    format2 = String.format(org.telegram.messenger.id.E0().y, "%d", Integer.valueOf(privacySettingsActivity.a0.o0()));
                } else if (privacySettingsActivity.getMessagesController().a == 0) {
                    str5 = "";
                    z13 = true;
                    privacySettingsActivity.getMessagesController().a = privacySettingsActivity.a0.o0();
                    m8Var.u(org.telegram.messenger.id.M0(2131745554, null), str5, true, R.drawable.msg2_devices, false);
                } else {
                    format2 = String.format(org.telegram.messenger.id.E0().y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().a));
                }
                str5 = format2;
                privacySettingsActivity.getMessagesController().a = privacySettingsActivity.a0.o0();
                m8Var.u(org.telegram.messenger.id.M0(2131745554, null), str5, true, R.drawable.msg2_devices, false);
            } else {
                i33 = privacySettingsActivity.emailLoginRow;
                if (i7 == i33) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password == null) {
                        z12 = true;
                        str4 = str7;
                    } else {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                            uy0Var.a |= 256;
                            uy0Var.b = indexOf;
                            int i45 = lastIndexOf + 1;
                            uy0Var.c = i45;
                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i45, 0);
                        }
                        z12 = false;
                        str4 = valueOf;
                    }
                    m8Var.setPrioritizeTitleOverValue(true);
                    String M05 = org.telegram.messenger.id.M0(2131751203, null);
                    m8Var.x = m8Var.getDefaultImageLeft();
                    m8Var.s = m8Var.c(false);
                    org.telegram.ui.ActionBar.k5 k5Var = m8Var.a;
                    k5Var.l(M05, false);
                    k5Var.i(null);
                    org.telegram.ui.ActionBar.k5 k5Var2 = m8Var.d;
                    k5Var2.setVisibility(0);
                    k5Var2.l(str4, false);
                    j6Var.setVisibility(8);
                    m8Var.h.setVisibility(8);
                    org.telegram.ui.Components.ch0 ch0Var = m8Var.e;
                    ch0Var.setVisibility(0);
                    ch0Var.setTranslationX(0.0f);
                    ch0Var.setTranslationY(0.0f);
                    ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                    ch0Var.setImageResource(R.drawable.msg2_email);
                    m8Var.r = true;
                    m8Var.setWillNotDraw(false);
                    Switch r02 = m8Var.f;
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                    org.telegram.ui.Components.g5 g5Var = m8Var.K;
                    if (g5Var != null) {
                        g5Var.g(null, false);
                    }
                    z13 = z12;
                } else {
                    i34 = privacySettingsActivity.passwordRow;
                    if (i7 == i34) {
                        TL_account.Password password2 = privacySettingsActivity.d;
                        int i46 = R.drawable.menu_2sv;
                        if (password2 == null) {
                            i38 = R.drawable.menu_2sv;
                            str3 = "";
                            z13 = true;
                        } else {
                            if (password2.has_password) {
                                M03 = org.telegram.messenger.id.M0(2131747439, null);
                                i46 = R.drawable.menu_2sv_on;
                            } else {
                                M03 = org.telegram.messenger.id.M0(2131747440, null);
                            }
                            i38 = i46;
                            str3 = M03;
                        }
                        m8Var.u(org.telegram.messenger.id.M0(2131743941, null), str3, true, i38, true);
                    } else {
                        i35 = privacySettingsActivity.passkeysRow;
                        if (i7 == i35) {
                            ArrayList arrayList = privacySettingsActivity.e;
                            if (arrayList == null) {
                                str2 = "";
                                z13 = true;
                            } else {
                                if (arrayList.size() == 1 && j6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < org.telegram.messenger.g0.q.x / 3.0f) {
                                    M02 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                } else if (privacySettingsActivity.e.size() > 0) {
                                    M02 = privacySettingsActivity.e.size() + "";
                                } else {
                                    M02 = org.telegram.messenger.id.M0(2131747440, null);
                                }
                                str2 = M02;
                            }
                            m8Var.u(org.telegram.messenger.id.M0(2131747652, null), str2, true, R.drawable.msg2_permissions, true);
                        } else {
                            i36 = privacySettingsActivity.passcodeRow;
                            if (i7 == i36) {
                                m8Var.u(org.telegram.messenger.id.M0(2131747658, null), org.telegram.messenger.iz.s.length() != 0 ? org.telegram.messenger.id.M0(2131747439, null) : org.telegram.messenger.id.M0(2131747440, null), true, R.drawable.msg2_secret, true);
                            } else {
                                i37 = privacySettingsActivity.blockedRow;
                                if (i7 == i37) {
                                    int i47 = privacySettingsActivity.getMessagesController().H0;
                                    if (i47 == 0) {
                                        format = org.telegram.messenger.id.M0(2131753682, "BlockedEmpty");
                                    } else if (i47 > 0) {
                                        format = String.format(org.telegram.messenger.id.E0().y, "%d", Integer.valueOf(i47));
                                    } else {
                                        str = "";
                                        z13 = true;
                                        m8Var.u(org.telegram.messenger.id.M0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                    }
                                    str = format;
                                    m8Var.u(org.telegram.messenger.id.M0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        m8Var.h(16, z13, z15);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return new org.telegram.ui.Components.xi0(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? new org.telegram.ui.Cells.r8(context) : new org.telegram.ui.Cells.m8(context) : new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.n4(context) : new org.telegram.ui.Cells.z8(context) : new org.telegram.ui.Cells.w9(context));
    }
}
