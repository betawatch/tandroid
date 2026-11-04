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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class at0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public at0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = d1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.d0) {
            i15 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
                return true;
            }
        }
        i3 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i3 || b10 == privacyControlActivity.b0) {
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
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i3++;
            } else {
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i3 += M0.participants_count;
                }
            }
        }
        return i3;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.t0;
    }

    @Override // u4.h0
    public final int d(int i3) {
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
        if (i3 == privacyControlActivity.U || i3 == privacyControlActivity.V || i3 == privacyControlActivity.d0 || i3 == privacyControlActivity.g0) {
            return 0;
        }
        if (i3 == privacyControlActivity.W || i3 == privacyControlActivity.R || i3 == privacyControlActivity.S || i3 == privacyControlActivity.l0 || i3 == privacyControlActivity.e0 || i3 == privacyControlActivity.b0 || i3 == privacyControlActivity.f0 || i3 == privacyControlActivity.h0) {
            return 1;
        }
        i10 = privacyControlActivity.setBirthdayRow;
        if (i3 == i10 || i3 == privacyControlActivity.m0 || i3 == privacyControlActivity.s0) {
            return 1;
        }
        if (i3 == privacyControlActivity.P || i3 == privacyControlActivity.j0 || i3 == privacyControlActivity.T || i3 == privacyControlActivity.c0 || i3 == privacyControlActivity.X) {
            return 2;
        }
        i11 = privacyControlActivity.giftTypesHeaderRow;
        if (i3 == i11) {
            return 2;
        }
        i12 = privacyControlActivity.everybodyRow;
        if (i3 == i12 || i3 == privacyControlActivity.Q) {
            return 3;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (i3 == i13 || i3 == privacyControlActivity.i0 || i3 == privacyControlActivity.Y || i3 == privacyControlActivity.Z) {
            return 3;
        }
        if (i3 == privacyControlActivity.O) {
            return 4;
        }
        if (i3 == privacyControlActivity.a0) {
            return 5;
        }
        i14 = privacyControlActivity.photoForRestRow;
        if (i3 == i14) {
            return 6;
        }
        i15 = privacyControlActivity.currentPhotoForRestRow;
        if (i3 == i15) {
            return 7;
        }
        i16 = privacyControlActivity.readRow;
        if (i3 == i16) {
            return 8;
        }
        i17 = privacyControlActivity.showGiftIconRow;
        if (i3 == i17 || i3 == privacyControlActivity.p0 || i3 == privacyControlActivity.q0 || i3 == privacyControlActivity.r0 || i3 == privacyControlActivity.n0 || i3 == privacyControlActivity.o0) {
            return 8;
        }
        i18 = privacyControlActivity.priceRow;
        if (i3 == i18) {
            return 9;
        }
        return i3 == privacyControlActivity.k0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
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
        int i23 = d1Var.f;
        View view = d1Var.a;
        int i24 = 9;
        final int i25 = 1;
        r9 = 0;
        int i26 = 0;
        r9 = 0;
        int i27 = 0;
        r9 = 0;
        int i28 = 0;
        r9 = 0;
        int i29 = 0;
        r9 = 0;
        int i30 = 0;
        if (i23 == 0) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, privacyControlActivity.getResourceProvider());
            if (i3 == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? org.telegram.messenger.bd.G(E(privacyControlActivity.I), "Users", new Object[0]) : org.telegram.messenger.bd.M0(2131751162, null);
                if (privacyControlActivity.F[privacyControlActivity.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.bd.a0(null, null, 2131746788, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131746787, G);
                }
                if (i22 != 10) {
                    int i31 = privacyControlActivity.K;
                    if (zArr[i31] && i31 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? org.telegram.messenger.bd.a0(null, null, 2131746775, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131746774, G);
                    }
                }
                if (i22 == 10) {
                    v9Var.c(org.telegram.messenger.bd.M0(2131746757, null), G, false, false);
                } else if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                    v9Var.c(org.telegram.messenger.bd.M0(2131754268, null), G, false, privacyControlActivity.V != -1);
                } else {
                    v9Var.c(org.telegram.messenger.bd.M0(2131754269, null), G, false, privacyControlActivity.V != -1);
                }
                if (i22 == 12) {
                    v9Var.setEnabled(!privacyControlActivity.F0());
                    return;
                }
                return;
            }
            if (i3 != privacyControlActivity.V) {
                if (i3 == privacyControlActivity.d0) {
                    i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
                    v9Var.c(org.telegram.messenger.bd.M0(2131746807, null), org.telegram.messenger.g5.r(i10).t(3) ? org.telegram.messenger.bd.M0(2131748787, null) : PrivacySettingsActivity.C0(privacyControlActivity.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i3 == privacyControlActivity.g0) {
                        v9Var.b(org.telegram.messenger.bd.M0(privacyControlActivity.getUserConfig().q() ? 2131746821 : 2131746822, null), false);
                        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.n6, privacyControlActivity.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? org.telegram.messenger.bd.G(E(privacyControlActivity.J), "Users", new Object[0]) : org.telegram.messenger.bd.M0(2131751162, null);
            int i32 = privacyControlActivity.K;
            if (zArr[i32] && i32 == 0) {
                ArrayList arrayList3 = privacyControlActivity.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? org.telegram.messenger.bd.a0(null, null, 2131746775, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131746774, G2);
            }
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                v9Var.c(org.telegram.messenger.bd.M0(2131748299, null), G2, false, false);
            } else {
                v9Var.c(org.telegram.messenger.bd.M0(2131748300, null), G2, false, false);
            }
            if (i22 == 12) {
                v9Var.setEnabled(!privacyControlActivity.F0());
                return;
            }
            return;
        }
        if (i23 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == privacyControlActivity.S) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131746758, null));
            } else {
                int i33 = privacyControlActivity.R;
                if (i3 == i33 && i22 == 10) {
                    String M0 = org.telegram.messenger.bd.M0(2131746816, null);
                    final int i34 = r9 ? 1 : 0;
                    y8Var.setText(org.telegram.messenger.g0.U2(M0, new Runnable(this) { // from class: org.telegram.ui.ys0
                        public final /* synthetic */ at0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i35 = i34;
                            at0 at0Var = this.b;
                            switch (i35) {
                                case 0:
                                    at0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity2 = at0Var.d;
                                    privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), null, new zs0(at0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }));
                } else if (i3 == i33 && i22 == 8) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131746765, null));
                } else {
                    i11 = privacyControlActivity.setBirthdayRow;
                    if (i3 == i11) {
                        y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131746865, null), new Runnable(this) { // from class: org.telegram.ui.ys0
                            public final /* synthetic */ at0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i35 = i25;
                                at0 at0Var = this.b;
                                switch (i35) {
                                    case 0:
                                        at0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity2 = at0Var.d;
                                        privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), null, new zs0(at0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i3 == privacyControlActivity.R) {
                        if (i22 == 6) {
                            if (privacyControlActivity.K == 1 && privacyControlActivity.L == 1) {
                                y8Var.setText(org.telegram.messenger.bd.M0(2131746795, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String f10 = t4.c.f("https://t.me/+", privacyControlActivity.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(f10);
                                spannableString.setSpan(new org.telegram.ui.Cells.h(i24, this, f10), 0, f10.length(), 33);
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131746797, null)).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.bd.M0(2131746794, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                y8Var.setText(spannableStringBuilder);
                            }
                        } else if (i22 == 5) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746842, null));
                        } else if (i22 == 4) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746784, null));
                        } else if (i22 == 9) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746873, null));
                        } else if (i22 == 14) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746810, null));
                        } else if (i22 == 11) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746867, null));
                        } else if (i22 == 12) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746836, null));
                        } else if (i22 == 3) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746856, null));
                        } else if (i22 == 2) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131742889, null));
                        } else if (i22 == 1) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131742891, null));
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751686, null));
                        }
                    } else if (i3 == privacyControlActivity.W) {
                        if (i22 == 6) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746796, null));
                        } else if (i22 == 5) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746841, null));
                        } else if (i22 == 4) {
                            int i35 = privacyControlActivity.K;
                            if (i35 == 2) {
                                y8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746781, null)));
                            } else if (i35 == 0) {
                                y8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746783, null)));
                            } else {
                                y8Var.setText(org.telegram.messenger.bd.M0(2131746782, null));
                            }
                        } else if (i22 == 3) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751684, null));
                        } else if (i22 == 9) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746874, null));
                        } else if (i22 == 14) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746811, null));
                        } else if (i22 == 11) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746866, null));
                        } else if (i22 == 2) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751687, null));
                        } else if (i22 == 1) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751682, null));
                        } else if (i22 == 12) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751683, null));
                        } else if (i22 == 8) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746764, null));
                        } else if (i22 == 10) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131746755, null));
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131751681, null));
                        }
                    } else if (i3 == privacyControlActivity.b0) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131747274, null));
                    } else if (i3 == privacyControlActivity.f0) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131749320, null));
                    } else if (i3 == privacyControlActivity.h0) {
                        y8Var.setText(org.telegram.messenger.bd.M0(privacyControlActivity.getUserConfig().q() ? 2131746819 : 2131746820, null));
                    } else if (i3 == privacyControlActivity.l0) {
                        y8Var.setText(org.telegram.messenger.bd.a0(null, null, 2131746753, ii.k.J0(privacyControlActivity.getMessagesController().J6), String.valueOf(((int) (((privacyControlActivity.N * (privacyControlActivity.getMessagesController().J6 / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().c6)) / 100.0d)));
                    } else if (i3 == privacyControlActivity.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_input_gift, 0);
                        wpVar.I = 0.583f;
                        wpVar.J = 0.583f;
                        spannableString2.setSpan(wpVar, 0, 1, 33);
                        y8Var.setText(org.telegram.messenger.bd.V(null, null, 2131746834, spannableString2));
                    } else if (i3 == privacyControlActivity.s0) {
                        y8Var.setText(org.telegram.messenger.bd.M0(2131746830, null));
                    }
                }
            }
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, null);
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i3 != privacyControlActivity.P) {
                if (i3 == privacyControlActivity.T) {
                    if (i22 == 10) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131746756, null));
                        return;
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131754431, null));
                        return;
                    }
                }
                if (i3 == privacyControlActivity.c0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746806, null));
                    return;
                }
                if (i3 == privacyControlActivity.X) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746792, null));
                    return;
                }
                if (i3 == privacyControlActivity.j0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746754, null));
                    return;
                }
                i12 = privacyControlActivity.giftTypesHeaderRow;
                if (i3 == i12) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131746831, null));
                    return;
                }
                return;
            }
            if (i22 == 6) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746793, null));
                return;
            }
            if (i22 == 5) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746838, null));
                return;
            }
            if (i22 == 4) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746780, null));
                return;
            }
            if (i22 == 9) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746872, null));
                return;
            }
            if (i22 == 14) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746809, null));
                return;
            }
            if (i22 == 3) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747762, null));
                return;
            }
            if (i22 == 2) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131742890, null));
                return;
            }
            if (i22 == 1) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131742892, null));
                return;
            }
            if (i22 == 8) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746762, null));
                return;
            }
            if (i22 == 10) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746815, null));
                return;
            }
            if (i22 == 11) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746862, null));
                return;
            } else if (i22 == 12) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746833, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(2131749020, null));
                return;
            }
        }
        if (i23 != 3) {
            if (i23 != 8) {
                if (i23 != 9) {
                    return;
                }
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                i21 = privacyControlActivity.priceRow;
                if (i3 == i21) {
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.hs.e3, org.telegram.messenger.hs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) privacyControlActivity.getMessagesController().I6);
                    ci0 ci0Var = new ci0(this, i24);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.c = a10;
                    r7Var.d = 20;
                    r7Var.e = ci0Var;
                    s7Var.d((int) Utilities.k(privacyControlActivity.N, privacyControlActivity.getMessagesController().I6, 1L), r7Var, new zs0(this, r9 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setCheckBoxIcon(0);
            i19 = privacyControlActivity.readRow;
            if (i3 == i19) {
                q8Var.f(org.telegram.messenger.bd.M0(2131749321, null), privacyControlActivity.D0, false);
                return;
            }
            i20 = privacyControlActivity.showGiftIconRow;
            if (i3 == i20) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746835, null), privacyControlActivity.F0, false);
                return;
            }
            if (i3 == privacyControlActivity.n0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746826, null), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.H0) {
                    i26 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i3 == privacyControlActivity.o0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746829, null), privacyControlActivity.J0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.J0) {
                    i27 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i3 == privacyControlActivity.p0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746827, null), privacyControlActivity.L0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.L0) {
                    i28 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i3 == privacyControlActivity.q0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746832, null), privacyControlActivity.N0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.N0) {
                    i29 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i3 == privacyControlActivity.r0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131746828, null), privacyControlActivity.P0, false);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.P0) {
                    i30 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i30);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
        h6Var.setRadioIcon(null);
        i13 = privacyControlActivity.everybodyRow;
        if (i3 != i13 && i3 != privacyControlActivity.Q) {
            i18 = privacyControlActivity.nobodyRow;
            if (i3 != i18 && i3 != privacyControlActivity.i0) {
                if (i3 == privacyControlActivity.Z) {
                    h6Var.c(org.telegram.messenger.bd.M0(2131749037, null), privacyControlActivity.L == 1, false);
                } else if (i3 == privacyControlActivity.Y) {
                    h6Var.c(org.telegram.messenger.bd.M0(2131749027, null), privacyControlActivity.L == 0, true);
                }
                if (i22 != 12) {
                    h6Var.b(null, !privacyControlActivity.F0());
                    return;
                }
                return;
            }
        }
        i14 = privacyControlActivity.everybodyRow;
        if (i3 == i14) {
            if (i22 == 3) {
                h6Var.c(org.telegram.messenger.bd.M0(2131747761, null), privacyControlActivity.K == 0, true);
            } else {
                h6Var.c(org.telegram.messenger.bd.M0(2131749027, null), privacyControlActivity.K == 0, true);
            }
        } else if (i3 == privacyControlActivity.Q) {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q())) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                String M02 = org.telegram.messenger.bd.M0(2131747766, null);
                boolean z10 = privacyControlActivity.K == 2;
                i17 = privacyControlActivity.nobodyRow;
                h6Var.c(M02, z10, (i17 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else if (i22 == 10) {
                String M03 = org.telegram.messenger.bd.M0(2131746817, null);
                boolean z11 = privacyControlActivity.K == 2;
                i16 = privacyControlActivity.nobodyRow;
                h6Var.c(M03, z11, (i16 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else {
                String M04 = org.telegram.messenger.bd.M0(2131749037, null);
                boolean z12 = privacyControlActivity.K == 2;
                i15 = privacyControlActivity.nobodyRow;
                h6Var.c(M04, z12, (i15 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            }
        } else if (i3 == privacyControlActivity.i0) {
            if (i22 == 10 && !privacyControlActivity.getUserConfig().q()) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            h6Var.c(org.telegram.messenger.bd.M0(2131746759, null), privacyControlActivity.K == 3, false);
        } else {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q())) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                h6Var.c(org.telegram.messenger.bd.M0(2131747759, null), privacyControlActivity.K == 1, false);
            } else {
                h6Var.c(org.telegram.messenger.bd.M0(2131749024, null), privacyControlActivity.K == 1, false);
            }
        }
        if (i22 != 12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Cells.v9 v9Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i3) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
                v9Var2.setCanDisable(true);
                v9Var = v9Var2;
                y8Var = v9Var;
                break;
            case 1:
                y8Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                y8Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 3:
                y8Var = new org.telegram.ui.Cells.h6(context, null);
                break;
            case 4:
                y8Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                y8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = l8Var;
                if (privacyControlActivity.z0 == null) {
                    l8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.a0(null, null, 2131745527, new Object[0]), false);
                } else {
                    l8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.a0("UpdatePhotoForRest", null, 2131743827, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                privacyControlActivity.w0.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                privacyControlActivity.v0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                y8Var = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new org.telegram.ui.Components.k9(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new jr(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.k9 k9Var = privacyControlActivity.x0;
                        org.telegram.messenger.ac i12 = org.telegram.messenger.ac.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
                        k9Var.j(i12, "50_50", null, org.telegram.messenger.h10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.k9 k9Var2 = privacyControlActivity.x0;
                        org.telegram.messenger.ac e10 = org.telegram.messenger.ac.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
                        k9Var2.j(e10, "50_50", null, org.telegram.messenger.h10.i(i10).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, b8.mf.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(org.telegram.messenger.bd.M0(2131746297, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                jr jrVar = privacyControlActivity.y0;
                int i13 = org.telegram.ui.ActionBar.k6.p7;
                jrVar.g(i13, i13);
                y8Var = privacyControlActivity.y0;
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                break;
            case 9:
                e6Var2 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.s7(context, e6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                e6Var3 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                gi.d dVar = new gi.d(context, e6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131746760, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new b40(this, 26));
                frameLayout.addView(dVar, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 18.0f, 0.0f, 18.0f, 16.0f));
                v9Var = frameLayout;
                y8Var = v9Var;
                break;
        }
        return new org.telegram.ui.Components.bj0(y8Var);
    }
}
