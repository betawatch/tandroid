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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lt0 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public lt0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = d1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.c0) {
            i15 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i7 || b10 == privacyControlActivity.a0) {
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
        if (b10 == i12 || b10 == privacyControlActivity.f0 || b10 == privacyControlActivity.o0 || b10 == privacyControlActivity.p0 || b10 == privacyControlActivity.q0 || b10 == privacyControlActivity.n0 || b10 == privacyControlActivity.m0) {
            return true;
        }
        if (privacyControlActivity.D == 12 && privacyControlActivity.F0()) {
            return false;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (b10 == i13 || b10 == privacyControlActivity.P || b10 == privacyControlActivity.h0) {
            return true;
        }
        i14 = privacyControlActivity.everybodyRow;
        return b10 == i14 || b10 == privacyControlActivity.U || b10 == privacyControlActivity.T;
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

    @Override // v4.g0
    public final int b() {
        return this.d.s0;
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
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i7 == privacyControlActivity.T || i7 == privacyControlActivity.U || i7 == privacyControlActivity.c0 || i7 == privacyControlActivity.f0) {
            return 0;
        }
        if (i7 == privacyControlActivity.V || i7 == privacyControlActivity.Q || i7 == privacyControlActivity.R || i7 == privacyControlActivity.k0 || i7 == privacyControlActivity.d0 || i7 == privacyControlActivity.a0 || i7 == privacyControlActivity.e0 || i7 == privacyControlActivity.g0) {
            return 1;
        }
        i10 = privacyControlActivity.setBirthdayRow;
        if (i7 == i10 || i7 == privacyControlActivity.l0 || i7 == privacyControlActivity.r0) {
            return 1;
        }
        if (i7 == privacyControlActivity.O || i7 == privacyControlActivity.i0 || i7 == privacyControlActivity.S || i7 == privacyControlActivity.b0 || i7 == privacyControlActivity.W) {
            return 2;
        }
        i11 = privacyControlActivity.giftTypesHeaderRow;
        if (i7 == i11) {
            return 2;
        }
        i12 = privacyControlActivity.everybodyRow;
        if (i7 == i12 || i7 == privacyControlActivity.P) {
            return 3;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (i7 == i13 || i7 == privacyControlActivity.h0 || i7 == privacyControlActivity.X || i7 == privacyControlActivity.Y) {
            return 3;
        }
        if (i7 == privacyControlActivity.N) {
            return 4;
        }
        if (i7 == privacyControlActivity.Z) {
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
        if (i7 == i17 || i7 == privacyControlActivity.o0 || i7 == privacyControlActivity.p0 || i7 == privacyControlActivity.q0 || i7 == privacyControlActivity.m0 || i7 == privacyControlActivity.n0) {
            return 8;
        }
        i18 = privacyControlActivity.priceRow;
        if (i7 == i18) {
            return 9;
        }
        return i7 == privacyControlActivity.j0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.F;
        int i22 = privacyControlActivity.D;
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
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.G6, privacyControlActivity.getResourceProvider());
            if (i7 == privacyControlActivity.T) {
                String G = privacyControlActivity.H.size() != 0 ? org.telegram.messenger.id.G(E(privacyControlActivity.H), "Users", new Object[0]) : org.telegram.messenger.id.M0(2131751161, null);
                if (privacyControlActivity.E[privacyControlActivity.J == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.H;
                    G = (arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.id.a0(null, null, 2131746780, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131746779, G);
                }
                if (i22 != 10) {
                    int i31 = privacyControlActivity.J;
                    if (zArr[i31] && i31 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.H;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? org.telegram.messenger.id.a0(null, null, 2131746767, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131746766, G);
                    }
                }
                if (i22 == 10) {
                    w9Var.c(org.telegram.messenger.id.M0(2131746749, null), G, false, false);
                } else if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                    w9Var.c(org.telegram.messenger.id.M0(2131754268, null), G, false, privacyControlActivity.U != -1);
                } else {
                    w9Var.c(org.telegram.messenger.id.M0(2131754269, null), G, false, privacyControlActivity.U != -1);
                }
                if (i22 == 12) {
                    w9Var.setEnabled(!privacyControlActivity.F0());
                    return;
                }
                return;
            }
            if (i7 != privacyControlActivity.U) {
                if (i7 == privacyControlActivity.c0) {
                    i10 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
                    w9Var.c(org.telegram.messenger.id.M0(2131746799, null), org.telegram.messenger.g5.r(i10).t(3) ? org.telegram.messenger.id.M0(2131748779, null) : PrivacySettingsActivity.C0(privacyControlActivity.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i7 == privacyControlActivity.f0) {
                        w9Var.b(org.telegram.messenger.id.M0(privacyControlActivity.getUserConfig().q() ? 2131746813 : 2131746814, null), false);
                        org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.n6, privacyControlActivity.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.I.size() != 0 ? org.telegram.messenger.id.G(E(privacyControlActivity.I), "Users", new Object[0]) : org.telegram.messenger.id.M0(2131751161, null);
            int i32 = privacyControlActivity.J;
            if (zArr[i32] && i32 == 0) {
                ArrayList arrayList3 = privacyControlActivity.I;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? org.telegram.messenger.id.a0(null, null, 2131746767, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131746766, G2);
            }
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                w9Var.c(org.telegram.messenger.id.M0(2131748291, null), G2, false, false);
            } else {
                w9Var.c(org.telegram.messenger.id.M0(2131748292, null), G2, false, false);
            }
            if (i22 == 12) {
                w9Var.setEnabled(!privacyControlActivity.F0());
                return;
            }
            return;
        }
        int i33 = 8;
        if (i23 == 1) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == privacyControlActivity.R) {
                z8Var.setText(org.telegram.messenger.id.M0(2131746750, null));
            } else {
                int i34 = privacyControlActivity.Q;
                if (i7 == i34 && i22 == 10) {
                    String M0 = org.telegram.messenger.id.M0(2131746808, null);
                    final int i35 = r9 ? 1 : 0;
                    z8Var.setText(org.telegram.messenger.g0.U2(M0, new Runnable(this) { // from class: org.telegram.ui.jt0
                        public final /* synthetic */ lt0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i36 = i35;
                            lt0 lt0Var = this.b;
                            switch (i36) {
                                case 0:
                                    lt0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity2 = lt0Var.d;
                                    privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new kt0(lt0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }));
                } else if (i7 == i34 && i22 == 8) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131746757, null));
                } else {
                    i11 = privacyControlActivity.setBirthdayRow;
                    if (i7 == i11) {
                        z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131746857, null), new Runnable(this) { // from class: org.telegram.ui.jt0
                            public final /* synthetic */ lt0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i36 = i25;
                                lt0 lt0Var = this.b;
                                switch (i36) {
                                    case 0:
                                        lt0Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity2 = lt0Var.d;
                                        privacyControlActivity2.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(privacyControlActivity2.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new kt0(lt0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i7 == privacyControlActivity.Q) {
                        if (i22 == 6) {
                            if (privacyControlActivity.J == 1 && privacyControlActivity.K == 1) {
                                z8Var.setText(org.telegram.messenger.id.M0(2131746787, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String i36 = rf.b.i("https://t.me/+", privacyControlActivity.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(i36);
                                spannableString.setSpan(new org.telegram.ui.Cells.h(i24, this, i36), 0, i36.length(), 33);
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131746789, null)).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.id.M0(2131746786, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                z8Var.setText(spannableStringBuilder);
                            }
                        } else if (i22 == 5) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746834, null));
                        } else if (i22 == 4) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746776, null));
                        } else if (i22 == 9) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746865, null));
                        } else if (i22 == 14) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746802, null));
                        } else if (i22 == 11) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746859, null));
                        } else if (i22 == 12) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746828, null));
                        } else if (i22 == 3) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746848, null));
                        } else if (i22 == 2) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131742879, null));
                        } else if (i22 == 1) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131742881, null));
                        } else {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751685, null));
                        }
                    } else if (i7 == privacyControlActivity.V) {
                        if (i22 == 6) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746788, null));
                        } else if (i22 == 5) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746833, null));
                        } else if (i22 == 4) {
                            int i37 = privacyControlActivity.J;
                            if (i37 == 2) {
                                z8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131746773, null)));
                            } else if (i37 == 0) {
                                z8Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131746775, null)));
                            } else {
                                z8Var.setText(org.telegram.messenger.id.M0(2131746774, null));
                            }
                        } else if (i22 == 3) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751683, null));
                        } else if (i22 == 9) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746866, null));
                        } else if (i22 == 14) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746803, null));
                        } else if (i22 == 11) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746858, null));
                        } else if (i22 == 2) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751686, null));
                        } else if (i22 == 1) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751681, null));
                        } else if (i22 == 12) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751682, null));
                        } else if (i22 == 8) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746756, null));
                        } else if (i22 == 10) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746747, null));
                        } else {
                            z8Var.setText(org.telegram.messenger.id.M0(2131751680, null));
                        }
                    } else if (i7 == privacyControlActivity.a0) {
                        z8Var.setText(org.telegram.messenger.id.M0(2131747266, null));
                    } else if (i7 == privacyControlActivity.e0) {
                        z8Var.setText(org.telegram.messenger.id.M0(2131749312, null));
                    } else if (i7 == privacyControlActivity.g0) {
                        z8Var.setText(org.telegram.messenger.id.M0(privacyControlActivity.getUserConfig().q() ? 2131746811 : 2131746812, null));
                    } else if (i7 == privacyControlActivity.k0) {
                        z8Var.setText(org.telegram.messenger.id.a0(null, null, 2131746745, hi.j.J0(privacyControlActivity.getMessagesController().J6), String.valueOf(((int) (((privacyControlActivity.M * (privacyControlActivity.getMessagesController().J6 / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().c6)) / 100.0d)));
                    } else if (i7 == privacyControlActivity.l0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_input_gift, 0);
                        wpVar.H = 0.583f;
                        wpVar.I = 0.583f;
                        spannableString2.setSpan(wpVar, 0, 1, 33);
                        z8Var.setText(org.telegram.messenger.id.V(null, null, 2131746826, spannableString2));
                    } else if (i7 == privacyControlActivity.r0) {
                        z8Var.setText(org.telegram.messenger.id.M0(2131746822, null));
                    }
                }
            }
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.a7, z8Var, null);
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 != privacyControlActivity.O) {
                if (i7 == privacyControlActivity.S) {
                    if (i22 == 10) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131746748, null));
                        return;
                    } else {
                        n4Var.setText(org.telegram.messenger.id.M0(2131754431, null));
                        return;
                    }
                }
                if (i7 == privacyControlActivity.b0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746798, null));
                    return;
                }
                if (i7 == privacyControlActivity.W) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746784, null));
                    return;
                }
                if (i7 == privacyControlActivity.i0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746746, null));
                    return;
                }
                i12 = privacyControlActivity.giftTypesHeaderRow;
                if (i7 == i12) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131746823, null));
                    return;
                }
                return;
            }
            if (i22 == 6) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746785, null));
                return;
            }
            if (i22 == 5) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746830, null));
                return;
            }
            if (i22 == 4) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746772, null));
                return;
            }
            if (i22 == 9) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746864, null));
                return;
            }
            if (i22 == 14) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746801, null));
                return;
            }
            if (i22 == 3) {
                n4Var.setText(org.telegram.messenger.id.M0(2131747754, null));
                return;
            }
            if (i22 == 2) {
                n4Var.setText(org.telegram.messenger.id.M0(2131742880, null));
                return;
            }
            if (i22 == 1) {
                n4Var.setText(org.telegram.messenger.id.M0(2131742882, null));
                return;
            }
            if (i22 == 8) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746754, null));
                return;
            }
            if (i22 == 10) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746807, null));
                return;
            }
            if (i22 == 11) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746854, null));
                return;
            } else if (i22 == 12) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746825, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.id.M0(2131749012, null));
                return;
            }
        }
        if (i23 != 3) {
            if (i23 != 8) {
                if (i23 != 9) {
                    return;
                }
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                i21 = privacyControlActivity.priceRow;
                if (i7 == i21) {
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{1, 10, 50, 100, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) privacyControlActivity.getMessagesController().I6);
                    ni0 ni0Var = new ni0(this, i33);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.c = a10;
                    s7Var.d = 20;
                    s7Var.e = ni0Var;
                    t7Var.d((int) Utilities.k(privacyControlActivity.M, privacyControlActivity.getMessagesController().I6, 1L), s7Var, new kt0(this, r9 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setCheckBoxIcon(0);
            i19 = privacyControlActivity.readRow;
            if (i7 == i19) {
                r8Var.f(org.telegram.messenger.id.M0(2131749313, null), privacyControlActivity.C0, false);
                return;
            }
            i20 = privacyControlActivity.showGiftIconRow;
            if (i7 == i20) {
                r8Var.f(org.telegram.messenger.id.M0(2131746827, null), privacyControlActivity.E0, false);
                return;
            }
            if (i7 == privacyControlActivity.m0) {
                r8Var.f(org.telegram.messenger.id.M0(2131746818, null), privacyControlActivity.G0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.G0) {
                    i26 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i7 == privacyControlActivity.n0) {
                r8Var.f(org.telegram.messenger.id.M0(2131746821, null), privacyControlActivity.I0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.I0) {
                    i27 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i7 == privacyControlActivity.o0) {
                r8Var.f(org.telegram.messenger.id.M0(2131746819, null), privacyControlActivity.K0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.K0) {
                    i28 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i7 == privacyControlActivity.p0) {
                r8Var.f(org.telegram.messenger.id.M0(2131746824, null), privacyControlActivity.M0, true);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.M0) {
                    i29 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i7 == privacyControlActivity.q0) {
                r8Var.f(org.telegram.messenger.id.M0(2131746820, null), privacyControlActivity.O0, false);
                if (!privacyControlActivity.getUserConfig().q() && privacyControlActivity.O0) {
                    i30 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i30);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
        i6Var.setRadioIcon(null);
        i13 = privacyControlActivity.everybodyRow;
        if (i7 != i13 && i7 != privacyControlActivity.P) {
            i18 = privacyControlActivity.nobodyRow;
            if (i7 != i18 && i7 != privacyControlActivity.h0) {
                if (i7 == privacyControlActivity.Y) {
                    i6Var.c(org.telegram.messenger.id.M0(2131749029, null), privacyControlActivity.K == 1, false);
                } else if (i7 == privacyControlActivity.X) {
                    i6Var.c(org.telegram.messenger.id.M0(2131749019, null), privacyControlActivity.K == 0, true);
                }
                if (i22 != 12) {
                    i6Var.b(null, !privacyControlActivity.F0());
                    return;
                }
                return;
            }
        }
        i14 = privacyControlActivity.everybodyRow;
        if (i7 == i14) {
            if (i22 == 3) {
                i6Var.c(org.telegram.messenger.id.M0(2131747753, null), privacyControlActivity.J == 0, true);
            } else {
                i6Var.c(org.telegram.messenger.id.M0(2131749019, null), privacyControlActivity.J == 0, true);
            }
        } else if (i7 == privacyControlActivity.P) {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q())) {
                i6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                String M02 = org.telegram.messenger.id.M0(2131747758, null);
                boolean z9 = privacyControlActivity.J == 2;
                i17 = privacyControlActivity.nobodyRow;
                i6Var.c(M02, z9, (i17 == -1 && privacyControlActivity.h0 == -1) ? false : true);
            } else if (i22 == 10) {
                String M03 = org.telegram.messenger.id.M0(2131746809, null);
                boolean z10 = privacyControlActivity.J == 2;
                i16 = privacyControlActivity.nobodyRow;
                i6Var.c(M03, z10, (i16 == -1 && privacyControlActivity.h0 == -1) ? false : true);
            } else {
                String M04 = org.telegram.messenger.id.M0(2131749029, null);
                boolean z11 = privacyControlActivity.J == 2;
                i15 = privacyControlActivity.nobodyRow;
                i6Var.c(M04, z11, (i15 == -1 && privacyControlActivity.h0 == -1) ? false : true);
            }
        } else if (i7 == privacyControlActivity.h0) {
            if (i22 == 10 && !privacyControlActivity.getUserConfig().q()) {
                i6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            i6Var.c(org.telegram.messenger.id.M0(2131746751, null), privacyControlActivity.J == 3, false);
        } else {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().q()) || (i22 == 10 && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q())) {
                i6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                i6Var.c(org.telegram.messenger.id.M0(2131747751, null), privacyControlActivity.J == 1, false);
            } else {
                i6Var.c(org.telegram.messenger.id.M0(2131749016, null), privacyControlActivity.J == 1, false);
            }
        }
        if (i22 != 12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.Cells.w9 w9Var;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                w9Var2.setCanDisable(true);
                w9Var = w9Var2;
                z8Var = w9Var;
                break;
            case 1:
                z8Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                z8Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 3:
                z8Var = new org.telegram.ui.Cells.i6(context, null);
                break;
            case 4:
                z8Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                z8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(privacyControlActivity.getParentActivity());
                privacyControlActivity.v0 = m8Var;
                if (privacyControlActivity.y0 == null) {
                    m8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.id.a0(null, null, 2131745517, new Object[0]), false);
                } else {
                    m8Var.o(R.drawable.msg_addphoto, org.telegram.messenger.id.a0("UpdatePhotoForRest", null, 2131743817, new Object[0]), true);
                }
                privacyControlActivity.v0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
                privacyControlActivity.v0.g(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                privacyControlActivity.u0 = new org.telegram.ui.Components.ah0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.v0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.v0.e.setAnimation(privacyControlActivity.u0);
                z8Var = privacyControlActivity.v0;
                break;
            case 7:
                privacyControlActivity.w0 = new org.telegram.ui.Components.l9(privacyControlActivity.getParentActivity());
                privacyControlActivity.x0 = new nr(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.y0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.z0;
                    if (photo != null) {
                        org.telegram.ui.Components.l9 l9Var = privacyControlActivity.w0;
                        org.telegram.messenger.hc i12 = org.telegram.messenger.hc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
                        l9Var.j(i12, "50_50", null, org.telegram.messenger.p10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.l9 l9Var2 = privacyControlActivity.w0;
                        org.telegram.messenger.hc e10 = org.telegram.messenger.hc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
                        l9Var2.j(e10, "50_50", null, org.telegram.messenger.p10.i(i10).f());
                    }
                }
                privacyControlActivity.x0.addView(privacyControlActivity.w0, c8.ha.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.x0.k(org.telegram.messenger.id.M0(2131746289, null), false);
                privacyControlActivity.x0.getImageView().setVisibility(0);
                privacyControlActivity.x0.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
                nr nrVar = privacyControlActivity.x0;
                int i13 = org.telegram.ui.ActionBar.l6.p7;
                nrVar.g(i13, i13);
                z8Var = privacyControlActivity.x0;
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.r8(context, g6Var);
                break;
            case 9:
                g6Var2 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.t7(context, g6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                g6Var3 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                fi.d dVar = new fi.d(context, g6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131746752, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new i40(this, 26));
                frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 18.0f, 0.0f, 18.0f, 16.0f));
                w9Var = frameLayout;
                z8Var = w9Var;
                break;
        }
        return new org.telegram.ui.Components.yi0(z8Var);
    }
}
