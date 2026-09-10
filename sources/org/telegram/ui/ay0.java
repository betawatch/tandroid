package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ay0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public ay0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.b0) {
            i16 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i10 || b10 == privacyControlActivity.Z) {
            return true;
        }
        i11 = privacyControlActivity.photoForRestRow;
        if (b10 == i11) {
            return true;
        }
        i12 = privacyControlActivity.readRow;
        if (b10 == i12) {
            return true;
        }
        i13 = privacyControlActivity.showGiftIconRow;
        if (b10 == i13 || b10 == privacyControlActivity.e0 || b10 == privacyControlActivity.n0 || b10 == privacyControlActivity.o0 || b10 == privacyControlActivity.p0 || b10 == privacyControlActivity.m0 || b10 == privacyControlActivity.l0) {
            return true;
        }
        if (privacyControlActivity.x == 12 && privacyControlActivity.u0()) {
            return false;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (b10 == i14 || b10 == privacyControlActivity.O || b10 == privacyControlActivity.g0) {
            return true;
        }
        i15 = privacyControlActivity.everybodyRow;
        return b10 == i15 || b10 == privacyControlActivity.T || b10 == privacyControlActivity.S;
    }

    public final int E(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (longValue > 0) {
                i10++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i10 += chat.participants_count;
                }
            }
        }
        return i10;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.r0;
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
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 == privacyControlActivity.S || i10 == privacyControlActivity.T || i10 == privacyControlActivity.b0 || i10 == privacyControlActivity.e0) {
            return 0;
        }
        if (i10 == privacyControlActivity.U || i10 == privacyControlActivity.P || i10 == privacyControlActivity.Q || i10 == privacyControlActivity.j0 || i10 == privacyControlActivity.c0 || i10 == privacyControlActivity.Z || i10 == privacyControlActivity.d0 || i10 == privacyControlActivity.f0) {
            return 1;
        }
        i11 = privacyControlActivity.setBirthdayRow;
        if (i10 == i11 || i10 == privacyControlActivity.k0 || i10 == privacyControlActivity.q0) {
            return 1;
        }
        if (i10 == privacyControlActivity.N || i10 == privacyControlActivity.h0 || i10 == privacyControlActivity.R || i10 == privacyControlActivity.a0 || i10 == privacyControlActivity.V) {
            return 2;
        }
        i12 = privacyControlActivity.giftTypesHeaderRow;
        if (i10 == i12) {
            return 2;
        }
        i13 = privacyControlActivity.everybodyRow;
        if (i10 == i13 || i10 == privacyControlActivity.O) {
            return 3;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (i10 == i14 || i10 == privacyControlActivity.g0 || i10 == privacyControlActivity.W || i10 == privacyControlActivity.X) {
            return 3;
        }
        if (i10 == privacyControlActivity.M) {
            return 4;
        }
        if (i10 == privacyControlActivity.Y) {
            return 5;
        }
        i15 = privacyControlActivity.photoForRestRow;
        if (i10 == i15) {
            return 6;
        }
        i16 = privacyControlActivity.currentPhotoForRestRow;
        if (i10 == i16) {
            return 7;
        }
        i17 = privacyControlActivity.readRow;
        if (i10 == i17) {
            return 8;
        }
        i18 = privacyControlActivity.showGiftIconRow;
        if (i10 == i18 || i10 == privacyControlActivity.n0 || i10 == privacyControlActivity.o0 || i10 == privacyControlActivity.p0 || i10 == privacyControlActivity.l0 || i10 == privacyControlActivity.m0) {
            return 8;
        }
        i19 = privacyControlActivity.priceRow;
        if (i10 == i19) {
            return 9;
        }
        return i10 == privacyControlActivity.i0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.E;
        int i23 = privacyControlActivity.x;
        int i24 = c1Var.f;
        View view = c1Var.a;
        int i25 = 9;
        final int i26 = 1;
        r8 = 0;
        int i27 = 0;
        r8 = 0;
        int i28 = 0;
        r8 = 0;
        int i29 = 0;
        r8 = 0;
        int i30 = 0;
        r8 = 0;
        int i31 = 0;
        if (i24 == 0) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            gaVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            if (i10 == privacyControlActivity.S) {
                String formatPluralString = privacyControlActivity.G.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.G), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (privacyControlActivity.y[privacyControlActivity.I == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.G;
                    formatPluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, formatPluralString);
                }
                if (i23 != 10) {
                    int i32 = privacyControlActivity.I;
                    if (zArr[i32] && i32 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.G;
                        formatPluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString);
                    }
                }
                if (i23 == 10) {
                    gaVar.c(LocaleController.getString(R.string.PrivateMessagesExceptions), formatPluralString, false, false);
                } else if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                    gaVar.c(LocaleController.getString(R.string.AlwaysShareWith), formatPluralString, false, privacyControlActivity.T != -1);
                } else {
                    gaVar.c(LocaleController.getString(R.string.AlwaysAllow), formatPluralString, false, privacyControlActivity.T != -1);
                }
                if (i23 == 12) {
                    gaVar.setEnabled(!privacyControlActivity.u0());
                    return;
                }
                return;
            }
            if (i10 != privacyControlActivity.T) {
                if (i10 == privacyControlActivity.b0) {
                    i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                    gaVar.c(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(i11).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.x0(3, privacyControlActivity.getAccountInstance()), false, false);
                    return;
                } else {
                    if (i10 == privacyControlActivity.e0) {
                        gaVar.b(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                        gaVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.j6.n6));
                        return;
                    }
                    return;
                }
            }
            String formatPluralString2 = privacyControlActivity.H.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.H), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
            int i33 = privacyControlActivity.I;
            if (zArr[i33] && i33 == 0) {
                ArrayList arrayList3 = privacyControlActivity.H;
                formatPluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString2);
            }
            if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                gaVar.c(LocaleController.getString(R.string.NeverShareWith), formatPluralString2, false, false);
            } else {
                gaVar.c(LocaleController.getString(R.string.NeverAllow), formatPluralString2, false, false);
            }
            if (i23 == 12) {
                gaVar.setEnabled(!privacyControlActivity.u0());
                return;
            }
            return;
        }
        if (i24 == 1) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == privacyControlActivity.Q) {
                f9Var.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
            } else {
                int i34 = privacyControlActivity.P;
                if (i10 == i34 && i23 == 10) {
                    String string = LocaleController.getString(R.string.PrivacyMessagesInfo);
                    final int i35 = r8 ? 1 : 0;
                    f9Var.setText(AndroidUtilities.replaceSingleTag(string, new Runnable(this) { // from class: org.telegram.ui.xx0
                        public final /* synthetic */ ay0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i35) {
                                case 0:
                                    this.b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    ay0 ay0Var = this.b;
                                    PrivacyControlActivity privacyControlActivity2 = ay0Var.d;
                                    privacyControlActivity2.showDialog(org.telegram.ui.Components.d5.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new yx0(ay0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                    break;
                            }
                        }
                    }));
                } else if (i10 == i34 && i23 == 8) {
                    f9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else {
                    i12 = privacyControlActivity.setBirthdayRow;
                    if (i10 == i12) {
                        f9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) { // from class: org.telegram.ui.xx0
                            public final /* synthetic */ ay0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i26) {
                                    case 0:
                                        this.b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        ay0 ay0Var = this.b;
                                        PrivacyControlActivity privacyControlActivity2 = ay0Var.d;
                                        privacyControlActivity2.showDialog(org.telegram.ui.Components.d5.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new yx0(ay0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i10 == privacyControlActivity.P) {
                        if (i23 == 6) {
                            if (privacyControlActivity.I == 1 && privacyControlActivity.J == 1) {
                                f9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String i36 = org.telegram.ui.Cells.r6.i("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                                SpannableString spannableString = new SpannableString(i36);
                                spannableString.setSpan(new zx0(this, i36), 0, i36.length(), 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                f9Var.setText(spannableStringBuilder);
                            }
                        } else if (i23 == 5) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                        } else if (i23 == 4) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                        } else if (i23 == 9) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                        } else if (i23 == 14) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                        } else if (i23 == 11) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                        } else if (i23 == 12) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                        } else if (i23 == 3) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                        } else if (i23 == 2) {
                            f9Var.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                        } else if (i23 == 1) {
                            f9Var.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                        } else {
                            f9Var.setText(LocaleController.getString(R.string.CustomHelp));
                        }
                    } else if (i10 == privacyControlActivity.U) {
                        if (i23 == 6) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                        } else if (i23 == 5) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                        } else if (i23 == 4) {
                            int i37 = privacyControlActivity.I;
                            if (i37 == 2) {
                                f9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                            } else if (i37 == 0) {
                                f9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                            } else {
                                f9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                            }
                        } else if (i23 == 3) {
                            f9Var.setText(LocaleController.getString(R.string.CustomP2PInfo));
                        } else if (i23 == 9) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                        } else if (i23 == 14) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                        } else if (i23 == 11) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                        } else if (i23 == 2) {
                            f9Var.setText(LocaleController.getString(R.string.CustomCallInfo));
                        } else if (i23 == 1) {
                            f9Var.setText(LocaleController.getString(R.string.CustomShareInfo));
                        } else if (i23 == 12) {
                            f9Var.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                        } else if (i23 == 8) {
                            f9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                        } else if (i23 == 10) {
                            f9Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                        } else {
                            f9Var.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                        }
                    } else if (i10 == privacyControlActivity.Z) {
                        f9Var.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                    } else if (i10 == privacyControlActivity.d0) {
                        f9Var.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                    } else if (i10 == privacyControlActivity.f0) {
                        f9Var.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                    } else if (i10 == privacyControlActivity.j0) {
                        f9Var.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, di.m.G0(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((privacyControlActivity.L * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                    } else if (i10 == privacyControlActivity.k0) {
                        SpannableString spannableString2 = new SpannableString(ImageLoader.AUTOPLAY_FILTER);
                        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_input_gift, 0);
                        uqVar.setScale(0.583f, 0.583f);
                        spannableString2.setSpan(uqVar, 0, 1, 33);
                        f9Var.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                    } else if (i10 == privacyControlActivity.q0) {
                        f9Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                    }
                }
            }
            f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
            return;
        }
        if (i24 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 != privacyControlActivity.N) {
                if (i10 == privacyControlActivity.R) {
                    if (i23 == 10) {
                        m4Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i10 == privacyControlActivity.a0) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i10 == privacyControlActivity.V) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                }
                if (i10 == privacyControlActivity.h0) {
                    m4Var.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                }
                i13 = privacyControlActivity.giftTypesHeaderRow;
                if (i10 == i13) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                    return;
                }
                return;
            }
            if (i23 == 6) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i23 == 5) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (i23 == 4) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (i23 == 9) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (i23 == 14) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (i23 == 3) {
                m4Var.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (i23 == 2) {
                m4Var.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (i23 == 1) {
                m4Var.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (i23 == 8) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (i23 == 10) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (i23 == 11) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
                return;
            } else if (i23 == 12) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
                return;
            } else {
                m4Var.setText(LocaleController.getString(R.string.LastSeenTitle));
                return;
            }
        }
        if (i24 != 3) {
            if (i24 != 8) {
                if (i24 != 9) {
                    return;
                }
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                i22 = privacyControlActivity.priceRow;
                if (i10 == i22) {
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    ul0 ul0Var = new ul0(this, i25);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.c = a2;
                    z7Var.d = 20;
                    z7Var.e = ul0Var;
                    a8Var.d((int) Utilities.clamp(privacyControlActivity.L, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), z7Var, new yx0(this, r8 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setCheckBoxIcon(0);
            i20 = privacyControlActivity.readRow;
            if (i10 == i20) {
                x8Var.f(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.B0, false);
                return;
            }
            i21 = privacyControlActivity.showGiftIconRow;
            if (i10 == i21) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.D0, false);
                return;
            }
            if (i10 == privacyControlActivity.l0) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.F0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.F0) {
                    i27 = R.drawable.permission_locked;
                }
                x8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i10 == privacyControlActivity.m0) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.H0) {
                    i28 = R.drawable.permission_locked;
                }
                x8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i10 == privacyControlActivity.n0) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.J0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.J0) {
                    i29 = R.drawable.permission_locked;
                }
                x8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i10 == privacyControlActivity.o0) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.L0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.L0) {
                    i30 = R.drawable.permission_locked;
                }
                x8Var.setCheckBoxIcon(i30);
                return;
            }
            if (i10 == privacyControlActivity.p0) {
                x8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.N0, false);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.N0) {
                    i31 = R.drawable.permission_locked;
                }
                x8Var.setCheckBoxIcon(i31);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
        l6Var.setRadioIcon(null);
        i14 = privacyControlActivity.everybodyRow;
        if (i10 != i14 && i10 != privacyControlActivity.O) {
            i19 = privacyControlActivity.nobodyRow;
            if (i10 != i19 && i10 != privacyControlActivity.g0) {
                if (i10 == privacyControlActivity.X) {
                    l6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.J == 1, false);
                } else if (i10 == privacyControlActivity.W) {
                    l6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.J == 0, true);
                }
                if (i23 != 12) {
                    l6Var.b(null, !privacyControlActivity.u0());
                    return;
                }
                return;
            }
        }
        i15 = privacyControlActivity.everybodyRow;
        if (i10 == i15) {
            if (i23 == 3) {
                l6Var.c(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.I == 0, true);
            } else {
                l6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.I == 0, true);
            }
        } else if (i10 == privacyControlActivity.O) {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                l6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                String string2 = LocaleController.getString(R.string.P2PContacts);
                boolean z10 = privacyControlActivity.I == 2;
                i18 = privacyControlActivity.nobodyRow;
                l6Var.c(string2, z10, (i18 == -1 && privacyControlActivity.g0 == -1) ? false : true);
            } else if (i23 == 10) {
                String string3 = LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium);
                boolean z11 = privacyControlActivity.I == 2;
                i17 = privacyControlActivity.nobodyRow;
                l6Var.c(string3, z11, (i17 == -1 && privacyControlActivity.g0 == -1) ? false : true);
            } else {
                String string4 = LocaleController.getString(R.string.LastSeenContacts);
                boolean z12 = privacyControlActivity.I == 2;
                i16 = privacyControlActivity.nobodyRow;
                l6Var.c(string4, z12, (i16 == -1 && privacyControlActivity.g0 == -1) ? false : true);
            }
        } else if (i10 == privacyControlActivity.g0) {
            if (i23 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                l6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            l6Var.c(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.I == 3, false);
        } else {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                l6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                l6Var.c(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.I == 1, false);
            } else {
                l6Var.c(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.I == 1, false);
            }
        }
        if (i23 != 12) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setCanDisable(true);
                view = gaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.l6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(privacyControlActivity.getParentActivity());
                privacyControlActivity.u0 = s8Var;
                if (privacyControlActivity.x0 == null) {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.u0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                privacyControlActivity.u0.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                privacyControlActivity.t0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.u0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.u0.e.setAnimation(privacyControlActivity.t0);
                view = privacyControlActivity.u0;
                break;
            case 7:
                privacyControlActivity.v0 = new org.telegram.ui.Components.w9(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = new rs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.x0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.y0;
                    if (photo != null) {
                        org.telegram.ui.Components.w9 w9Var = privacyControlActivity.v0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        w9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.w9 w9Var2 = privacyControlActivity.v0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        w9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.w0.addView(privacyControlActivity.v0, w7.a6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.w0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.w0.getImageView().setVisibility(0);
                privacyControlActivity.w0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                rs rsVar = privacyControlActivity.w0;
                int i13 = org.telegram.ui.ActionBar.j6.p7;
                rsVar.e(i13, i13);
                view = privacyControlActivity.w0;
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x8(context, f6Var);
                break;
            case 9:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.a8(context, f6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                f6Var3 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                bi.d dVar = new bi.d(context, f6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new l60(this, 24));
                frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
