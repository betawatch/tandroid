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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public ht0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
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
        int b10 = e1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.d0) {
            i15 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
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
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i7 += M0.participants_count;
                }
            }
        }
        return i7;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.t0;
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.G;
        int i22 = privacyControlActivity.E;
        int i23 = e1Var.f;
        View view = e1Var.a;
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
            org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.G6, privacyControlActivity.getResourceProvider());
            if (i7 == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? org.telegram.messenger.hd.G(E(privacyControlActivity.I), "Users", new Object[0]) : org.telegram.messenger.hd.M0(2131751161, null);
                if (privacyControlActivity.F[privacyControlActivity.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.hd.a0(null, null, 2131746780, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131746779, G);
                }
                if (i22 != 10) {
                    int i31 = privacyControlActivity.K;
                    if (zArr[i31] && i31 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? org.telegram.messenger.hd.a0(null, null, 2131746767, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131746766, G);
                    }
                }
                if (i22 == 10) {
                    v9Var.c(org.telegram.messenger.hd.M0(2131746749, null), G, false, false);
                } else if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                    v9Var.c(org.telegram.messenger.hd.M0(2131754268, null), G, false, privacyControlActivity.V != -1);
                } else {
                    v9Var.c(org.telegram.messenger.hd.M0(2131754269, null), G, false, privacyControlActivity.V != -1);
                }
                if (i22 == 12) {
                    v9Var.setEnabled(!privacyControlActivity.F0());
                    return;
                }
                return;
            }
            if (i7 != privacyControlActivity.V) {
                if (i7 == privacyControlActivity.d0) {
                    i10 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
                    v9Var.c(org.telegram.messenger.hd.M0(2131746799, null), org.telegram.messenger.g5.r(i10).t(3) ? org.telegram.messenger.hd.M0(2131748779, null) : PrivacySettingsActivity.C0(privacyControlActivity.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i7 == privacyControlActivity.g0) {
                        v9Var.b(org.telegram.messenger.hd.M0(privacyControlActivity.getUserConfig().q() ? 2131746813 : 2131746814, null), false);
                        org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.n6, privacyControlActivity.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? org.telegram.messenger.hd.G(E(privacyControlActivity.J), "Users", new Object[0]) : org.telegram.messenger.hd.M0(2131751161, null);
            int i32 = privacyControlActivity.K;
            if (zArr[i32] && i32 == 0) {
                ArrayList arrayList3 = privacyControlActivity.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? org.telegram.messenger.hd.a0(null, null, 2131746767, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131746766, G2);
            }
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                v9Var.c(org.telegram.messenger.hd.M0(2131748291, null), G2, false, false);
            } else {
                v9Var.c(org.telegram.messenger.hd.M0(2131748292, null), G2, false, false);
            }
            if (i22 == 12) {
                v9Var.setEnabled(!privacyControlActivity.F0());
                return;
            }
            return;
        }
        int i33 = 8;
        if (i23 == 1) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == privacyControlActivity.S) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131746750, null));
            } else {
                int i34 = privacyControlActivity.R;
                if (i7 == i34 && i22 == 10) {
                    String M0 = org.telegram.messenger.hd.M0(2131746808, null);
                    final int i35 = r9 ? 1 : 0;
                    y8Var.setText(org.telegram.messenger.g0.U2(M0, new Runnable(this) { // from class: org.telegram.ui.ft0
                        public final /* synthetic */ ht0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i36 = i35;
                            ht0 ht0Var = this.b;
                            switch (i36) {
                                case 0:
                                    ht0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity2 = ht0Var.d;
                                    privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new gt0(ht0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }));
                } else if (i7 == i34 && i22 == 8) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131746757, null));
                } else {
                    i11 = privacyControlActivity.setBirthdayRow;
                    if (i7 == i11) {
                        y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131746857, null), new Runnable(this) { // from class: org.telegram.ui.ft0
                            public final /* synthetic */ ht0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i36 = i25;
                                ht0 ht0Var = this.b;
                                switch (i36) {
                                    case 0:
                                        ht0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity2 = ht0Var.d;
                                        privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new gt0(ht0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i7 == privacyControlActivity.R) {
                        if (i22 == 6) {
                            if (privacyControlActivity.K == 1 && privacyControlActivity.L == 1) {
                                y8Var.setText(org.telegram.messenger.hd.M0(2131746787, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String k10 = r.b.k("https://t.me/+", privacyControlActivity.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(k10);
                                spannableString.setSpan(new org.telegram.ui.Cells.h(i24, this, k10), 0, k10.length(), 33);
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131746789, null)).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.hd.M0(2131746786, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                y8Var.setText(spannableStringBuilder);
                            }
                        } else if (i22 == 5) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746834, null));
                        } else if (i22 == 4) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746776, null));
                        } else if (i22 == 9) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746865, null));
                        } else if (i22 == 14) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746802, null));
                        } else if (i22 == 11) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746859, null));
                        } else if (i22 == 12) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746828, null));
                        } else if (i22 == 3) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746848, null));
                        } else if (i22 == 2) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131742879, null));
                        } else if (i22 == 1) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131742881, null));
                        } else {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751685, null));
                        }
                    } else if (i7 == privacyControlActivity.W) {
                        if (i22 == 6) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746788, null));
                        } else if (i22 == 5) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746833, null));
                        } else if (i22 == 4) {
                            int i36 = privacyControlActivity.K;
                            if (i36 == 2) {
                                y8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746773, null)));
                            } else if (i36 == 0) {
                                y8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746775, null)));
                            } else {
                                y8Var.setText(org.telegram.messenger.hd.M0(2131746774, null));
                            }
                        } else if (i22 == 3) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751683, null));
                        } else if (i22 == 9) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746866, null));
                        } else if (i22 == 14) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746803, null));
                        } else if (i22 == 11) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746858, null));
                        } else if (i22 == 2) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751686, null));
                        } else if (i22 == 1) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751681, null));
                        } else if (i22 == 12) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751682, null));
                        } else if (i22 == 8) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746756, null));
                        } else if (i22 == 10) {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131746747, null));
                        } else {
                            y8Var.setText(org.telegram.messenger.hd.M0(2131751680, null));
                        }
                    } else if (i7 == privacyControlActivity.b0) {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131747266, null));
                    } else if (i7 == privacyControlActivity.f0) {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131749312, null));
                    } else if (i7 == privacyControlActivity.h0) {
                        y8Var.setText(org.telegram.messenger.hd.M0(privacyControlActivity.getUserConfig().q() ? 2131746811 : 2131746812, null));
                    } else if (i7 == privacyControlActivity.l0) {
                        y8Var.setText(org.telegram.messenger.hd.a0(null, null, 2131746745, ki.k.J0(privacyControlActivity.getMessagesController().K6), String.valueOf(((int) (((privacyControlActivity.N * (privacyControlActivity.getMessagesController().K6 / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().d6)) / 100.0d)));
                    } else if (i7 == privacyControlActivity.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_input_gift, 0);
                        eqVar.I = 0.583f;
                        eqVar.J = 0.583f;
                        spannableString2.setSpan(eqVar, 0, 1, 33);
                        y8Var.setText(org.telegram.messenger.hd.V(null, null, 2131746826, spannableString2));
                    } else if (i7 == privacyControlActivity.s0) {
                        y8Var.setText(org.telegram.messenger.hd.M0(2131746822, null));
                    }
                }
            }
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, y8Var, null);
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 != privacyControlActivity.P) {
                if (i7 == privacyControlActivity.T) {
                    if (i22 == 10) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746748, null));
                        return;
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131754431, null));
                        return;
                    }
                }
                if (i7 == privacyControlActivity.c0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746798, null));
                    return;
                }
                if (i7 == privacyControlActivity.X) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746784, null));
                    return;
                }
                if (i7 == privacyControlActivity.j0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746746, null));
                    return;
                }
                i12 = privacyControlActivity.giftTypesHeaderRow;
                if (i7 == i12) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746823, null));
                    return;
                }
                return;
            }
            if (i22 == 6) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746785, null));
                return;
            }
            if (i22 == 5) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746830, null));
                return;
            }
            if (i22 == 4) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746772, null));
                return;
            }
            if (i22 == 9) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746864, null));
                return;
            }
            if (i22 == 14) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746801, null));
                return;
            }
            if (i22 == 3) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747754, null));
                return;
            }
            if (i22 == 2) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131742880, null));
                return;
            }
            if (i22 == 1) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131742882, null));
                return;
            }
            if (i22 == 8) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746754, null));
                return;
            }
            if (i22 == 10) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746807, null));
                return;
            }
            if (i22 == 11) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746854, null));
                return;
            } else if (i22 == 12) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746825, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131749012, null));
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
                if (i7 == i21) {
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.ns.e3, org.telegram.messenger.ns.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) privacyControlActivity.getMessagesController().J6);
                    ni0 ni0Var = new ni0(this, i33);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.c = a10;
                    r7Var.d = 20;
                    r7Var.e = ni0Var;
                    s7Var.d((int) Utilities.k(privacyControlActivity.N, privacyControlActivity.getMessagesController().J6, 1L), r7Var, new gt0(this, r9 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setCheckBoxIcon(0);
            i19 = privacyControlActivity.readRow;
            if (i7 == i19) {
                q8Var.f(org.telegram.messenger.hd.M0(2131749313, null), privacyControlActivity.D0, false);
                return;
            }
            i20 = privacyControlActivity.showGiftIconRow;
            if (i7 == i20) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746827, null), privacyControlActivity.F0, false);
                return;
            }
            if (i7 == privacyControlActivity.n0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746818, null), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.H0) {
                    i26 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i7 == privacyControlActivity.o0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746821, null), privacyControlActivity.J0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.J0) {
                    i27 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i7 == privacyControlActivity.p0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746819, null), privacyControlActivity.L0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.L0) {
                    i28 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i7 == privacyControlActivity.q0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746824, null), privacyControlActivity.N0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.N0) {
                    i29 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i7 == privacyControlActivity.r0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131746820, null), privacyControlActivity.P0, false);
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
        if (i7 != i13 && i7 != privacyControlActivity.Q) {
            i18 = privacyControlActivity.nobodyRow;
            if (i7 != i18 && i7 != privacyControlActivity.i0) {
                if (i7 == privacyControlActivity.Z) {
                    h6Var.c(org.telegram.messenger.hd.M0(2131749029, null), privacyControlActivity.L == 1, false);
                } else if (i7 == privacyControlActivity.Y) {
                    h6Var.c(org.telegram.messenger.hd.M0(2131749019, null), privacyControlActivity.L == 0, true);
                }
                if (i22 != 12) {
                    h6Var.b(null, !privacyControlActivity.F0());
                    return;
                }
                return;
            }
        }
        i14 = privacyControlActivity.everybodyRow;
        if (i7 == i14) {
            if (i22 == 3) {
                h6Var.c(org.telegram.messenger.hd.M0(2131747753, null), privacyControlActivity.K == 0, true);
            } else {
                h6Var.c(org.telegram.messenger.hd.M0(2131749019, null), privacyControlActivity.K == 0, true);
            }
        } else if (i7 == privacyControlActivity.Q) {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q())) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                String M02 = org.telegram.messenger.hd.M0(2131747758, null);
                boolean z10 = privacyControlActivity.K == 2;
                i17 = privacyControlActivity.nobodyRow;
                h6Var.c(M02, z10, (i17 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else if (i22 == 10) {
                String M03 = org.telegram.messenger.hd.M0(2131746809, null);
                boolean z11 = privacyControlActivity.K == 2;
                i16 = privacyControlActivity.nobodyRow;
                h6Var.c(M03, z11, (i16 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            } else {
                String M04 = org.telegram.messenger.hd.M0(2131749029, null);
                boolean z12 = privacyControlActivity.K == 2;
                i15 = privacyControlActivity.nobodyRow;
                h6Var.c(M04, z12, (i15 == -1 && privacyControlActivity.i0 == -1) ? false : true);
            }
        } else if (i7 == privacyControlActivity.i0) {
            if (i22 == 10 && !privacyControlActivity.getUserConfig().q()) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            h6Var.c(org.telegram.messenger.hd.M0(2131746751, null), privacyControlActivity.K == 3, false);
        } else {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q())) {
                h6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                h6Var.c(org.telegram.messenger.hd.M0(2131747751, null), privacyControlActivity.K == 1, false);
            } else {
                h6Var.c(org.telegram.messenger.hd.M0(2131749016, null), privacyControlActivity.K == 1, false);
            }
        }
        if (i22 != 12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View y8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Cells.v9 v9Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
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
                y8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = l8Var;
                if (privacyControlActivity.z0 == null) {
                    l8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.a0(null, null, 2131745517, new Object[0]), false);
                } else {
                    l8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743817, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                privacyControlActivity.w0.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                privacyControlActivity.v0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                y8Var = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new org.telegram.ui.Components.i9(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new nr(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.i9 i9Var = privacyControlActivity.x0;
                        org.telegram.messenger.gc i12 = org.telegram.messenger.gc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
                        i9Var.j(i12, "50_50", null, org.telegram.messenger.m10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.i9 i9Var2 = privacyControlActivity.x0;
                        org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
                        i9Var2.j(e10, "50_50", null, org.telegram.messenger.m10.i(i10).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, c8.ja.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(org.telegram.messenger.hd.M0(2131746289, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                nr nrVar = privacyControlActivity.y0;
                int i13 = org.telegram.ui.ActionBar.j6.p7;
                nrVar.g(i13, i13);
                y8Var = privacyControlActivity.y0;
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                break;
            case 9:
                e6Var2 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.s7(context, e6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                e6Var3 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                hi.d dVar = new hi.d(context, e6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131746752, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new g40(this, 26));
                frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 18.0f, 0.0f, 18.0f, 16.0f));
                v9Var = frameLayout;
                y8Var = v9Var;
                break;
        }
        return new org.telegram.ui.Components.cj0(y8Var);
    }
}
