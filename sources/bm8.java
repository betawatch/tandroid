// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bm8 extends q59 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public bm8(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = u69Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b == privacyControlActivity.d0) {
            i7 = ((d) privacyControlActivity).currentAccount;
            if (!bw2.r(i7).t(3)) {
                return true;
            }
        }
        i = privacyControlActivity.currentPhotoForRestRow;
        if (b == i || b == privacyControlActivity.b0) {
            return true;
        }
        i2 = privacyControlActivity.photoForRestRow;
        if (b == i2) {
            return true;
        }
        i3 = privacyControlActivity.readRow;
        if (b == i3) {
            return true;
        }
        i4 = privacyControlActivity.showGiftIconRow;
        if (b == i4 || b == privacyControlActivity.g0 || b == privacyControlActivity.p0 || b == privacyControlActivity.q0 || b == privacyControlActivity.r0 || b == privacyControlActivity.o0 || b == privacyControlActivity.n0) {
            return true;
        }
        if (privacyControlActivity.E == 12 && privacyControlActivity.y0()) {
            return false;
        }
        i5 = privacyControlActivity.nobodyRow;
        if (b == i5 || b == privacyControlActivity.Q || b == privacyControlActivity.i0) {
            return true;
        }
        i6 = privacyControlActivity.everybodyRow;
        return b == i6 || b == privacyControlActivity.V || b == privacyControlActivity.U;
    }

    public final int E(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (longValue > 0) {
                i++;
            } else {
                TLRPC.Chat L0 = this.d.getMessagesController().L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    i += L0.participants_count;
                }
            }
        }
        return i;
    }

    @Override // y59
    public final int b() {
        return this.d.t0;
    }

    @Override // y59
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
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i == privacyControlActivity.U || i == privacyControlActivity.V || i == privacyControlActivity.d0 || i == privacyControlActivity.g0) {
            return 0;
        }
        if (i == privacyControlActivity.W || i == privacyControlActivity.R || i == privacyControlActivity.S || i == privacyControlActivity.l0 || i == privacyControlActivity.e0 || i == privacyControlActivity.b0 || i == privacyControlActivity.f0 || i == privacyControlActivity.h0) {
            return 1;
        }
        i2 = privacyControlActivity.setBirthdayRow;
        if (i == i2 || i == privacyControlActivity.m0 || i == privacyControlActivity.s0) {
            return 1;
        }
        if (i == privacyControlActivity.P || i == privacyControlActivity.j0 || i == privacyControlActivity.T || i == privacyControlActivity.c0 || i == privacyControlActivity.X) {
            return 2;
        }
        i3 = privacyControlActivity.giftTypesHeaderRow;
        if (i == i3) {
            return 2;
        }
        i4 = privacyControlActivity.everybodyRow;
        if (i == i4 || i == privacyControlActivity.Q) {
            return 3;
        }
        i5 = privacyControlActivity.nobodyRow;
        if (i == i5 || i == privacyControlActivity.i0 || i == privacyControlActivity.Y || i == privacyControlActivity.Z) {
            return 3;
        }
        if (i == privacyControlActivity.O) {
            return 4;
        }
        if (i == privacyControlActivity.a0) {
            return 5;
        }
        i6 = privacyControlActivity.photoForRestRow;
        if (i == i6) {
            return 6;
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (i == i7) {
            return 7;
        }
        i8 = privacyControlActivity.readRow;
        if (i == i8) {
            return 8;
        }
        i9 = privacyControlActivity.showGiftIconRow;
        if (i == i9 || i == privacyControlActivity.p0 || i == privacyControlActivity.q0 || i == privacyControlActivity.r0 || i == privacyControlActivity.n0 || i == privacyControlActivity.o0) {
            return 8;
        }
        i10 = privacyControlActivity.priceRow;
        if (i == i10) {
            return 9;
        }
        return i == privacyControlActivity.k0 ? 10 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0235, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x031b, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
        int i15 = u69Var.f;
        final byte b = 1;
        r14 = 0;
        int i16 = 0;
        r14 = 0;
        int i17 = 0;
        r14 = 0;
        int i18 = 0;
        r14 = 0;
        int i19 = 0;
        r14 = 0;
        int i20 = 0;
        if (i15 == 0) {
            vkb vkbVar = (vkb) u69Var.a;
            anb.X(vkbVar.getTextView(), cmb.F6, this.d.getResourceProvider());
            PrivacyControlActivity privacyControlActivity = this.d;
            if (i == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? jb6.G(E(this.d.I), "Users", new Object[0]) : jb6.M0(2131751098, null);
                PrivacyControlActivity privacyControlActivity2 = this.d;
                if (privacyControlActivity2.F[privacyControlActivity2.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity2.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? jb6.a0(null, null, 2131746515, new Object[0]) : jb6.a0(null, null, 2131746514, G);
                }
                PrivacyControlActivity privacyControlActivity3 = this.d;
                if (privacyControlActivity3.E != 10) {
                    boolean[] zArr = privacyControlActivity3.G;
                    byte b2 = privacyControlActivity3.K;
                    if (zArr[b2] && b2 != 0) {
                        ArrayList arrayList2 = privacyControlActivity3.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? jb6.a0(null, null, 2131746502, new Object[0]) : jb6.a0(null, null, 2131746501, G);
                    }
                }
                int i21 = this.d.E;
                if (i21 == 10) {
                    vkbVar.c(jb6.M0(2131746484, null), G, false, false);
                } else if (i21 == 0 || i21 == 4 || i21 == 9 || i21 == 14) {
                    vkbVar.c(jb6.M0(2131754233, null), G, false, this.d.V != -1);
                } else {
                    vkbVar.c(jb6.M0(2131754234, null), G, false, this.d.V != -1);
                }
                if (this.d.E == 12) {
                    vkbVar.setEnabled(!r0.y0());
                    return;
                }
                return;
            }
            if (i != privacyControlActivity.V) {
                if (i == privacyControlActivity.d0) {
                    i2 = ((d) privacyControlActivity).currentAccount;
                    vkbVar.c(jb6.M0(2131746534, null), bw2.r(i2).t(3) ? jb6.M0(2131748536, null) : PrivacySettingsActivity.A0(this.d.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i == privacyControlActivity.g0) {
                        vkbVar.b(jb6.M0(privacyControlActivity.getUserConfig().p() ? 2131746548 : 2131746549, null), false);
                        anb.X(vkbVar.getTextView(), cmb.m6, this.d.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? jb6.G(E(this.d.J), "Users", new Object[0]) : jb6.M0(2131751098, null);
            PrivacyControlActivity privacyControlActivity4 = this.d;
            boolean[] zArr2 = privacyControlActivity4.G;
            byte b3 = privacyControlActivity4.K;
            if (zArr2[b3] && b3 == 0) {
                ArrayList arrayList3 = privacyControlActivity4.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? jb6.a0(null, null, 2131746502, new Object[0]) : jb6.a0(null, null, 2131746501, G2);
            }
            int i22 = this.d.E;
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                vkbVar.c(jb6.M0(2131748048, null), G2, false, false);
            } else {
                vkbVar.c(jb6.M0(2131748049, null), G2, false, false);
            }
            if (this.d.E == 12) {
                vkbVar.setEnabled(!r0.y0());
                return;
            }
            return;
        }
        if (i15 == 1) {
            njb njbVar = (njb) u69Var.a;
            PrivacyControlActivity privacyControlActivity5 = this.d;
            if (i == privacyControlActivity5.S) {
                njbVar.setText(jb6.M0(2131746485, null));
            } else {
                if (i == privacyControlActivity5.R) {
                    int i23 = privacyControlActivity5.E;
                    if (i23 == 10) {
                        String M0 = jb6.M0(2131746543, null);
                        final byte b4 = r14 ? (byte) 1 : (byte) 0;
                        njbVar.setText(gm.N2(M0, -1, 0, new Runnable(this) { // from class: zl8
                            public final /* synthetic */ bm8 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                bm8 bm8Var = this.b;
                                switch (b5) {
                                    case 0:
                                        bm8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity6 = bm8Var.d;
                                        privacyControlActivity6.showDialog((my0) ik.l(privacyControlActivity6.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), null, new am8(bm8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }, null));
                    } else if (i23 == 8) {
                        njbVar.setText(jb6.M0(2131746492, null));
                    }
                }
                i3 = privacyControlActivity5.setBirthdayRow;
                if (i == i3) {
                    njbVar.setText(gm.D2(gm.N2(jb6.M0(2131746592, null), -1, 0, new Runnable(this) { // from class: zl8
                        public final /* synthetic */ bm8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b;
                            bm8 bm8Var = this.b;
                            switch (b5) {
                                case 0:
                                    bm8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity6 = bm8Var.d;
                                    privacyControlActivity6.showDialog((my0) ik.l(privacyControlActivity6.getParentActivity(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), null, new am8(bm8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).b);
                                    break;
                            }
                        }
                    }, null), true));
                } else {
                    PrivacyControlActivity privacyControlActivity6 = this.d;
                    if (i == privacyControlActivity6.R) {
                        int i24 = privacyControlActivity6.E;
                        if (i24 == 6) {
                            if (privacyControlActivity6.K == 1 && privacyControlActivity6.L == 1) {
                                njbVar.setText(jb6.M0(2131746522, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String concat = "https://t.me/+".concat(this.d.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(concat);
                                spannableString.setSpan(new q1(this, concat, (byte) 7), 0, concat.length(), 33);
                                spannableStringBuilder.append((CharSequence) jb6.M0(2131746524, null)).append((CharSequence) "\n\n").append((CharSequence) jb6.M0(2131746521, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                njbVar.setText(spannableStringBuilder);
                            }
                        } else if (i24 == 5) {
                            njbVar.setText(jb6.M0(2131746569, null));
                        } else if (i24 == 4) {
                            njbVar.setText(jb6.M0(2131746511, null));
                        } else if (i24 == 9) {
                            njbVar.setText(jb6.M0(2131746600, null));
                        } else if (i24 == 14) {
                            njbVar.setText(jb6.M0(2131746537, null));
                        } else if (i24 == 11) {
                            njbVar.setText(jb6.M0(2131746594, null));
                        } else if (i24 == 12) {
                            njbVar.setText(jb6.M0(2131746563, null));
                        } else if (i24 == 3) {
                            njbVar.setText(jb6.M0(2131746583, null));
                        } else if (i24 == 2) {
                            njbVar.setText(jb6.M0(2131742542, null));
                        } else if (i24 == 1) {
                            njbVar.setText(jb6.M0(2131742544, null));
                        } else {
                            njbVar.setText(jb6.M0(2131751622, null));
                        }
                    } else if (i == privacyControlActivity6.W) {
                        int i25 = privacyControlActivity6.E;
                        if (i25 == 6) {
                            njbVar.setText(jb6.M0(2131746523, null));
                        } else if (i25 == 5) {
                            njbVar.setText(jb6.M0(2131746568, null));
                        } else if (i25 == 4) {
                            byte b5 = privacyControlActivity6.K;
                            if (b5 == 2) {
                                njbVar.setText(gm.S2(jb6.M0(2131746508, null)));
                            } else if (b5 == 0) {
                                njbVar.setText(gm.S2(jb6.M0(2131746510, null)));
                            } else {
                                njbVar.setText(jb6.M0(2131746509, null));
                            }
                        } else if (i25 == 3) {
                            njbVar.setText(jb6.M0(2131751620, null));
                        } else if (i25 == 9) {
                            njbVar.setText(jb6.M0(2131746601, null));
                        } else if (i25 == 14) {
                            njbVar.setText(jb6.M0(2131746538, null));
                        } else if (i25 == 11) {
                            njbVar.setText(jb6.M0(2131746593, null));
                        } else if (i25 == 2) {
                            njbVar.setText(jb6.M0(2131751623, null));
                        } else if (i25 == 1) {
                            njbVar.setText(jb6.M0(2131751618, null));
                        } else if (i25 == 12) {
                            njbVar.setText(jb6.M0(2131751619, null));
                        } else if (i25 == 8) {
                            njbVar.setText(jb6.M0(2131746491, null));
                        } else if (i25 == 10) {
                            njbVar.setText(jb6.M0(2131746482, null));
                        } else {
                            njbVar.setText(jb6.M0(2131751617, null));
                        }
                    } else if (i == privacyControlActivity6.b0) {
                        njbVar.setText(jb6.M0(2131746999, null));
                    } else if (i == privacyControlActivity6.f0) {
                        njbVar.setText(jb6.M0(2131749069, null));
                    } else if (i == privacyControlActivity6.h0) {
                        njbVar.setText(jb6.M0(privacyControlActivity6.getUserConfig().p() ? 2131746546 : 2131746547, null));
                    } else if (i == privacyControlActivity6.l0) {
                        float f = privacyControlActivity6.getMessagesController().l4.I1.f() / 1000.0f;
                        PrivacyControlActivity privacyControlActivity7 = this.d;
                        njbVar.setText(jb6.a0(null, null, 2131746480, bc.J0(this.d.getMessagesController().l4.I1.f()), String.valueOf(((int) (((privacyControlActivity7.N * f) / 1000.0d) * privacyControlActivity7.getMessagesController().l4.s3.i)) / 100.0d)));
                    } else if (i == privacyControlActivity6.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        pn2 pn2Var = new pn2(R.drawable.msg_input_gift, 0);
                        pn2Var.I = 0.583f;
                        pn2Var.J = 0.583f;
                        spannableString2.setSpan(pn2Var, 0, 1, 33);
                        njbVar.setText(jb6.V(null, null, 2131746561, spannableString2));
                    } else if (i == privacyControlActivity6.s0) {
                        njbVar.setText(jb6.M0(2131746557, null));
                    }
                }
            }
            anb.h(cmb.Z6, null, njbVar);
            return;
        }
        if (i15 == 2) {
            jf5 jf5Var = (jf5) u69Var.a;
            PrivacyControlActivity privacyControlActivity8 = this.d;
            if (i != privacyControlActivity8.P) {
                if (i == privacyControlActivity8.T) {
                    if (privacyControlActivity8.E == 10) {
                        jf5Var.setText(jb6.M0(2131746483, null));
                        return;
                    } else {
                        jf5Var.setText(jb6.M0(2131754428, null));
                        return;
                    }
                }
                if (i == privacyControlActivity8.c0) {
                    jf5Var.setText(jb6.M0(2131746533, null));
                    return;
                }
                if (i == privacyControlActivity8.X) {
                    jf5Var.setText(jb6.M0(2131746519, null));
                    return;
                }
                if (i == privacyControlActivity8.j0) {
                    jf5Var.setText(jb6.M0(2131746481, null));
                    return;
                }
                i4 = privacyControlActivity8.giftTypesHeaderRow;
                if (i == i4) {
                    jf5Var.setText(jb6.M0(2131746558, null));
                    return;
                }
                return;
            }
            int i26 = privacyControlActivity8.E;
            if (i26 == 6) {
                jf5Var.setText(jb6.M0(2131746520, null));
                return;
            }
            if (i26 == 5) {
                jf5Var.setText(jb6.M0(2131746565, null));
                return;
            }
            if (i26 == 4) {
                jf5Var.setText(jb6.M0(2131746507, null));
                return;
            }
            if (i26 == 9) {
                jf5Var.setText(jb6.M0(2131746599, null));
                return;
            }
            if (i26 == 14) {
                jf5Var.setText(jb6.M0(2131746536, null));
                return;
            }
            if (i26 == 3) {
                jf5Var.setText(jb6.M0(2131747487, null));
                return;
            }
            if (i26 == 2) {
                jf5Var.setText(jb6.M0(2131742543, null));
                return;
            }
            if (i26 == 1) {
                jf5Var.setText(jb6.M0(2131742545, null));
                return;
            }
            if (i26 == 8) {
                jf5Var.setText(jb6.M0(2131746489, null));
                return;
            }
            if (i26 == 10) {
                jf5Var.setText(jb6.M0(2131746542, null));
                return;
            }
            if (i26 == 11) {
                jf5Var.setText(jb6.M0(2131746589, null));
                return;
            } else if (i26 == 12) {
                jf5Var.setText(jb6.M0(2131746560, null));
                return;
            } else {
                jf5Var.setText(jb6.M0(2131748769, null));
                return;
            }
        }
        if (i15 != 3) {
            if (i15 != 8) {
                if (i15 == 9) {
                    jla jlaVar = (jla) u69Var.a;
                    i14 = this.d.priceRow;
                    if (i == i14) {
                        int[] a = jla.a(new int[]{1, 10, 50, 100, nm7.d3, nm7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) this.d.getMessagesController().l4.H1.f());
                        h68 h68Var = new h68(this, (byte) 12);
                        ila ilaVar = new ila();
                        ilaVar.c = a;
                        ilaVar.d = (byte) 20;
                        ilaVar.e = h68Var;
                        PrivacyControlActivity privacyControlActivity9 = this.d;
                        jlaVar.d((int) Utilities.k(privacyControlActivity9.N, privacyControlActivity9.getMessagesController().l4.H1.f(), 1L), ilaVar, new am8(this, r14 ? (byte) 1 : (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            }
            bjb bjbVar = (bjb) u69Var.a;
            bjbVar.setCheckBoxIcon(0);
            i12 = this.d.readRow;
            if (i == i12) {
                bjbVar.f(jb6.M0(2131749070, null), this.d.D0, false);
                return;
            }
            i13 = this.d.showGiftIconRow;
            if (i == i13) {
                bjbVar.f(jb6.M0(2131746562, null), this.d.F0, false);
                return;
            }
            PrivacyControlActivity privacyControlActivity10 = this.d;
            if (i == privacyControlActivity10.n0) {
                bjbVar.f(jb6.M0(2131746553, null), this.d.H0, true);
                if (!this.d.getUserConfig().p() && this.d.H0) {
                    i16 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i16);
                return;
            }
            if (i == privacyControlActivity10.o0) {
                bjbVar.f(jb6.M0(2131746556, null), this.d.J0, true);
                if (!this.d.getUserConfig().p() && this.d.J0) {
                    i17 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i17);
                return;
            }
            if (i == privacyControlActivity10.p0) {
                bjbVar.f(jb6.M0(2131746554, null), this.d.L0, true);
                if (!this.d.getUserConfig().p() && this.d.L0) {
                    i18 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i18);
                return;
            }
            if (i == privacyControlActivity10.q0) {
                bjbVar.f(jb6.M0(2131746559, null), this.d.N0, true);
                if (!this.d.getUserConfig().p() && this.d.N0) {
                    i19 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i19);
                return;
            }
            if (i == privacyControlActivity10.r0) {
                bjbVar.f(jb6.M0(2131746555, null), this.d.P0, false);
                if (!this.d.getUserConfig().p() && this.d.P0) {
                    i20 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i20);
                return;
            }
            return;
        }
        w09 w09Var = (w09) u69Var.a;
        w09Var.setRadioIcon(null);
        i5 = this.d.everybodyRow;
        if (i != i5) {
            PrivacyControlActivity privacyControlActivity11 = this.d;
            if (i != privacyControlActivity11.Q) {
                i11 = privacyControlActivity11.nobodyRow;
                if (i != i11) {
                    PrivacyControlActivity privacyControlActivity12 = this.d;
                    if (i != privacyControlActivity12.i0) {
                        if (i == privacyControlActivity12.Z) {
                            w09Var.c(jb6.M0(2131748786, null), this.d.L == 1, false);
                        } else if (i == privacyControlActivity12.Y) {
                            w09Var.c(jb6.M0(2131748776, null), this.d.L == 0, true);
                        }
                        if (this.d.E != 12) {
                            w09Var.b(null, !r0.y0());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        i6 = this.d.everybodyRow;
        PrivacyControlActivity privacyControlActivity13 = this.d;
        if (i == i6) {
            if (privacyControlActivity13.E == 3) {
                w09Var.c(jb6.M0(2131747486, null), this.d.K == 0, true);
            } else {
                w09Var.c(jb6.M0(2131748776, null), this.d.K == 0, true);
            }
        } else if (i == privacyControlActivity13.Q) {
            if (privacyControlActivity13.E != 8 || privacyControlActivity13.getUserConfig().p()) {
                PrivacyControlActivity privacyControlActivity14 = this.d;
                if (privacyControlActivity14.E == 10) {
                    if (!privacyControlActivity14.getMessagesController().l4.n2.f) {
                    }
                }
                i7 = this.d.E;
                if (i7 != 3) {
                    String M02 = jb6.M0(2131747491, null);
                    PrivacyControlActivity privacyControlActivity15 = this.d;
                    boolean z = privacyControlActivity15.K == 2;
                    i10 = privacyControlActivity15.nobodyRow;
                    w09Var.c(M02, z, (i10 == -1 && this.d.i0 == -1) ? false : true);
                } else if (i7 == 10) {
                    String M03 = jb6.M0(2131746544, null);
                    PrivacyControlActivity privacyControlActivity16 = this.d;
                    boolean z2 = privacyControlActivity16.K == 2;
                    i9 = privacyControlActivity16.nobodyRow;
                    w09Var.c(M03, z2, (i9 == -1 && this.d.i0 == -1) ? false : true);
                } else {
                    String M04 = jb6.M0(2131748786, null);
                    PrivacyControlActivity privacyControlActivity17 = this.d;
                    boolean z3 = privacyControlActivity17.K == 2;
                    i8 = privacyControlActivity17.nobodyRow;
                    w09Var.c(M04, z3, (i8 == -1 && this.d.i0 == -1) ? false : true);
                }
            }
            w09Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            i7 = this.d.E;
            if (i7 != 3) {
            }
        } else {
            int i27 = privacyControlActivity13.i0;
            int i28 = privacyControlActivity13.E;
            if (i == i27) {
                if (i28 == 10 && !privacyControlActivity13.getUserConfig().p()) {
                    w09Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                }
                w09Var.c(jb6.M0(2131746486, null), this.d.K == 3, false);
            } else {
                if (i28 != 8 || privacyControlActivity13.getUserConfig().p()) {
                    PrivacyControlActivity privacyControlActivity18 = this.d;
                    if (privacyControlActivity18.E == 10) {
                        if (!privacyControlActivity18.getMessagesController().l4.n2.f) {
                        }
                    }
                    if (this.d.E != 3) {
                        w09Var.c(jb6.M0(2131747484, null), this.d.K == 1, false);
                    } else {
                        w09Var.c(jb6.M0(2131748773, null), this.d.K == 1, false);
                    }
                }
                w09Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                if (this.d.E != 3) {
                }
            }
        }
        if (this.d.E != 12) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i) {
            case 0:
                vkb vkbVar = new vkb(context);
                vkbVar.setCanDisable(true);
                view = vkbVar;
                break;
            case 1:
                view = new njb(context);
                break;
            case 2:
                view = new jf5(context);
                break;
            case 3:
                view = new w09(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new bba(context, (hg9) null);
                break;
            case 6:
                xib xibVar = new xib(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = xibVar;
                if (privacyControlActivity.z0 == null) {
                    xibVar.o(R.drawable.msg_addphoto, jb6.a0(null, null, 2131745251, new Object[0]), false);
                } else {
                    xibVar.o(R.drawable.msg_addphoto, jb6.a0("UpdatePhotoForRest", null, 2131743504, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(cmb.L0(false));
                privacyControlActivity.w0.g(cmb.u6, cmb.t6);
                privacyControlActivity.v0 = new p09(R.raw.camera_outline, gm.L(50.0f), gm.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-gm.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                view = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new bf0(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new ru2(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    bf0 bf0Var = privacyControlActivity.x0;
                    if (photo != null) {
                        gn5 i4 = gn5.i(photoSize, photo);
                        i3 = ((d) privacyControlActivity).currentAccount;
                        bf0Var.m(i4, "50_50", null, z8c.h(i3).f());
                    } else {
                        gn5 e = gn5.e(photoSize.location);
                        i2 = ((d) privacyControlActivity).currentAccount;
                        bf0Var.m(e, "50_50", null, z8c.h(i2).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, qoe.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(jb6.M0(2131746022, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(cmb.L0(false));
                ru2 ru2Var = privacyControlActivity.y0;
                int i5 = cmb.o7;
                ru2Var.g(i5, i5);
                view = privacyControlActivity.y0;
                break;
            case 8:
                ylbVar = ((d) privacyControlActivity).resourceProvider;
                view = new bjb(context, ylbVar);
                break;
            case 9:
                ylbVar2 = ((d) privacyControlActivity).resourceProvider;
                view = new jla(context, ylbVar2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                ylbVar3 = ((d) privacyControlActivity).resourceProvider;
                b61 b61Var = new b61(ylbVar3, context, true);
                b61Var.setRoundRadius(24);
                pn2 pn2Var = new pn2(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131746487, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                b61Var.i(spannableStringBuilder, false, true);
                b61Var.setOnClickListener(new wk8(this, (byte) 1));
                frameLayout.addView(b61Var, qoe.d(-1, 48.0f, nm7.D1, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new b59(view);
    }
}
