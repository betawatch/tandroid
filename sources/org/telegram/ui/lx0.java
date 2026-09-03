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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lx0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public lx0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = m1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.Y) {
            i16 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i10 || b10 == privacyControlActivity.W) {
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
        if (b10 == i13 || b10 == privacyControlActivity.b0 || b10 == privacyControlActivity.k0 || b10 == privacyControlActivity.l0 || b10 == privacyControlActivity.m0 || b10 == privacyControlActivity.j0 || b10 == privacyControlActivity.i0) {
            return true;
        }
        if (privacyControlActivity.x == 12 && privacyControlActivity.u0()) {
            return false;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (b10 == i14 || b10 == privacyControlActivity.L || b10 == privacyControlActivity.d0) {
            return true;
        }
        i15 = privacyControlActivity.everybodyRow;
        return b10 == i15 || b10 == privacyControlActivity.Q || b10 == privacyControlActivity.P;
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

    @Override // f2.p0
    public final int h() {
        return this.d.o0;
    }

    @Override // f2.p0
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
        if (i10 == privacyControlActivity.P || i10 == privacyControlActivity.Q || i10 == privacyControlActivity.Y || i10 == privacyControlActivity.b0) {
            return 0;
        }
        if (i10 == privacyControlActivity.R || i10 == privacyControlActivity.M || i10 == privacyControlActivity.N || i10 == privacyControlActivity.g0 || i10 == privacyControlActivity.Z || i10 == privacyControlActivity.W || i10 == privacyControlActivity.a0 || i10 == privacyControlActivity.c0) {
            return 1;
        }
        i11 = privacyControlActivity.setBirthdayRow;
        if (i10 == i11 || i10 == privacyControlActivity.h0 || i10 == privacyControlActivity.n0) {
            return 1;
        }
        if (i10 == privacyControlActivity.K || i10 == privacyControlActivity.e0 || i10 == privacyControlActivity.O || i10 == privacyControlActivity.X || i10 == privacyControlActivity.S) {
            return 2;
        }
        i12 = privacyControlActivity.giftTypesHeaderRow;
        if (i10 == i12) {
            return 2;
        }
        i13 = privacyControlActivity.everybodyRow;
        if (i10 == i13 || i10 == privacyControlActivity.L) {
            return 3;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (i10 == i14 || i10 == privacyControlActivity.d0 || i10 == privacyControlActivity.T || i10 == privacyControlActivity.U) {
            return 3;
        }
        if (i10 == privacyControlActivity.J) {
            return 4;
        }
        if (i10 == privacyControlActivity.V) {
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
        if (i10 == i18 || i10 == privacyControlActivity.k0 || i10 == privacyControlActivity.l0 || i10 == privacyControlActivity.m0 || i10 == privacyControlActivity.i0 || i10 == privacyControlActivity.j0) {
            return 8;
        }
        i19 = privacyControlActivity.priceRow;
        if (i10 == i19) {
            return 9;
        }
        return i10 == privacyControlActivity.f0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
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
        boolean[] zArr = privacyControlActivity.B;
        int i23 = privacyControlActivity.x;
        int i24 = m1Var.f;
        View view = m1Var.a;
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
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            aaVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            if (i10 == privacyControlActivity.P) {
                String formatPluralString = privacyControlActivity.D.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.D), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (privacyControlActivity.y[privacyControlActivity.F == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.D;
                    formatPluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, formatPluralString);
                }
                if (i23 != 10) {
                    int i32 = privacyControlActivity.F;
                    if (zArr[i32] && i32 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.D;
                        formatPluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString);
                    }
                }
                if (i23 == 10) {
                    aaVar.c(LocaleController.getString(R.string.PrivateMessagesExceptions), formatPluralString, false, false);
                } else if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                    aaVar.c(LocaleController.getString(R.string.AlwaysShareWith), formatPluralString, false, privacyControlActivity.Q != -1);
                } else {
                    aaVar.c(LocaleController.getString(R.string.AlwaysAllow), formatPluralString, false, privacyControlActivity.Q != -1);
                }
                if (i23 == 12) {
                    aaVar.setEnabled(!privacyControlActivity.u0());
                    return;
                }
                return;
            }
            if (i10 != privacyControlActivity.Q) {
                if (i10 == privacyControlActivity.Y) {
                    i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                    aaVar.c(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(i11).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.x0(3, privacyControlActivity.getAccountInstance()), false, false);
                    return;
                } else {
                    if (i10 == privacyControlActivity.b0) {
                        aaVar.b(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                        aaVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.k6.n6));
                        return;
                    }
                    return;
                }
            }
            String formatPluralString2 = privacyControlActivity.E.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.E), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
            int i33 = privacyControlActivity.F;
            if (zArr[i33] && i33 == 0) {
                ArrayList arrayList3 = privacyControlActivity.E;
                formatPluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString2);
            }
            if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                aaVar.c(LocaleController.getString(R.string.NeverShareWith), formatPluralString2, false, false);
            } else {
                aaVar.c(LocaleController.getString(R.string.NeverAllow), formatPluralString2, false, false);
            }
            if (i23 == 12) {
                aaVar.setEnabled(!privacyControlActivity.u0());
                return;
            }
            return;
        }
        if (i24 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == privacyControlActivity.N) {
                a9Var.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
            } else {
                int i34 = privacyControlActivity.M;
                if (i10 == i34 && i23 == 10) {
                    String string = LocaleController.getString(R.string.PrivacyMessagesInfo);
                    final int i35 = r8 ? 1 : 0;
                    a9Var.setText(AndroidUtilities.replaceSingleTag(string, new Runnable(this) { // from class: org.telegram.ui.ix0
                        public final /* synthetic */ lx0 b;

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
                                    lx0 lx0Var = this.b;
                                    PrivacyControlActivity privacyControlActivity2 = lx0Var.d;
                                    privacyControlActivity2.showDialog(org.telegram.ui.Components.z4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new jx0(lx0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                    break;
                            }
                        }
                    }));
                } else if (i10 == i34 && i23 == 8) {
                    a9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else {
                    i12 = privacyControlActivity.setBirthdayRow;
                    if (i10 == i12) {
                        a9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) { // from class: org.telegram.ui.ix0
                            public final /* synthetic */ lx0 b;

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
                                        lx0 lx0Var = this.b;
                                        PrivacyControlActivity privacyControlActivity2 = lx0Var.d;
                                        privacyControlActivity2.showDialog(org.telegram.ui.Components.z4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new jx0(lx0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i10 == privacyControlActivity.M) {
                        if (i23 == 6) {
                            if (privacyControlActivity.F == 1 && privacyControlActivity.G == 1) {
                                a9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String k10 = yh.k("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                                SpannableString spannableString = new SpannableString(k10);
                                spannableString.setSpan(new kx0(this, k10), 0, k10.length(), 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                a9Var.setText(spannableStringBuilder);
                            }
                        } else if (i23 == 5) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                        } else if (i23 == 4) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                        } else if (i23 == 9) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                        } else if (i23 == 14) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                        } else if (i23 == 11) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                        } else if (i23 == 12) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                        } else if (i23 == 3) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                        } else if (i23 == 2) {
                            a9Var.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                        } else if (i23 == 1) {
                            a9Var.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                        } else {
                            a9Var.setText(LocaleController.getString(R.string.CustomHelp));
                        }
                    } else if (i10 == privacyControlActivity.R) {
                        if (i23 == 6) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                        } else if (i23 == 5) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                        } else if (i23 == 4) {
                            int i36 = privacyControlActivity.F;
                            if (i36 == 2) {
                                a9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                            } else if (i36 == 0) {
                                a9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                            } else {
                                a9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                            }
                        } else if (i23 == 3) {
                            a9Var.setText(LocaleController.getString(R.string.CustomP2PInfo));
                        } else if (i23 == 9) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                        } else if (i23 == 14) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                        } else if (i23 == 11) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                        } else if (i23 == 2) {
                            a9Var.setText(LocaleController.getString(R.string.CustomCallInfo));
                        } else if (i23 == 1) {
                            a9Var.setText(LocaleController.getString(R.string.CustomShareInfo));
                        } else if (i23 == 12) {
                            a9Var.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                        } else if (i23 == 8) {
                            a9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                        } else if (i23 == 10) {
                            a9Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                        } else {
                            a9Var.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                        }
                    } else if (i10 == privacyControlActivity.W) {
                        a9Var.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                    } else if (i10 == privacyControlActivity.a0) {
                        a9Var.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                    } else if (i10 == privacyControlActivity.c0) {
                        a9Var.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                    } else if (i10 == privacyControlActivity.g0) {
                        a9Var.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, sh.j.G0(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((privacyControlActivity.I * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                    } else if (i10 == privacyControlActivity.h0) {
                        SpannableString spannableString2 = new SpannableString(ImageLoader.AUTOPLAY_FILTER);
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_input_gift, 0);
                        oqVar.setScale(0.583f, 0.583f);
                        spannableString2.setSpan(oqVar, 0, 1, 33);
                        a9Var.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                    } else if (i10 == privacyControlActivity.n0) {
                        a9Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                    }
                }
            }
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
            return;
        }
        if (i24 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 != privacyControlActivity.K) {
                if (i10 == privacyControlActivity.O) {
                    if (i23 == 10) {
                        m4Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i10 == privacyControlActivity.X) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i10 == privacyControlActivity.S) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                }
                if (i10 == privacyControlActivity.e0) {
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
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                i22 = privacyControlActivity.priceRow;
                if (i10 == i22) {
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    kl0 kl0Var = new kl0(this, i25);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = kl0Var;
                    x7Var.d((int) Utilities.clamp(privacyControlActivity.I, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), w7Var, new jx0(this, r8 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setCheckBoxIcon(0);
            i20 = privacyControlActivity.readRow;
            if (i10 == i20) {
                s8Var.f(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.y0, false);
                return;
            }
            i21 = privacyControlActivity.showGiftIconRow;
            if (i10 == i21) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.A0, false);
                return;
            }
            if (i10 == privacyControlActivity.i0) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.C0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.C0) {
                    i27 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i10 == privacyControlActivity.j0) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.E0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.E0) {
                    i28 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i10 == privacyControlActivity.k0) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.G0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.G0) {
                    i29 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i10 == privacyControlActivity.l0) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.I0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.I0) {
                    i30 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i30);
                return;
            }
            if (i10 == privacyControlActivity.m0) {
                s8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.K0, false);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.K0) {
                    i31 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i31);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
        j6Var.setRadioIcon(null);
        i14 = privacyControlActivity.everybodyRow;
        if (i10 != i14 && i10 != privacyControlActivity.L) {
            i19 = privacyControlActivity.nobodyRow;
            if (i10 != i19 && i10 != privacyControlActivity.d0) {
                if (i10 == privacyControlActivity.U) {
                    j6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.G == 1, false);
                } else if (i10 == privacyControlActivity.T) {
                    j6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.G == 0, true);
                }
                if (i23 != 12) {
                    j6Var.b(null, !privacyControlActivity.u0());
                    return;
                }
                return;
            }
        }
        i15 = privacyControlActivity.everybodyRow;
        if (i10 == i15) {
            if (i23 == 3) {
                j6Var.c(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.F == 0, true);
            } else {
                j6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.F == 0, true);
            }
        } else if (i10 == privacyControlActivity.L) {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                String string2 = LocaleController.getString(R.string.P2PContacts);
                boolean z4 = privacyControlActivity.F == 2;
                i18 = privacyControlActivity.nobodyRow;
                j6Var.c(string2, z4, (i18 == -1 && privacyControlActivity.d0 == -1) ? false : true);
            } else if (i23 == 10) {
                String string3 = LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium);
                boolean z10 = privacyControlActivity.F == 2;
                i17 = privacyControlActivity.nobodyRow;
                j6Var.c(string3, z10, (i17 == -1 && privacyControlActivity.d0 == -1) ? false : true);
            } else {
                String string4 = LocaleController.getString(R.string.LastSeenContacts);
                boolean z11 = privacyControlActivity.F == 2;
                i16 = privacyControlActivity.nobodyRow;
                j6Var.c(string4, z11, (i16 == -1 && privacyControlActivity.d0 == -1) ? false : true);
            }
        } else if (i10 == privacyControlActivity.d0) {
            if (i23 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            j6Var.c(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.F == 3, false);
        } else {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                j6Var.c(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.F == 1, false);
            } else {
                j6Var.c(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.F == 1, false);
            }
        }
        if (i23 != 12) {
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setCanDisable(true);
                view = aaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(privacyControlActivity.getParentActivity());
                privacyControlActivity.r0 = o8Var;
                if (privacyControlActivity.u0 == null) {
                    o8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    o8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.r0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                privacyControlActivity.r0.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                privacyControlActivity.q0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.r0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.r0.e.setAnimation(privacyControlActivity.q0);
                view = privacyControlActivity.r0;
                break;
            case 7:
                privacyControlActivity.s0 = new org.telegram.ui.Components.p9(privacyControlActivity.getParentActivity());
                privacyControlActivity.t0 = new ms(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.u0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.v0;
                    if (photo != null) {
                        org.telegram.ui.Components.p9 p9Var = privacyControlActivity.s0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        p9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.p9 p9Var2 = privacyControlActivity.s0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        p9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.t0.addView(privacyControlActivity.s0, k7.c6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.t0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.t0.getImageView().setVisibility(0);
                privacyControlActivity.t0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                ms msVar = privacyControlActivity.t0;
                int i13 = org.telegram.ui.ActionBar.k6.p7;
                msVar.e(i13, i13);
                view = privacyControlActivity.t0;
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.s8(context, g6Var);
                break;
            case 9:
                g6Var2 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x7(context, g6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                g6Var3 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                qh.d dVar = new qh.d(context, g6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new f60(this, 24));
                frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
