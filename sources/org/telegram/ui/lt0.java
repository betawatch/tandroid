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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lt0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public lt0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
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
        int b10 = e1Var.b();
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
                                                                            if (b10 == i26 && privacySettingsActivity.getContactsController().H == 2) {
                                                                                return true;
                                                                            }
                                                                            i27 = privacySettingsActivity.newChatsRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                i28 = privacySettingsActivity.emailLoginRow;
                                                                                if (b10 != i28) {
                                                                                    i29 = privacySettingsActivity.paymentsClearRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.secretMapRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.contactsSyncRow;
                                                                                            if (b10 != i31 && b10 != privacySettingsActivity.H) {
                                                                                                i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                if (b10 != i32) {
                                                                                                    i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                        if (b10 != i34 && b10 != privacySettingsActivity.I) {
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

    @Override // v4.h0
    public final int b() {
        return this.d.P;
    }

    @Override // v4.h0
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
        if (i7 == privacySettingsActivity.H) {
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
        if (i7 == i16 || i7 == privacySettingsActivity.I) {
            return 0;
        }
        if (i7 == privacySettingsActivity.h || i7 == privacySettingsActivity.F || i7 == privacySettingsActivity.r || i7 == privacySettingsActivity.w || i7 == privacySettingsActivity.O || i7 == privacySettingsActivity.J || i7 == privacySettingsActivity.M || i7 == privacySettingsActivity.y) {
            return 1;
        }
        if (i7 == 0 || i7 == privacySettingsActivity.E || i7 == privacySettingsActivity.f || i7 == privacySettingsActivity.N || i7 == privacySettingsActivity.G || i7 == privacySettingsActivity.L || i7 == privacySettingsActivity.x) {
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
        if (i7 == privacySettingsActivity.K) {
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
    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
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
        boolean z10;
        int i26;
        String M0;
        boolean z11;
        int i27;
        String C0;
        String C02;
        boolean z12;
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
        boolean z13;
        String str4;
        String format2;
        String str5;
        String c02;
        int i39 = e1Var.f;
        View view = e1Var.a;
        String str6 = null;
        boolean z14 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i39 == 0) {
            int i40 = 16;
            boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i7;
            view.setTag(Integer.valueOf(i7));
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            v9Var.setBetterLayout(true);
            i10 = privacySettingsActivity.webSessionsRow;
            if (i7 == i10) {
                v9Var.b(org.telegram.messenger.hd.M0(2131742911, "WebSessionsTitle"), false);
            } else {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i7 == i11) {
                    if (privacySettingsActivity.getContactsController().t(6)) {
                        z10 = true;
                        i40 = 30;
                    } else {
                        str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 6);
                        z10 = false;
                    }
                    v9Var.c(org.telegram.messenger.hd.M0(2131746790, "PrivacyPhone"), str6, false, true);
                } else {
                    i12 = privacySettingsActivity.lastSeenRow;
                    if (i7 == i12) {
                        if (privacySettingsActivity.getContactsController().t(0)) {
                            z10 = true;
                            i40 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 0);
                            z10 = false;
                        }
                        v9Var.c(org.telegram.messenger.hd.M0(2131746815, "PrivacyLastSeen"), str6, false, true);
                    } else {
                        if (i7 == privacySettingsActivity.n) {
                            if (privacySettingsActivity.getContactsController().t(1)) {
                                C04 = null;
                                z12 = true;
                                i40 = 30;
                            } else {
                                C04 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 1);
                                z12 = false;
                            }
                            v9Var.c(org.telegram.messenger.hd.M0(2131746817, null), C04, false, false);
                        } else {
                            i13 = privacySettingsActivity.callsRow;
                            if (i7 == i13) {
                                if (privacySettingsActivity.getContactsController().t(2)) {
                                    z10 = true;
                                    i40 = 30;
                                } else {
                                    str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 2);
                                    z10 = false;
                                }
                                v9Var.c(org.telegram.messenger.hd.M0(2131752596, "Calls"), str6, false, true);
                            } else {
                                i14 = privacySettingsActivity.profilePhotoRow;
                                if (i7 == i14) {
                                    if (privacySettingsActivity.getContactsController().t(4)) {
                                        z10 = true;
                                        i40 = 30;
                                    } else {
                                        str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 4);
                                        z10 = false;
                                    }
                                    v9Var.c(org.telegram.messenger.hd.M0(2131746777, "PrivacyProfilePhoto"), str6, false, true);
                                } else {
                                    i15 = privacySettingsActivity.bioRow;
                                    if (i7 == i15) {
                                        if (privacySettingsActivity.getContactsController().t(9)) {
                                            z10 = true;
                                            i40 = 30;
                                        } else {
                                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 9);
                                            z10 = false;
                                        }
                                        v9Var.c(org.telegram.messenger.hd.M0(2131746867, "PrivacyBio"), str6, false, true);
                                    } else {
                                        i16 = privacySettingsActivity.musicRow;
                                        if (i7 == i16) {
                                            if (privacySettingsActivity.getContactsController().t(14)) {
                                                C03 = null;
                                                z12 = true;
                                                i40 = 30;
                                            } else {
                                                C03 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 14);
                                                z12 = false;
                                            }
                                            v9Var.c(org.telegram.messenger.hd.M0(2131746804, null), C03, false, true);
                                        } else {
                                            i17 = privacySettingsActivity.birthdayRow;
                                            if (i7 == i17) {
                                                if (privacySettingsActivity.getContactsController().t(11)) {
                                                    C02 = null;
                                                    z12 = true;
                                                    i40 = 30;
                                                } else {
                                                    C02 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 11);
                                                    z12 = false;
                                                }
                                                v9Var.c(org.telegram.messenger.hd.M0(2131746860, null), C02, false, true);
                                            } else {
                                                i18 = privacySettingsActivity.giftsRow;
                                                if (i7 == i18) {
                                                    if (privacySettingsActivity.getContactsController().t(12)) {
                                                        C0 = null;
                                                        z11 = true;
                                                        i40 = 30;
                                                    } else {
                                                        C0 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 12);
                                                        z11 = false;
                                                    }
                                                    v9Var.c(org.telegram.messenger.hd.M0(2131746829, null), C0, false, true);
                                                } else {
                                                    i19 = privacySettingsActivity.forwardsRow;
                                                    if (i7 == i19) {
                                                        if (privacySettingsActivity.getContactsController().t(5)) {
                                                            z10 = true;
                                                            i40 = 30;
                                                        } else {
                                                            str6 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 5);
                                                            z10 = false;
                                                        }
                                                        v9Var.c(org.telegram.messenger.hd.M0(2131746837, "PrivacyForwards"), str6, false, true);
                                                    } else {
                                                        i20 = privacySettingsActivity.voicesRow;
                                                        int i41 = 2131747753;
                                                        if (i7 == i20) {
                                                            if (privacySettingsActivity.getContactsController().t(8)) {
                                                                M0 = null;
                                                                z11 = true;
                                                                i40 = 30;
                                                            } else {
                                                                M0 = !privacySettingsActivity.getUserConfig().q() ? org.telegram.messenger.hd.M0(2131747753, null) : PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 8);
                                                                z11 = false;
                                                            }
                                                            SpannableStringBuilder z02 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.hd.M0(2131746758, null));
                                                            i27 = privacySettingsActivity.noncontactsRow;
                                                            v9Var.c(z02, M0, false, i27 != -1);
                                                            org.telegram.ui.ActionBar.q6.s(v9Var.getValueImageView(), org.telegram.ui.ActionBar.j6.m6, null, PorterDuff.Mode.MULTIPLY);
                                                        } else {
                                                            i21 = privacySettingsActivity.noncontactsRow;
                                                            if (i7 == i21) {
                                                                if (privacySettingsActivity.Z) {
                                                                    i41 = 2131751779;
                                                                } else if (privacySettingsActivity.Y) {
                                                                    i41 = 2131751778;
                                                                }
                                                                String M04 = org.telegram.messenger.hd.M0(i41, null);
                                                                CharSequence z03 = (!privacySettingsActivity.getMessagesController().K5 || privacySettingsActivity.getMessagesController().M6) ? PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.hd.M0(2131746810, null)) : org.telegram.messenger.hd.M0(2131746810, null);
                                                                i26 = privacySettingsActivity.musicRow;
                                                                v9Var.c(z03, M04, false, i26 != -1);
                                                            } else if (i7 == privacySettingsActivity.H) {
                                                                v9Var.b(org.telegram.messenger.hd.M0(2131744237, "TelegramPassport"), true);
                                                            } else {
                                                                i22 = privacySettingsActivity.deleteAccountRow;
                                                                if (i7 == i22) {
                                                                    if (privacySettingsActivity.getContactsController().H != 2) {
                                                                        z10 = true;
                                                                    } else {
                                                                        int i42 = privacySettingsActivity.getContactsController().I;
                                                                        str6 = i42 <= 182 ? org.telegram.messenger.hd.G(i42 / 30, "Months", new Object[0]) : i42 == 365 ? org.telegram.messenger.hd.G(12, "Months", new Object[0]) : i42 == 548 ? org.telegram.messenger.hd.G(18, "Months", new Object[0]) : i42 == 730 ? org.telegram.messenger.hd.G(24, "Months", new Object[0]) : i42 > 30 ? org.telegram.messenger.hd.G((int) Math.round(i42 / 30.0d), "Months", new Object[0]) : org.telegram.messenger.hd.G(i42, "Days", new Object[0]);
                                                                        z10 = false;
                                                                    }
                                                                    v9Var.c(org.telegram.messenger.hd.M0(2131751595, "DeleteAccountIfAwayFor3"), str6, privacySettingsActivity.R, false);
                                                                    privacySettingsActivity.R = false;
                                                                } else {
                                                                    i23 = privacySettingsActivity.paymentsClearRow;
                                                                    if (i7 == i23) {
                                                                        v9Var.b(org.telegram.messenger.hd.M0(2131746797, "PrivacyPaymentsClear"), true);
                                                                    } else if (i7 == privacySettingsActivity.I) {
                                                                        v9Var.b(org.telegram.messenger.hd.M0(2131746862, null), true);
                                                                    } else {
                                                                        i24 = privacySettingsActivity.secretMapRow;
                                                                        if (i7 == i24) {
                                                                            int i43 = org.telegram.messenger.gz.o0;
                                                                            v9Var.c(org.telegram.messenger.hd.M0(2131748689, "MapPreviewProvider"), i43 != 0 ? i43 != 1 ? i43 != 2 ? org.telegram.messenger.hd.M0(2131748684, "MapPreviewProviderYandex") : org.telegram.messenger.hd.M0(2131748687, "MapPreviewProviderNobody") : org.telegram.messenger.hd.M0(2131748688, "MapPreviewProviderGoogle") : org.telegram.messenger.hd.M0(2131748686, "MapPreviewProviderTelegram"), privacySettingsActivity.S, true);
                                                                            privacySettingsActivity.S = false;
                                                                        } else {
                                                                            i25 = privacySettingsActivity.contactsDeleteRow;
                                                                            if (i7 == i25) {
                                                                                v9Var.b(org.telegram.messenger.hd.M0(2131744296, "SyncContactsDelete"), true);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z14 = z11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z14 = z12;
                    }
                }
                z14 = z10;
            }
            v9Var.r = z14;
            v9Var.E = i40;
            if (z15) {
                v9Var.F = true;
            } else {
                v9Var.y = z14 ? 1.0f : 0.0f;
            }
            v9Var.invalidate();
            return;
        }
        if (i39 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == privacySettingsActivity.F) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131751597, "DeleteAccountHelp"));
                return;
            }
            if (i7 == privacySettingsActivity.r) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131749381, "GroupsAndChannelsHelp"));
                return;
            }
            if (i7 == privacySettingsActivity.w) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131745552, "SessionsSettingsInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.O) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131745683, "SecretWebPageInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.J) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131746849, "PrivacyBotsInfo"));
                return;
            }
            if (i7 == privacySettingsActivity.h) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131746816, null));
                return;
            } else if (i7 == privacySettingsActivity.M) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131744410, "SuggestContactsInfo"));
                return;
            } else {
                if (i7 == privacySettingsActivity.y) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131754170, "ArchiveAndMuteInfo"));
                    return;
                }
                return;
            }
        }
        if (i39 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == privacySettingsActivity.f) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746769, "PrivacyTitle"));
                return;
            }
            if (i7 == 0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131745682, "SecurityTitle"));
                return;
            }
            if (i7 == privacySettingsActivity.E) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131751518, "DeleteMyAccount"));
                return;
            }
            if (i7 == privacySettingsActivity.N) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131745695, "SecretChat"));
                return;
            }
            if (i7 == privacySettingsActivity.G) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746850, "PrivacyBots"));
                return;
            } else if (i7 == privacySettingsActivity.L) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131751780, "Contacts"));
                return;
            } else {
                if (i7 == privacySettingsActivity.x) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131748285, "NewChatsFromNonContacts"));
                    return;
                }
                return;
            }
        }
        if (i39 == 3) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i28 = privacySettingsActivity.secretWebpageRow;
            if (i7 == i28) {
                q8Var.f(org.telegram.messenger.hd.M0(2131745684, "SecretWebPage"), privacySettingsActivity.getMessagesController().H2 == 1, false);
                return;
            }
            i29 = privacySettingsActivity.contactsSyncRow;
            if (i7 == i29) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744298, "SyncContacts"), privacySettingsActivity.U, true);
                return;
            }
            i30 = privacySettingsActivity.contactsSuggestRow;
            if (i7 == i30) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744412, "SuggestContacts"), privacySettingsActivity.W, false);
                return;
            }
            i31 = privacySettingsActivity.newChatsRow;
            if (i7 == i31) {
                q8Var.f(org.telegram.messenger.hd.M0(2131754171, "ArchiveAndMute"), privacySettingsActivity.X, false);
                return;
            }
            return;
        }
        if (i39 != 5) {
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        boolean z16 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i7;
        view.setTag(Integer.valueOf(i7));
        l8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.h6 h6Var = l8Var.c;
        i32 = privacySettingsActivity.autoDeleteMesages;
        if (i7 == i32) {
            int i44 = privacySettingsActivity.getUserConfig().q0;
            if (i44 == -1) {
                c02 = null;
                z14 = true;
            } else {
                c02 = i44 > 0 ? org.telegram.messenger.hd.c0(i44 * 60) : org.telegram.messenger.hd.M0(2131747439, "PasswordOff");
            }
            l8Var.u(org.telegram.messenger.hd.M0(2131753850, "AutoDeleteMessages"), c02, true, R.drawable.msg2_autodelete, true);
        } else {
            String str7 = "";
            if (i7 == privacySettingsActivity.s) {
                if (privacySettingsActivity.b0.o0() != 0) {
                    format2 = String.format(org.telegram.messenger.hd.E0().y, "%d", Integer.valueOf(privacySettingsActivity.b0.o0()));
                } else if (privacySettingsActivity.getMessagesController().a == 0) {
                    str5 = "";
                    z14 = true;
                    privacySettingsActivity.getMessagesController().a = privacySettingsActivity.b0.o0();
                    l8Var.u(org.telegram.messenger.hd.M0(2131745551, null), str5, true, R.drawable.msg2_devices, false);
                } else {
                    format2 = String.format(org.telegram.messenger.hd.E0().y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().a));
                }
                str5 = format2;
                privacySettingsActivity.getMessagesController().a = privacySettingsActivity.b0.o0();
                l8Var.u(org.telegram.messenger.hd.M0(2131745551, null), str5, true, R.drawable.msg2_devices, false);
            } else {
                i33 = privacySettingsActivity.emailLoginRow;
                if (i7 == i33) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password == null) {
                        z13 = true;
                        str4 = str7;
                    } else {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0();
                            wy0Var.a |= 256;
                            wy0Var.b = indexOf;
                            int i45 = lastIndexOf + 1;
                            wy0Var.c = i45;
                            valueOf.setSpan(new org.telegram.ui.Components.xy0(wy0Var, 0), indexOf, i45, 0);
                        }
                        z13 = false;
                        str4 = valueOf;
                    }
                    l8Var.setPrioritizeTitleOverValue(true);
                    String M05 = org.telegram.messenger.hd.M0(2131751202, null);
                    l8Var.x = l8Var.getDefaultImageLeft();
                    l8Var.s = l8Var.c(false);
                    org.telegram.ui.ActionBar.j5 j5Var = l8Var.a;
                    j5Var.l(M05, false);
                    j5Var.i(null);
                    org.telegram.ui.ActionBar.j5 j5Var2 = l8Var.d;
                    j5Var2.setVisibility(0);
                    j5Var2.l(str4, false);
                    h6Var.setVisibility(8);
                    l8Var.h.setVisibility(8);
                    org.telegram.ui.Components.fh0 fh0Var = l8Var.e;
                    fh0Var.setVisibility(0);
                    fh0Var.setTranslationX(0.0f);
                    fh0Var.setTranslationY(0.0f);
                    fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                    fh0Var.setImageResource(R.drawable.msg2_email);
                    l8Var.r = true;
                    l8Var.setWillNotDraw(false);
                    Switch r02 = l8Var.f;
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                    org.telegram.ui.Components.e5 e5Var = l8Var.L;
                    if (e5Var != null) {
                        e5Var.g(null, false);
                    }
                    z14 = z13;
                } else {
                    i34 = privacySettingsActivity.passwordRow;
                    if (i7 == i34) {
                        TL_account.Password password2 = privacySettingsActivity.d;
                        int i46 = R.drawable.menu_2sv;
                        if (password2 == null) {
                            i38 = R.drawable.menu_2sv;
                            str3 = "";
                            z14 = true;
                        } else {
                            if (password2.has_password) {
                                M03 = org.telegram.messenger.hd.M0(2131747438, null);
                                i46 = R.drawable.menu_2sv_on;
                            } else {
                                M03 = org.telegram.messenger.hd.M0(2131747439, null);
                            }
                            i38 = i46;
                            str3 = M03;
                        }
                        l8Var.u(org.telegram.messenger.hd.M0(2131743938, null), str3, true, i38, true);
                    } else {
                        i35 = privacySettingsActivity.passkeysRow;
                        if (i7 == i35) {
                            ArrayList arrayList = privacySettingsActivity.e;
                            if (arrayList == null) {
                                str2 = "";
                                z14 = true;
                            } else {
                                if (arrayList.size() == 1 && h6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < org.telegram.messenger.g0.q.x / 3.0f) {
                                    M02 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                } else if (privacySettingsActivity.e.size() > 0) {
                                    M02 = privacySettingsActivity.e.size() + "";
                                } else {
                                    M02 = org.telegram.messenger.hd.M0(2131747439, null);
                                }
                                str2 = M02;
                            }
                            l8Var.u(org.telegram.messenger.hd.M0(2131747651, null), str2, true, R.drawable.msg2_permissions, true);
                        } else {
                            i36 = privacySettingsActivity.passcodeRow;
                            if (i7 == i36) {
                                l8Var.u(org.telegram.messenger.hd.M0(2131747657, null), org.telegram.messenger.gz.s.length() != 0 ? org.telegram.messenger.hd.M0(2131747438, null) : org.telegram.messenger.hd.M0(2131747439, null), true, R.drawable.msg2_secret, true);
                            } else {
                                i37 = privacySettingsActivity.blockedRow;
                                if (i7 == i37) {
                                    int i47 = privacySettingsActivity.getMessagesController().I0;
                                    if (i47 == 0) {
                                        format = org.telegram.messenger.hd.M0(2131753682, "BlockedEmpty");
                                    } else if (i47 > 0) {
                                        format = String.format(org.telegram.messenger.hd.E0().y, "%d", Integer.valueOf(i47));
                                    } else {
                                        str = "";
                                        z14 = true;
                                        l8Var.u(org.telegram.messenger.hd.M0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                    }
                                    str = format;
                                    l8Var.u(org.telegram.messenger.hd.M0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        l8Var.h(16, z14, z16);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return new org.telegram.ui.Components.cj0(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? new org.telegram.ui.Cells.q8(context) : new org.telegram.ui.Cells.l8(context) : new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null) : new org.telegram.ui.Cells.n4(context) : new org.telegram.ui.Cells.y8(context) : new org.telegram.ui.Cells.v9(context));
    }
}
