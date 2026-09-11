package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class dy0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public dy0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
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
        int i35;
        int b10 = c1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
                                i16 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i16 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                                    i17 = privacySettingsActivity.callsRow;
                                    if (b10 != i17 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                        i18 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i18 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                            i19 = privacySettingsActivity.bioRow;
                                            if (b10 != i19 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                                i20 = privacySettingsActivity.musicRow;
                                                if (b10 != i20 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                                    i21 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i21 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                        i22 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i22 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                            i23 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i23 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                                i24 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i24 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                                                                    i25 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i25 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                                        i26 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i26) {
                                                                            i27 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                                i28 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i28 || privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) {
                                                                                    i29 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i31) {
                                                                                                i32 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i32 && b10 != privacySettingsActivity.G) {
                                                                                                    i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i34) {
                                                                                                            i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i35 && b10 != privacySettingsActivity.H) {
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
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.O;
    }

    @Override // s4.h0
    public final int j(int i10) {
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
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i10 == privacySettingsActivity.G) {
            return 0;
        }
        i11 = privacySettingsActivity.lastSeenRow;
        if (i10 == i11) {
            return 0;
        }
        i12 = privacySettingsActivity.phoneNumberRow;
        if (i10 == i12) {
            return 0;
        }
        i13 = privacySettingsActivity.deleteAccountRow;
        if (i10 == i13) {
            return 0;
        }
        i14 = privacySettingsActivity.webSessionsRow;
        if (i10 == i14 || i10 == privacySettingsActivity.n) {
            return 0;
        }
        i15 = privacySettingsActivity.paymentsClearRow;
        if (i10 == i15) {
            return 0;
        }
        i16 = privacySettingsActivity.secretMapRow;
        if (i10 == i16) {
            return 0;
        }
        i17 = privacySettingsActivity.contactsDeleteRow;
        if (i10 == i17 || i10 == privacySettingsActivity.H) {
            return 0;
        }
        if (i10 == privacySettingsActivity.h || i10 == privacySettingsActivity.E || i10 == privacySettingsActivity.r || i10 == privacySettingsActivity.v || i10 == privacySettingsActivity.N || i10 == privacySettingsActivity.I || i10 == privacySettingsActivity.L || i10 == privacySettingsActivity.x) {
            return 1;
        }
        if (i10 == 0 || i10 == privacySettingsActivity.y || i10 == privacySettingsActivity.f || i10 == privacySettingsActivity.M || i10 == privacySettingsActivity.F || i10 == privacySettingsActivity.K || i10 == privacySettingsActivity.w) {
            return 2;
        }
        i18 = privacySettingsActivity.secretWebpageRow;
        if (i10 == i18) {
            return 3;
        }
        i19 = privacySettingsActivity.contactsSyncRow;
        if (i10 == i19) {
            return 3;
        }
        i20 = privacySettingsActivity.contactsSuggestRow;
        if (i10 == i20) {
            return 3;
        }
        i21 = privacySettingsActivity.newChatsRow;
        if (i10 == i21) {
            return 3;
        }
        if (i10 == privacySettingsActivity.J) {
            return 4;
        }
        i22 = privacySettingsActivity.autoDeleteMesages;
        if (i10 == i22 || i10 == privacySettingsActivity.s) {
            return 5;
        }
        i23 = privacySettingsActivity.emailLoginRow;
        if (i10 == i23) {
            return 5;
        }
        i24 = privacySettingsActivity.passwordRow;
        if (i10 == i24) {
            return 5;
        }
        i25 = privacySettingsActivity.passkeysRow;
        if (i10 == i25) {
            return 5;
        }
        i26 = privacySettingsActivity.passcodeRow;
        if (i10 == i26) {
            return 5;
        }
        i27 = privacySettingsActivity.blockedRow;
        return i10 == i27 ? 5 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
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
        boolean z10;
        int i27;
        String string;
        boolean z11;
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
        int i38;
        String str;
        String format;
        String string2;
        int i39;
        String string3;
        String str2;
        String string4;
        int i40;
        String str3;
        boolean z12;
        String str4;
        String format2;
        String str5;
        String formatTTLString;
        int i41 = c1Var.f;
        View view = c1Var.a;
        int i42 = 16;
        String str6 = null;
        boolean z13 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i41 == 0) {
            boolean z14 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
            view.setTag(Integer.valueOf(i10));
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            eaVar.setBetterLayout(true);
            i11 = privacySettingsActivity.webSessionsRow;
            if (i10 == i11) {
                eaVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
            } else {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 == i12) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                        z10 = true;
                        i42 = 30;
                    } else {
                        str6 = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    eaVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str6, false, true);
                } else {
                    i13 = privacySettingsActivity.lastSeenRow;
                    if (i10 == i13) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                            z10 = true;
                            i42 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.x0(0, privacySettingsActivity.getAccountInstance());
                            z10 = false;
                        }
                        eaVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str6, false, true);
                    } else if (i10 == privacySettingsActivity.n) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                            z10 = true;
                            i42 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                            z10 = false;
                        }
                        eaVar.c(LocaleController.getString(R.string.PrivacyInvites), str6, false, false);
                    } else {
                        i14 = privacySettingsActivity.callsRow;
                        if (i10 == i14) {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                z10 = true;
                                i42 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                                z10 = false;
                            }
                            eaVar.c(LocaleController.getString("Calls", R.string.Calls), str6, false, true);
                        } else {
                            i15 = privacySettingsActivity.profilePhotoRow;
                            if (i10 == i15) {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                    z10 = true;
                                    i42 = 30;
                                } else {
                                    str6 = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                                    z10 = false;
                                }
                                eaVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str6, false, true);
                            } else {
                                i16 = privacySettingsActivity.bioRow;
                                if (i10 == i16) {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                        z10 = true;
                                        i42 = 30;
                                    } else {
                                        str6 = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                                        z10 = false;
                                    }
                                    eaVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str6, false, true);
                                } else {
                                    i17 = privacySettingsActivity.musicRow;
                                    if (i10 == i17) {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                            z10 = true;
                                            i42 = 30;
                                        } else {
                                            str6 = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                                            z10 = false;
                                        }
                                        eaVar.c(LocaleController.getString(R.string.PrivacyMusic), str6, false, true);
                                    } else {
                                        i18 = privacySettingsActivity.birthdayRow;
                                        if (i10 == i18) {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                z10 = true;
                                                i42 = 30;
                                            } else {
                                                str6 = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                                                z10 = false;
                                            }
                                            eaVar.c(LocaleController.getString(R.string.PrivacyBirthday), str6, false, true);
                                        } else {
                                            i19 = privacySettingsActivity.giftsRow;
                                            if (i10 == i19) {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                    z10 = true;
                                                    i42 = 30;
                                                } else {
                                                    str6 = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                                                    z10 = false;
                                                }
                                                eaVar.c(LocaleController.getString(R.string.PrivacyGifts), str6, false, true);
                                            } else {
                                                i20 = privacySettingsActivity.forwardsRow;
                                                if (i10 == i20) {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                        z10 = true;
                                                        i42 = 30;
                                                    } else {
                                                        str6 = PrivacySettingsActivity.x0(5, privacySettingsActivity.getAccountInstance());
                                                        z10 = false;
                                                    }
                                                    eaVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str6, false, true);
                                                } else {
                                                    i21 = privacySettingsActivity.voicesRow;
                                                    if (i10 == i21) {
                                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                            string = null;
                                                            z11 = true;
                                                            i42 = 30;
                                                        } else {
                                                            string = !privacySettingsActivity.getUserConfig().isPremium() ? LocaleController.getString(R.string.P2PEverybody) : PrivacySettingsActivity.x0(8, privacySettingsActivity.getAccountInstance());
                                                            z11 = false;
                                                        }
                                                        SpannableStringBuilder u02 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                        i28 = privacySettingsActivity.noncontactsRow;
                                                        eaVar.c(u02, string, false, i28 != -1);
                                                        eaVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m6, false), PorterDuff.Mode.MULTIPLY));
                                                        z13 = z11;
                                                    } else {
                                                        i22 = privacySettingsActivity.noncontactsRow;
                                                        if (i10 == i22) {
                                                            String string5 = LocaleController.getString(privacySettingsActivity.Y ? R.string.ContactsAndFee : privacySettingsActivity.X ? R.string.ContactsAndPremium : R.string.P2PEverybody);
                                                            CharSequence u03 = (!privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium || privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) ? PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages)) : LocaleController.getString(R.string.PrivacyMessages);
                                                            i27 = privacySettingsActivity.musicRow;
                                                            eaVar.c(u03, string5, false, i27 != -1);
                                                        } else if (i10 == privacySettingsActivity.G) {
                                                            eaVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                        } else {
                                                            i23 = privacySettingsActivity.deleteAccountRow;
                                                            if (i10 == i23) {
                                                                if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                    z10 = true;
                                                                } else {
                                                                    int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                                                                    str6 = deleteAccountTTL <= 182 ? LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]) : deleteAccountTTL == 365 ? LocaleController.formatPluralString("Months", 12, new Object[0]) : deleteAccountTTL == 548 ? LocaleController.formatPluralString("Months", 18, new Object[0]) : deleteAccountTTL == 730 ? LocaleController.formatPluralString("Months", 24, new Object[0]) : deleteAccountTTL > 30 ? LocaleController.formatPluralString("Months", (int) Math.round(deleteAccountTTL / 30.0d), new Object[0]) : LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                                                    z10 = false;
                                                                }
                                                                eaVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str6, privacySettingsActivity.Q, false);
                                                                privacySettingsActivity.Q = false;
                                                            } else {
                                                                i24 = privacySettingsActivity.paymentsClearRow;
                                                                if (i10 == i24) {
                                                                    eaVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                                } else if (i10 == privacySettingsActivity.H) {
                                                                    eaVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                                                } else {
                                                                    i25 = privacySettingsActivity.secretMapRow;
                                                                    if (i10 == i25) {
                                                                        int i43 = SharedConfig.mapPreviewType;
                                                                        eaVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), i43 != 0 ? i43 != 1 ? i43 != 2 ? LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex) : LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody) : LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle) : LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram), privacySettingsActivity.R, true);
                                                                        privacySettingsActivity.R = false;
                                                                    } else {
                                                                        i26 = privacySettingsActivity.contactsDeleteRow;
                                                                        if (i10 == i26) {
                                                                            eaVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
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
                z13 = z10;
            }
            eaVar.r = z13;
            eaVar.y = i42;
            if (z14) {
                eaVar.E = true;
            } else {
                eaVar.x = z13 ? 1.0f : 0.0f;
            }
            eaVar.invalidate();
            return;
        }
        if (i41 == 1) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == privacySettingsActivity.E) {
                e9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            }
            if (i10 == privacySettingsActivity.r) {
                e9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            }
            if (i10 == privacySettingsActivity.v) {
                e9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            }
            if (i10 == privacySettingsActivity.N) {
                e9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            }
            if (i10 == privacySettingsActivity.I) {
                e9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            }
            if (i10 == privacySettingsActivity.h) {
                e9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.L) {
                e9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else {
                if (i10 == privacySettingsActivity.x) {
                    e9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                    return;
                }
                return;
            }
        }
        if (i41 == 2) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == privacySettingsActivity.f) {
                l4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                return;
            }
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                return;
            }
            if (i10 == privacySettingsActivity.y) {
                l4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                return;
            }
            if (i10 == privacySettingsActivity.M) {
                l4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                return;
            }
            if (i10 == privacySettingsActivity.F) {
                l4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                return;
            } else if (i10 == privacySettingsActivity.K) {
                l4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                return;
            } else {
                if (i10 == privacySettingsActivity.w) {
                    l4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                }
                return;
            }
        }
        if (i41 == 3) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i29 = privacySettingsActivity.secretWebpageRow;
            if (i10 == i29) {
                w8Var.f(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), privacySettingsActivity.getMessagesController().secretWebpagePreview == 1, false);
                return;
            }
            i30 = privacySettingsActivity.contactsSyncRow;
            if (i10 == i30) {
                w8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.T, true);
                return;
            }
            i31 = privacySettingsActivity.contactsSuggestRow;
            if (i10 == i31) {
                w8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.V, false);
                return;
            }
            i32 = privacySettingsActivity.newChatsRow;
            if (i10 == i32) {
                w8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.W, false);
                return;
            }
            return;
        }
        if (i41 != 5) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
        view.setTag(Integer.valueOf(i10));
        r8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.q6 q6Var = r8Var.c;
        i33 = privacySettingsActivity.autoDeleteMesages;
        if (i10 == i33) {
            int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
            if (globalTTl == -1) {
                formatTTLString = null;
                z13 = true;
            } else {
                formatTTLString = globalTTl > 0 ? LocaleController.formatTTLString(globalTTl * 60) : LocaleController.getString("PasswordOff", R.string.PasswordOff);
            }
            r8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), formatTTLString, true, R.drawable.msg2_autodelete, true);
        } else {
            String str7 = "";
            if (i10 == privacySettingsActivity.s) {
                if (privacySettingsActivity.a0.j0() != 0) {
                    format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.a0.j0()));
                } else if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                    str5 = "";
                    z13 = true;
                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.a0.j0();
                    r8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                } else {
                    format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                }
                str5 = format2;
                privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.a0.j0();
                r8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
            } else {
                i34 = privacySettingsActivity.emailLoginRow;
                if (i10 == i34) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password == null) {
                        z12 = true;
                        str4 = str7;
                    } else {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                            n01Var.a |= 256;
                            n01Var.b = indexOf;
                            int i44 = lastIndexOf + 1;
                            n01Var.c = i44;
                            valueOf.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i44, 0);
                        }
                        z12 = false;
                        str4 = valueOf;
                    }
                    r8Var.setPrioritizeTitleOverValue(true);
                    String string6 = LocaleController.getString(R.string.EmailLogin);
                    int i45 = R.drawable.msg2_email;
                    r8Var.w = 16;
                    r8Var.s = 58;
                    org.telegram.ui.ActionBar.j5 j5Var = r8Var.a;
                    j5Var.l(string6, false);
                    j5Var.i(null);
                    org.telegram.ui.ActionBar.j5 j5Var2 = r8Var.d;
                    j5Var2.setVisibility(0);
                    j5Var2.l(str4, false);
                    q6Var.setVisibility(8);
                    r8Var.h.setVisibility(8);
                    org.telegram.ui.Components.aj0 aj0Var = r8Var.e;
                    aj0Var.setVisibility(0);
                    aj0Var.setTranslationX(0.0f);
                    aj0Var.setTranslationY(0.0f);
                    aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                    aj0Var.setImageResource(i45);
                    r8Var.r = true;
                    r8Var.setWillNotDraw(false);
                    Switch r02 = r8Var.f;
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                    org.telegram.ui.Components.o5 o5Var = r8Var.K;
                    if (o5Var != null) {
                        o5Var.g(null, false);
                    }
                    z13 = z12;
                } else {
                    i35 = privacySettingsActivity.passwordRow;
                    if (i10 == i35) {
                        int i46 = R.drawable.menu_2sv;
                        TL_account.Password password2 = privacySettingsActivity.d;
                        if (password2 == null) {
                            i40 = i46;
                            str3 = "";
                            z13 = true;
                        } else {
                            if (password2.has_password) {
                                i46 = R.drawable.menu_2sv_on;
                                string4 = LocaleController.getString(R.string.PasswordOn);
                            } else {
                                string4 = LocaleController.getString(R.string.PasswordOff);
                            }
                            i40 = i46;
                            str3 = string4;
                        }
                        r8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i40, true);
                    } else {
                        i36 = privacySettingsActivity.passkeysRow;
                        if (i10 == i36) {
                            ArrayList arrayList = privacySettingsActivity.e;
                            if (arrayList == null) {
                                str2 = "";
                                z13 = true;
                            } else {
                                if (arrayList.size() == 1 && q6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                    string3 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                } else if (privacySettingsActivity.e.size() > 0) {
                                    string3 = privacySettingsActivity.e.size() + "";
                                } else {
                                    string3 = LocaleController.getString(R.string.PasswordOff);
                                }
                                str2 = string3;
                            }
                            r8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                        } else {
                            i37 = privacySettingsActivity.passcodeRow;
                            if (i10 == i37) {
                                if (SharedConfig.passcodeHash.length() != 0) {
                                    string2 = LocaleController.getString(R.string.PasswordOn);
                                    i39 = R.drawable.msg2_secret;
                                } else {
                                    string2 = LocaleController.getString(R.string.PasswordOff);
                                    i39 = R.drawable.msg2_secret;
                                }
                                r8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i39, true);
                            } else {
                                i38 = privacySettingsActivity.blockedRow;
                                if (i10 == i38) {
                                    int i47 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                                    if (i47 == 0) {
                                        format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                    } else if (i47 > 0) {
                                        format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i47));
                                    } else {
                                        str = "";
                                        z13 = true;
                                        r8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                    }
                                    str = format;
                                    r8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        r8Var.f(16, z13, z15);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.vk0(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 5 ? new org.telegram.ui.Cells.w8(context) : new org.telegram.ui.Cells.r8(context) : new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null) : new org.telegram.ui.Cells.l4(context) : new org.telegram.ui.Cells.e9(context) : new org.telegram.ui.Cells.ea(context));
    }
}
