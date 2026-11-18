package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kt0 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public kt0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = f1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.d0) {
            i15 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.i5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i7 || b10 == privacyControlActivity.b0) {
            return true;
        }
        i10 = privacyControlActivity.photoForRestRow;
        if (b10 == i10) {
            return true;
        }
        i11 = privacyControlActivity.readRow;
        if (b10 == i11) {
            return true;
        }
        i12 = privacyControlActivity.showGiftIconRow;
        if (b10 == i12 || b10 == privacyControlActivity.g0 || b10 == privacyControlActivity.p0 || b10 == privacyControlActivity.q0 || b10 == privacyControlActivity.r0 || b10 == privacyControlActivity.o0 || b10 == privacyControlActivity.n0) {
            return true;
        }
        if (privacyControlActivity.E == 12 && privacyControlActivity.F0()) {
            return false;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (b10 == i13 || b10 == privacyControlActivity.Q || b10 == privacyControlActivity.i0) {
            return true;
        }
        i14 = privacyControlActivity.everybodyRow;
        return b10 == i14 || b10 == privacyControlActivity.V || b10 == privacyControlActivity.U;
    }

    public final int E(ArrayList arrayList) {
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i7++;
            } else {
                TLRPC.Chat O0 = this.d.getMessagesController().O0(Long.valueOf(-longValue));
                if (O0 != null) {
                    i7 += O0.participants_count;
                }
            }
        }
        return i7;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.t0;
    }

    @Override // v4.i0
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
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i7 == privacyControlActivity.U || i7 == privacyControlActivity.V || i7 == privacyControlActivity.d0 || i7 == privacyControlActivity.g0) {
            return 0;
        }
        if (i7 == privacyControlActivity.W || i7 == privacyControlActivity.R || i7 == privacyControlActivity.S || i7 == privacyControlActivity.l0 || i7 == privacyControlActivity.e0 || i7 == privacyControlActivity.b0 || i7 == privacyControlActivity.f0 || i7 == privacyControlActivity.h0) {
            return 1;
        }
        i10 = privacyControlActivity.setBirthdayRow;
        if (i7 == i10 || i7 == privacyControlActivity.m0 || i7 == privacyControlActivity.s0) {
            return 1;
        }
        if (i7 == privacyControlActivity.P || i7 == privacyControlActivity.j0 || i7 == privacyControlActivity.T || i7 == privacyControlActivity.c0 || i7 == privacyControlActivity.X) {
            return 2;
        }
        i11 = privacyControlActivity.giftTypesHeaderRow;
        if (i7 == i11) {
            return 2;
        }
        i12 = privacyControlActivity.everybodyRow;
        if (i7 == i12 || i7 == privacyControlActivity.Q) {
            return 3;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (i7 == i13 || i7 == privacyControlActivity.i0 || i7 == privacyControlActivity.Y || i7 == privacyControlActivity.Z) {
            return 3;
        }
        if (i7 == privacyControlActivity.O) {
            return 4;
        }
        if (i7 == privacyControlActivity.a0) {
            return 5;
        }
        i14 = privacyControlActivity.photoForRestRow;
        if (i7 == i14) {
            return 6;
        }
        i15 = privacyControlActivity.currentPhotoForRestRow;
        if (i7 == i15) {
            return 7;
        }
        i16 = privacyControlActivity.readRow;
        if (i7 == i16) {
            return 8;
        }
        i17 = privacyControlActivity.showGiftIconRow;
        if (i7 == i17 || i7 == privacyControlActivity.p0 || i7 == privacyControlActivity.q0 || i7 == privacyControlActivity.r0 || i7 == privacyControlActivity.n0 || i7 == privacyControlActivity.o0) {
            return 8;
        }
        i18 = privacyControlActivity.priceRow;
        if (i7 == i18) {
            return 9;
        }
        return i7 == privacyControlActivity.k0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
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
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.G;
        int i22 = privacyControlActivity.E;
        int i23 = f1Var.f;
        View view = f1Var.a;
        final int i24 = 1;
        r9 = 0;
        int i25 = 0;
        r9 = 0;
        int i26 = 0;
        r9 = 0;
        int i27 = 0;
        r9 = 0;
        int i28 = 0;
        r9 = 0;
        int i29 = 0;
        if (i23 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, privacyControlActivity.getResourceProvider());
            if (i7 == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? org.telegram.messenger.gd.G(E(privacyControlActivity.I), "Users", new Object[0]) : org.telegram.messenger.gd.M0(2131751150, null);
                if (privacyControlActivity.F[privacyControlActivity.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.gd.a0(null, null, 2131746587, new Object[0]) : org.telegram.messenger.gd.a0(null, null, 2131746586, G);
                }
                if (i22 != 10) {
                    int i30 = privacyControlActivity.K;
                    if (zArr[i30] && i30 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? org.telegram.messenger.gd.a0(null, null, 2131746574, new Object[0]) : org.telegram.messenger.gd.a0(null, null, 2131746573, G);
                    }
                }
                if (i22 == 10) {
                    x9Var.c(org.telegram.messenger.gd.M0(2131746556, null), G, false, false);
                } else if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                    x9Var.c(org.telegram.messenger.gd.M0(2131754266, null), G, false, privacyControlActivity.V != -1);
                } else {
                    x9Var.c(org.telegram.messenger.gd.M0(2131754267, null), G, false, privacyControlActivity.V != -1);
                }
                if (i22 == 12) {
                    x9Var.setEnabled(!privacyControlActivity.F0());
                    return;
                }
                return;
            }
            if (i7 != privacyControlActivity.V) {
                if (i7 == privacyControlActivity.d0) {
                    i10 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).currentAccount;
                    x9Var.c(org.telegram.messenger.gd.M0(2131746606, null), org.telegram.messenger.i5.r(i10).t(3) ? org.telegram.messenger.gd.M0(2131748587, null) : PrivacySettingsActivity.C0(privacyControlActivity.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i7 == privacyControlActivity.g0) {
                        x9Var.b(org.telegram.messenger.gd.M0(privacyControlActivity.getUserConfig().q() ? 2131746620 : 2131746621, null), false);
                        org.telegram.ui.ActionBar.u6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.n6.n6, privacyControlActivity.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? org.telegram.messenger.gd.G(E(privacyControlActivity.J), "Users", new Object[0]) : org.telegram.messenger.gd.M0(2131751150, null);
            int i31 = privacyControlActivity.K;
            if (zArr[i31] && i31 == 0) {
                ArrayList arrayList3 = privacyControlActivity.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? org.telegram.messenger.gd.a0(null, null, 2131746574, new Object[0]) : org.telegram.messenger.gd.a0(null, null, 2131746573, G2);
            }
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                x9Var.c(org.telegram.messenger.gd.M0(2131748099, null), G2, false, false);
            } else {
                x9Var.c(org.telegram.messenger.gd.M0(2131748100, null), G2, false, false);
            }
            if (i22 == 12) {
                x9Var.setEnabled(!privacyControlActivity.F0());
                return;
            }
            return;
        }
        int i32 = 8;
        if (i23 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == privacyControlActivity.S) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131746557, null));
            } else {
                int i33 = privacyControlActivity.R;
                if (i7 == i33 && i22 == 10) {
                    String M0 = org.telegram.messenger.gd.M0(2131746615, null);
                    final int i34 = r9 ? 1 : 0;
                    a9Var.setText(org.telegram.messenger.g0.T2(M0, new Runnable(this) { // from class: org.telegram.ui.it0
                        public final /* synthetic */ kt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i35 = i34;
                            kt0 kt0Var = this.b;
                            switch (i35) {
                                case 0:
                                    kt0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity2 = kt0Var.d;
                                    privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.x2) org.telegram.ui.Components.b5.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.gd.M0(2131751227, null), org.telegram.messenger.gd.M0(2131751232, null), null, new jt0(kt0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }));
                } else if (i7 == i33 && i22 == 8) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131746564, null));
                } else {
                    i11 = privacyControlActivity.setBirthdayRow;
                    if (i7 == i11) {
                        a9Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131746664, null), new Runnable(this) { // from class: org.telegram.ui.it0
                            public final /* synthetic */ kt0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i35 = i24;
                                kt0 kt0Var = this.b;
                                switch (i35) {
                                    case 0:
                                        kt0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity2 = kt0Var.d;
                                        privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.x2) org.telegram.ui.Components.b5.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.gd.M0(2131751227, null), org.telegram.messenger.gd.M0(2131751232, null), null, new jt0(kt0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i7 == privacyControlActivity.R) {
                        if (i22 == 6) {
                            if (privacyControlActivity.K == 1 && privacyControlActivity.L == 1) {
                                a9Var.setText(org.telegram.messenger.gd.M0(2131746594, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String k10 = p5.c.k("https://t.me/+", privacyControlActivity.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(k10);
                                spannableString.setSpan(new org.telegram.ui.Cells.h(i32, this, k10), 0, k10.length(), 33);
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131746596, null)).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.gd.M0(2131746593, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                a9Var.setText(spannableStringBuilder);
                            }
                        } else if (i22 == 5) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746641, null));
                        } else if (i22 == 4) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746583, null));
                        } else if (i22 == 9) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746672, null));
                        } else if (i22 == 14) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746609, null));
                        } else if (i22 == 11) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746666, null));
                        } else if (i22 == 12) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746635, null));
                        } else if (i22 == 3) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746655, null));
                        } else if (i22 == 2) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131742621, null));
                        } else if (i22 == 1) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131742623, null));
                        } else {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751674, null));
                        }
                    } else if (i7 == privacyControlActivity.W) {
                        if (i22 == 6) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746595, null));
                        } else if (i22 == 5) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746640, null));
                        } else if (i22 == 4) {
                            int i35 = privacyControlActivity.K;
                            if (i35 == 2) {
                                a9Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746580, null)));
                            } else if (i35 == 0) {
                                a9Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746582, null)));
                            } else {
                                a9Var.setText(org.telegram.messenger.gd.M0(2131746581, null));
                            }
                        } else if (i22 == 3) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751672, null));
                        } else if (i22 == 9) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746673, null));
                        } else if (i22 == 14) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746610, null));
                        } else if (i22 == 11) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746665, null));
                        } else if (i22 == 2) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751675, null));
                        } else if (i22 == 1) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751670, null));
                        } else if (i22 == 12) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751671, null));
                        } else if (i22 == 8) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746563, null));
                        } else if (i22 == 10) {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131746554, null));
                        } else {
                            a9Var.setText(org.telegram.messenger.gd.M0(2131751669, null));
                        }
                    } else if (i7 == privacyControlActivity.b0) {
                        a9Var.setText(org.telegram.messenger.gd.M0(2131747073, null));
                    } else if (i7 == privacyControlActivity.f0) {
                        a9Var.setText(org.telegram.messenger.gd.M0(2131749120, null));
                    } else if (i7 == privacyControlActivity.h0) {
                        a9Var.setText(org.telegram.messenger.gd.M0(privacyControlActivity.getUserConfig().q() ? 2131746618 : 2131746619, null));
                    } else if (i7 == privacyControlActivity.l0) {
                        a9Var.setText(org.telegram.messenger.gd.a0(null, null, 2131746552, ki.k.J0(privacyControlActivity.getMessagesController().M6), String.valueOf(((int) (((privacyControlActivity.N * (privacyControlActivity.getMessagesController().M6 / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().f6)) / 100.0d)));
                    } else if (i7 == privacyControlActivity.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.msg_input_gift, 0);
                        lqVar.I = 0.583f;
                        lqVar.J = 0.583f;
                        spannableString2.setSpan(lqVar, 0, 1, 33);
                        a9Var.setText(org.telegram.messenger.gd.V(null, null, 2131746633, spannableString2));
                    } else if (i7 == privacyControlActivity.s0) {
                        a9Var.setText(org.telegram.messenger.gd.M0(2131746629, null));
                    }
                }
            }
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, a9Var, null);
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (i7 != privacyControlActivity.P) {
                if (i7 == privacyControlActivity.T) {
                    if (i22 == 10) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131746555, null));
                        return;
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131754429, null));
                        return;
                    }
                }
                if (i7 == privacyControlActivity.c0) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746605, null));
                    return;
                }
                if (i7 == privacyControlActivity.X) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746591, null));
                    return;
                }
                if (i7 == privacyControlActivity.j0) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746553, null));
                    return;
                }
                i12 = privacyControlActivity.giftTypesHeaderRow;
                if (i7 == i12) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746630, null));
                    return;
                }
                return;
            }
            if (i22 == 6) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746592, null));
                return;
            }
            if (i22 == 5) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746637, null));
                return;
            }
            if (i22 == 4) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746579, null));
                return;
            }
            if (i22 == 9) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746671, null));
                return;
            }
            if (i22 == 14) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746608, null));
                return;
            }
            if (i22 == 3) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131747561, null));
                return;
            }
            if (i22 == 2) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131742622, null));
                return;
            }
            if (i22 == 1) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131742624, null));
                return;
            }
            if (i22 == 8) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746561, null));
                return;
            }
            if (i22 == 10) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746614, null));
                return;
            }
            if (i22 == 11) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746661, null));
                return;
            } else if (i22 == 12) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746632, null));
                return;
            } else {
                o4Var.setText(org.telegram.messenger.gd.M0(2131748820, null));
                return;
            }
        }
        if (i23 != 3) {
            if (i23 != 8) {
                if (i23 != 9) {
                    return;
                }
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                i21 = privacyControlActivity.priceRow;
                if (i7 == i21) {
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.ks.e3, org.telegram.messenger.ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) privacyControlActivity.getMessagesController().L6);
                    qi0 qi0Var = new qi0(this, i32);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a10;
                    t7Var.d = 20;
                    t7Var.e = qi0Var;
                    u7Var.d((int) Utilities.k(privacyControlActivity.N, privacyControlActivity.getMessagesController().L6, 1L), t7Var, new jt0(this, r9 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setCheckBoxIcon(0);
            i19 = privacyControlActivity.readRow;
            if (i7 == i19) {
                s8Var.f(org.telegram.messenger.gd.M0(2131749121, null), privacyControlActivity.D0, false);
                return;
            }
            i20 = privacyControlActivity.showGiftIconRow;
            if (i7 == i20) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746634, null), privacyControlActivity.F0, false);
                return;
            }
            if (i7 == privacyControlActivity.n0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746625, null), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.H0) {
                    i25 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i25);
                return;
            }
            if (i7 == privacyControlActivity.o0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746628, null), privacyControlActivity.J0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.J0) {
                    i26 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i7 == privacyControlActivity.p0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746626, null), privacyControlActivity.L0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.L0) {
                    i27 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i7 == privacyControlActivity.q0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746631, null), privacyControlActivity.N0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.N0) {
                    i28 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i7 == privacyControlActivity.r0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746627, null), privacyControlActivity.P0, false);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.P0) {
                    i29 = R.drawable.permission_locked;
                }
                s8Var.setCheckBoxIcon(i29);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
        j6Var.setRadioIcon(null);
        i13 = privacyControlActivity.everybodyRow;
        if (i7 != i13 && i7 != privacyControlActivity.Q) {
            i18 = privacyControlActivity.nobodyRow;
            if (i7 != i18 && i7 != privacyControlActivity.i0) {
                if (i7 == privacyControlActivity.Z) {
                    j6Var.c(org.telegram.messenger.gd.M0(2131748837, null), privacyControlActivity.L == 1, false);
                } else if (i7 == privacyControlActivity.Y) {
                    j6Var.c(org.telegram.messenger.gd.M0(2131748827, null), privacyControlActivity.L == 0, true);
                }
                if (i22 != 12) {
                    j6Var.b(null, !privacyControlActivity.F0());
                    return;
                }
                return;
            }
        }
        i14 = privacyControlActivity.everybodyRow;
        if (i7 == i14) {
            if (i22 == 3) {
                j6Var.c(org.telegram.messenger.gd.M0(2131747560, null), privacyControlActivity.K == 0, true);
            } else {
                j6Var.c(org.telegram.messenger.gd.M0(2131748827, null), privacyControlActivity.K == 0, true);
            }
        } else if (i7 == privacyControlActivity.Q) {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().M5 && !privacyControlActivity.getUserConfig().q())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                String M02 = org.telegram.messenger.gd.M0(2131747565, null);
                boolean z10 = privacyControlActivity.K == 2;
                i17 = privacyControlActivity.nobodyRow;
                j6Var.c(M02, z10, (i17 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else if (i22 == 10) {
                String M03 = org.telegram.messenger.gd.M0(2131746616, null);
                boolean z11 = privacyControlActivity.K == 2;
                i16 = privacyControlActivity.nobodyRow;
                j6Var.c(M03, z11, (i16 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else {
                String M04 = org.telegram.messenger.gd.M0(2131748837, null);
                boolean z12 = privacyControlActivity.K == 2;
                i15 = privacyControlActivity.nobodyRow;
                j6Var.c(M04, z12, (i15 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            }
        } else if (i7 == privacyControlActivity.i0) {
            if (i22 == 10 && !privacyControlActivity.getUserConfig().q()) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            j6Var.c(org.telegram.messenger.gd.M0(2131746558, null), privacyControlActivity.K == 3, false);
        } else {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().M5 && !privacyControlActivity.getUserConfig().q())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                j6Var.c(org.telegram.messenger.gd.M0(2131747558, null), privacyControlActivity.K == 1, false);
            } else {
                j6Var.c(org.telegram.messenger.gd.M0(2131748824, null), privacyControlActivity.K == 1, false);
            }
        }
        if (i22 != 12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a9Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.Cells.x9 x9Var;
        org.telegram.ui.ActionBar.i6 i6Var3;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                x9Var2.setCanDisable(true);
                x9Var = x9Var2;
                a9Var = x9Var;
                break;
            case 1:
                a9Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                a9Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 3:
                a9Var = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                a9Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                a9Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = n8Var;
                if (privacyControlActivity.z0 == null) {
                    n8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.a0(null, null, 2131745322, new Object[0]), false);
                } else {
                    n8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.a0("UpdatePhotoForRest", null, 2131743580, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                privacyControlActivity.w0.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                privacyControlActivity.v0 = new org.telegram.ui.Components.mh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                a9Var = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new org.telegram.ui.Components.q9(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new or(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.q9 q9Var = privacyControlActivity.x0;
                        org.telegram.messenger.fc i12 = org.telegram.messenger.fc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).currentAccount;
                        q9Var.j(i12, "50_50", null, org.telegram.messenger.j10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.q9 q9Var2 = privacyControlActivity.x0;
                        org.telegram.messenger.fc e10 = org.telegram.messenger.fc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).currentAccount;
                        q9Var2.j(e10, "50_50", null, org.telegram.messenger.j10.i(i10).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, c8.ma.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(org.telegram.messenger.gd.M0(2131746094, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                or orVar = privacyControlActivity.y0;
                int i13 = org.telegram.ui.ActionBar.n6.p7;
                orVar.g(i13, i13);
                a9Var = privacyControlActivity.y0;
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).resourceProvider;
                a9Var = new org.telegram.ui.Cells.s8(context, i6Var);
                break;
            case 9:
                i6Var2 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).resourceProvider;
                a9Var = new org.telegram.ui.Cells.u7(context, i6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                i6Var3 = ((org.telegram.ui.ActionBar.h2) privacyControlActivity).resourceProvider;
                hi.d dVar = new hi.d(context, i6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131746559, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new j40(this, 26));
                frameLayout.addView(dVar, c8.ma.d(-1, 48.0f, org.telegram.messenger.ks.E1, 18.0f, 0.0f, 18.0f, 16.0f));
                x9Var = frameLayout;
                a9Var = x9Var;
                break;
        }
        return new org.telegram.ui.Components.kj0(a9Var);
    }
}
