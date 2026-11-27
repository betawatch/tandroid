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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mn8 extends c79 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public mn8(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = f89Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b == privacyControlActivity.d0) {
            i7 = ((e) privacyControlActivity).currentAccount;
            if (!lv2.r(i7).t(3)) {
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
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i += M0.participants_count;
                }
            }
        }
        return i;
    }

    @Override // j79
    public final int b() {
        return this.d.t0;
    }

    @Override // j79
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

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0237, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x031d, code lost:
    
        if (r16.d.getUserConfig().p() == false) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
        int i15 = f89Var.f;
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
            qmb qmbVar = (qmb) f89Var.a;
            yob.X(qmbVar.getTextView(), aob.G6, this.d.getResourceProvider());
            PrivacyControlActivity privacyControlActivity = this.d;
            if (i == privacyControlActivity.U) {
                String G = privacyControlActivity.I.size() != 0 ? ob6.G(E(this.d.I), "Users", new Object[0]) : ob6.M0(2131751126, null);
                PrivacyControlActivity privacyControlActivity2 = this.d;
                if (privacyControlActivity2.F[privacyControlActivity2.K == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity2.I;
                    G = (arrayList == null || arrayList.isEmpty()) ? ob6.a0(null, null, 2131746509, new Object[0]) : ob6.a0(null, null, 2131746508, G);
                }
                PrivacyControlActivity privacyControlActivity3 = this.d;
                if (privacyControlActivity3.E != 10) {
                    boolean[] zArr = privacyControlActivity3.G;
                    byte b2 = privacyControlActivity3.K;
                    if (zArr[b2] && b2 != 0) {
                        ArrayList arrayList2 = privacyControlActivity3.I;
                        G = (arrayList2 == null || arrayList2.isEmpty()) ? ob6.a0(null, null, 2131746496, new Object[0]) : ob6.a0(null, null, 2131746495, G);
                    }
                }
                int i21 = this.d.E;
                if (i21 == 10) {
                    qmbVar.c(ob6.M0(2131746478, null), G, false, false);
                } else if (i21 == 0 || i21 == 4 || i21 == 9 || i21 == 14) {
                    qmbVar.c(ob6.M0(2131754261, null), G, false, this.d.V != -1);
                } else {
                    qmbVar.c(ob6.M0(2131754262, null), G, false, this.d.V != -1);
                }
                if (this.d.E == 12) {
                    qmbVar.setEnabled(!r0.y0());
                    return;
                }
                return;
            }
            if (i != privacyControlActivity.V) {
                if (i == privacyControlActivity.d0) {
                    i2 = ((e) privacyControlActivity).currentAccount;
                    qmbVar.c(ob6.M0(2131746528, null), lv2.r(i2).t(3) ? ob6.M0(2131748533, null) : PrivacySettingsActivity.A0(this.d.getAccountInstance(), 3), false, false);
                    return;
                } else {
                    if (i == privacyControlActivity.g0) {
                        qmbVar.b(ob6.M0(privacyControlActivity.getUserConfig().p() ? 2131746542 : 2131746543, null), false);
                        yob.X(qmbVar.getTextView(), aob.n6, this.d.getResourceProvider());
                        return;
                    }
                    return;
                }
            }
            String G2 = privacyControlActivity.J.size() != 0 ? ob6.G(E(this.d.J), "Users", new Object[0]) : ob6.M0(2131751126, null);
            PrivacyControlActivity privacyControlActivity4 = this.d;
            boolean[] zArr2 = privacyControlActivity4.G;
            byte b3 = privacyControlActivity4.K;
            if (zArr2[b3] && b3 == 0) {
                ArrayList arrayList3 = privacyControlActivity4.J;
                G2 = (arrayList3 == null || arrayList3.isEmpty()) ? ob6.a0(null, null, 2131746496, new Object[0]) : ob6.a0(null, null, 2131746495, G2);
            }
            int i22 = this.d.E;
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                qmbVar.c(ob6.M0(2131748045, null), G2, false, false);
            } else {
                qmbVar.c(ob6.M0(2131748046, null), G2, false, false);
            }
            if (this.d.E == 12) {
                qmbVar.setEnabled(!r0.y0());
                return;
            }
            return;
        }
        if (i15 == 1) {
            ilb ilbVar = (ilb) f89Var.a;
            PrivacyControlActivity privacyControlActivity5 = this.d;
            if (i == privacyControlActivity5.S) {
                ilbVar.setText(ob6.M0(2131746479, null));
            } else {
                if (i == privacyControlActivity5.R) {
                    int i23 = privacyControlActivity5.E;
                    if (i23 == 10) {
                        String M0 = ob6.M0(2131746537, null);
                        final byte b4 = r14 ? (byte) 1 : (byte) 0;
                        ilbVar.setText(hl.N2(M0, -1, 0, new Runnable(this) { // from class: kn8
                            public final /* synthetic */ mn8 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                mn8 mn8Var = this.b;
                                switch (b5) {
                                    case 0:
                                        mn8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity privacyControlActivity6 = mn8Var.d;
                                        privacyControlActivity6.showDialog((nx0) jj.l(privacyControlActivity6.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), null, new ln8(mn8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).b);
                                        break;
                                }
                            }
                        }, null));
                    } else if (i23 == 8) {
                        ilbVar.setText(ob6.M0(2131746486, null));
                    }
                }
                i3 = privacyControlActivity5.setBirthdayRow;
                if (i == i3) {
                    ilbVar.setText(hl.D2(hl.N2(ob6.M0(2131746586, null), -1, 0, new Runnable(this) { // from class: kn8
                        public final /* synthetic */ mn8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b5 = b;
                            mn8 mn8Var = this.b;
                            switch (b5) {
                                case 0:
                                    mn8Var.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    PrivacyControlActivity privacyControlActivity6 = mn8Var.d;
                                    privacyControlActivity6.showDialog((nx0) jj.l(privacyControlActivity6.getParentActivity(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), null, new ln8(mn8Var, (byte) 1), null, false, false, privacyControlActivity6.getResourceProvider()).b);
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
                                ilbVar.setText(ob6.M0(2131746516, null));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String concat = "https://t.me/+".concat(this.d.getUserConfig().d());
                                SpannableString spannableString = new SpannableString(concat);
                                spannableString.setSpan(new r1(this, concat, (byte) 7), 0, concat.length(), 33);
                                spannableStringBuilder.append((CharSequence) ob6.M0(2131746518, null)).append((CharSequence) "\n\n").append((CharSequence) ob6.M0(2131746515, null)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                ilbVar.setText(spannableStringBuilder);
                            }
                        } else if (i24 == 5) {
                            ilbVar.setText(ob6.M0(2131746563, null));
                        } else if (i24 == 4) {
                            ilbVar.setText(ob6.M0(2131746505, null));
                        } else if (i24 == 9) {
                            ilbVar.setText(ob6.M0(2131746594, null));
                        } else if (i24 == 14) {
                            ilbVar.setText(ob6.M0(2131746531, null));
                        } else if (i24 == 11) {
                            ilbVar.setText(ob6.M0(2131746588, null));
                        } else if (i24 == 12) {
                            ilbVar.setText(ob6.M0(2131746557, null));
                        } else if (i24 == 3) {
                            ilbVar.setText(ob6.M0(2131746577, null));
                        } else if (i24 == 2) {
                            ilbVar.setText(ob6.M0(2131742510, null));
                        } else if (i24 == 1) {
                            ilbVar.setText(ob6.M0(2131742512, null));
                        } else {
                            ilbVar.setText(ob6.M0(2131751650, null));
                        }
                    } else if (i == privacyControlActivity6.W) {
                        int i25 = privacyControlActivity6.E;
                        if (i25 == 6) {
                            ilbVar.setText(ob6.M0(2131746517, null));
                        } else if (i25 == 5) {
                            ilbVar.setText(ob6.M0(2131746562, null));
                        } else if (i25 == 4) {
                            byte b5 = privacyControlActivity6.K;
                            if (b5 == 2) {
                                ilbVar.setText(hl.S2(ob6.M0(2131746502, null)));
                            } else if (b5 == 0) {
                                ilbVar.setText(hl.S2(ob6.M0(2131746504, null)));
                            } else {
                                ilbVar.setText(ob6.M0(2131746503, null));
                            }
                        } else if (i25 == 3) {
                            ilbVar.setText(ob6.M0(2131751648, null));
                        } else if (i25 == 9) {
                            ilbVar.setText(ob6.M0(2131746595, null));
                        } else if (i25 == 14) {
                            ilbVar.setText(ob6.M0(2131746532, null));
                        } else if (i25 == 11) {
                            ilbVar.setText(ob6.M0(2131746587, null));
                        } else if (i25 == 2) {
                            ilbVar.setText(ob6.M0(2131751651, null));
                        } else if (i25 == 1) {
                            ilbVar.setText(ob6.M0(2131751646, null));
                        } else if (i25 == 12) {
                            ilbVar.setText(ob6.M0(2131751647, null));
                        } else if (i25 == 8) {
                            ilbVar.setText(ob6.M0(2131746485, null));
                        } else if (i25 == 10) {
                            ilbVar.setText(ob6.M0(2131746476, null));
                        } else {
                            ilbVar.setText(ob6.M0(2131751645, null));
                        }
                    } else if (i == privacyControlActivity6.b0) {
                        ilbVar.setText(ob6.M0(2131746993, null));
                    } else if (i == privacyControlActivity6.f0) {
                        ilbVar.setText(ob6.M0(2131749066, null));
                    } else if (i == privacyControlActivity6.h0) {
                        ilbVar.setText(ob6.M0(privacyControlActivity6.getUserConfig().p() ? 2131746540 : 2131746541, null));
                    } else if (i == privacyControlActivity6.l0) {
                        float f = privacyControlActivity6.getMessagesController().k4.Q1.f() / 1000.0f;
                        PrivacyControlActivity privacyControlActivity7 = this.d;
                        ilbVar.setText(ob6.a0(null, null, 2131746474, cc.J0(this.d.getMessagesController().k4.Q1.f()), String.valueOf(((int) (((privacyControlActivity7.N * f) / 1000.0d) * privacyControlActivity7.getMessagesController().k4.A3.i)) / 100.0d)));
                    } else if (i == privacyControlActivity6.m0) {
                        SpannableString spannableString2 = new SpannableString("g");
                        wm2 wm2Var = new wm2(R.drawable.msg_input_gift, 0);
                        wm2Var.I = 0.583f;
                        wm2Var.J = 0.583f;
                        spannableString2.setSpan(wm2Var, 0, 1, 33);
                        ilbVar.setText(ob6.V(null, null, 2131746555, spannableString2));
                    } else if (i == privacyControlActivity6.s0) {
                        ilbVar.setText(ob6.M0(2131746551, null));
                    }
                }
            }
            yob.h(aob.a7, null, ilbVar);
            return;
        }
        if (i15 == 2) {
            mf5 mf5Var = (mf5) f89Var.a;
            PrivacyControlActivity privacyControlActivity8 = this.d;
            if (i != privacyControlActivity8.P) {
                if (i == privacyControlActivity8.T) {
                    if (privacyControlActivity8.E == 10) {
                        mf5Var.setText(ob6.M0(2131746477, null));
                        return;
                    } else {
                        mf5Var.setText(ob6.M0(2131754424, null));
                        return;
                    }
                }
                if (i == privacyControlActivity8.c0) {
                    mf5Var.setText(ob6.M0(2131746527, null));
                    return;
                }
                if (i == privacyControlActivity8.X) {
                    mf5Var.setText(ob6.M0(2131746513, null));
                    return;
                }
                if (i == privacyControlActivity8.j0) {
                    mf5Var.setText(ob6.M0(2131746475, null));
                    return;
                }
                i4 = privacyControlActivity8.giftTypesHeaderRow;
                if (i == i4) {
                    mf5Var.setText(ob6.M0(2131746552, null));
                    return;
                }
                return;
            }
            int i26 = privacyControlActivity8.E;
            if (i26 == 6) {
                mf5Var.setText(ob6.M0(2131746514, null));
                return;
            }
            if (i26 == 5) {
                mf5Var.setText(ob6.M0(2131746559, null));
                return;
            }
            if (i26 == 4) {
                mf5Var.setText(ob6.M0(2131746501, null));
                return;
            }
            if (i26 == 9) {
                mf5Var.setText(ob6.M0(2131746593, null));
                return;
            }
            if (i26 == 14) {
                mf5Var.setText(ob6.M0(2131746530, null));
                return;
            }
            if (i26 == 3) {
                mf5Var.setText(ob6.M0(2131747481, null));
                return;
            }
            if (i26 == 2) {
                mf5Var.setText(ob6.M0(2131742511, null));
                return;
            }
            if (i26 == 1) {
                mf5Var.setText(ob6.M0(2131742513, null));
                return;
            }
            if (i26 == 8) {
                mf5Var.setText(ob6.M0(2131746483, null));
                return;
            }
            if (i26 == 10) {
                mf5Var.setText(ob6.M0(2131746536, null));
                return;
            }
            if (i26 == 11) {
                mf5Var.setText(ob6.M0(2131746583, null));
                return;
            } else if (i26 == 12) {
                mf5Var.setText(ob6.M0(2131746554, null));
                return;
            } else {
                mf5Var.setText(ob6.M0(2131748766, null));
                return;
            }
        }
        if (i15 != 3) {
            if (i15 != 8) {
                if (i15 == 9) {
                    bna bnaVar = (bna) f89Var.a;
                    i14 = this.d.priceRow;
                    if (i == i14) {
                        int[] a = bna.a(new int[]{1, 10, 50, 100, jn7.d3, jn7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) this.d.getMessagesController().k4.P1.f());
                        jz7 jz7Var = new jz7(this, (byte) 15);
                        ana anaVar = new ana();
                        anaVar.c = a;
                        anaVar.d = (byte) 20;
                        anaVar.e = jz7Var;
                        PrivacyControlActivity privacyControlActivity9 = this.d;
                        bnaVar.d((int) Utilities.k(privacyControlActivity9.N, privacyControlActivity9.getMessagesController().k4.P1.f(), 1L), anaVar, new ln8(this, r14 ? (byte) 1 : (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            }
            wkb wkbVar = (wkb) f89Var.a;
            wkbVar.setCheckBoxIcon(0);
            i12 = this.d.readRow;
            if (i == i12) {
                wkbVar.f(ob6.M0(2131749067, null), this.d.D0, false);
                return;
            }
            i13 = this.d.showGiftIconRow;
            if (i == i13) {
                wkbVar.f(ob6.M0(2131746556, null), this.d.F0, false);
                return;
            }
            PrivacyControlActivity privacyControlActivity10 = this.d;
            if (i == privacyControlActivity10.n0) {
                wkbVar.f(ob6.M0(2131746547, null), this.d.H0, true);
                if (!this.d.getUserConfig().p() && this.d.H0) {
                    i16 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i16);
                return;
            }
            if (i == privacyControlActivity10.o0) {
                wkbVar.f(ob6.M0(2131746550, null), this.d.J0, true);
                if (!this.d.getUserConfig().p() && this.d.J0) {
                    i17 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i17);
                return;
            }
            if (i == privacyControlActivity10.p0) {
                wkbVar.f(ob6.M0(2131746548, null), this.d.L0, true);
                if (!this.d.getUserConfig().p() && this.d.L0) {
                    i18 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i18);
                return;
            }
            if (i == privacyControlActivity10.q0) {
                wkbVar.f(ob6.M0(2131746553, null), this.d.N0, true);
                if (!this.d.getUserConfig().p() && this.d.N0) {
                    i19 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i19);
                return;
            }
            if (i == privacyControlActivity10.r0) {
                wkbVar.f(ob6.M0(2131746549, null), this.d.P0, false);
                if (!this.d.getUserConfig().p() && this.d.P0) {
                    i20 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i20);
                return;
            }
            return;
        }
        i29 i29Var = (i29) f89Var.a;
        i29Var.setRadioIcon(null);
        i5 = this.d.everybodyRow;
        if (i != i5) {
            PrivacyControlActivity privacyControlActivity11 = this.d;
            if (i != privacyControlActivity11.Q) {
                i11 = privacyControlActivity11.nobodyRow;
                if (i != i11) {
                    PrivacyControlActivity privacyControlActivity12 = this.d;
                    if (i != privacyControlActivity12.i0) {
                        if (i == privacyControlActivity12.Z) {
                            i29Var.c(ob6.M0(2131748783, null), this.d.L == 1, false);
                        } else if (i == privacyControlActivity12.Y) {
                            i29Var.c(ob6.M0(2131748773, null), this.d.L == 0, true);
                        }
                        if (this.d.E != 12) {
                            i29Var.b(null, !r0.y0());
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
                i29Var.c(ob6.M0(2131747480, null), this.d.K == 0, true);
            } else {
                i29Var.c(ob6.M0(2131748773, null), this.d.K == 0, true);
            }
        } else if (i == privacyControlActivity13.Q) {
            if (privacyControlActivity13.E != 8 || privacyControlActivity13.getUserConfig().p()) {
                PrivacyControlActivity privacyControlActivity14 = this.d;
                if (privacyControlActivity14.E == 10) {
                    if (!privacyControlActivity14.getMessagesController().k4.v2.f) {
                    }
                }
                i7 = this.d.E;
                if (i7 != 3) {
                    String M02 = ob6.M0(2131747485, null);
                    PrivacyControlActivity privacyControlActivity15 = this.d;
                    boolean z = privacyControlActivity15.K == 2;
                    i10 = privacyControlActivity15.nobodyRow;
                    i29Var.c(M02, z, (i10 == -1 && this.d.i0 == -1) ? false : true);
                } else if (i7 == 10) {
                    String M03 = ob6.M0(2131746538, null);
                    PrivacyControlActivity privacyControlActivity16 = this.d;
                    boolean z2 = privacyControlActivity16.K == 2;
                    i9 = privacyControlActivity16.nobodyRow;
                    i29Var.c(M03, z2, (i9 == -1 && this.d.i0 == -1) ? false : true);
                } else {
                    String M04 = ob6.M0(2131748783, null);
                    PrivacyControlActivity privacyControlActivity17 = this.d;
                    boolean z3 = privacyControlActivity17.K == 2;
                    i8 = privacyControlActivity17.nobodyRow;
                    i29Var.c(M04, z3, (i8 == -1 && this.d.i0 == -1) ? false : true);
                }
            }
            i29Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            i7 = this.d.E;
            if (i7 != 3) {
            }
        } else {
            int i27 = privacyControlActivity13.i0;
            int i28 = privacyControlActivity13.E;
            if (i == i27) {
                if (i28 == 10 && !privacyControlActivity13.getUserConfig().p()) {
                    i29Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                }
                i29Var.c(ob6.M0(2131746480, null), this.d.K == 3, false);
            } else {
                if (i28 != 8 || privacyControlActivity13.getUserConfig().p()) {
                    PrivacyControlActivity privacyControlActivity18 = this.d;
                    if (privacyControlActivity18.E == 10) {
                        if (!privacyControlActivity18.getMessagesController().k4.v2.f) {
                        }
                    }
                    if (this.d.E != 3) {
                        i29Var.c(ob6.M0(2131747478, null), this.d.K == 1, false);
                    } else {
                        i29Var.c(ob6.M0(2131748770, null), this.d.K == 1, false);
                    }
                }
                i29Var.setRadioIcon(this.d.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                if (this.d.E != 3) {
                }
            }
        }
        if (this.d.E != 12) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        View view;
        byte b = 0;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i) {
            case 0:
                qmb qmbVar = new qmb(context);
                qmbVar.setCanDisable(true);
                view = qmbVar;
                break;
            case 1:
                view = new ilb(context);
                break;
            case 2:
                view = new mf5(context);
                break;
            case 3:
                view = new i29(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new rca(context, (uh9) null);
                break;
            case 6:
                skb skbVar = new skb(privacyControlActivity.getParentActivity());
                privacyControlActivity.w0 = skbVar;
                if (privacyControlActivity.z0 == null) {
                    skbVar.o(R.drawable.msg_addphoto, ob6.a0(null, null, 2131745245, new Object[0]), false);
                } else {
                    skbVar.o(R.drawable.msg_addphoto, ob6.a0("UpdatePhotoForRest", null, 2131743472, new Object[0]), true);
                }
                privacyControlActivity.w0.setBackgroundDrawable(aob.L0(false));
                privacyControlActivity.w0.g(aob.v6, aob.u6);
                privacyControlActivity.v0 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
                privacyControlActivity.w0.e.setTranslationX(-hl.L(8.0f));
                privacyControlActivity.w0.e.setAnimation(privacyControlActivity.v0);
                view = privacyControlActivity.w0;
                break;
            case 7:
                privacyControlActivity.x0 = new de0(privacyControlActivity.getParentActivity());
                privacyControlActivity.y0 = new au2(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    de0 de0Var = privacyControlActivity.x0;
                    if (photo != null) {
                        jn5 i4 = jn5.i(photoSize, photo);
                        i3 = ((e) privacyControlActivity).currentAccount;
                        de0Var.m(i4, "50_50", null, yac.h(i3).f());
                    } else {
                        jn5 e = jn5.e(photoSize.location);
                        i2 = ((e) privacyControlActivity).currentAccount;
                        de0Var.m(e, "50_50", null, yac.h(i2).f());
                    }
                }
                privacyControlActivity.y0.addView(privacyControlActivity.x0, tre.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.y0.k(ob6.M0(2131746016, null), false);
                privacyControlActivity.y0.getImageView().setVisibility(0);
                privacyControlActivity.y0.setBackgroundDrawable(aob.L0(false));
                au2 au2Var = privacyControlActivity.y0;
                int i5 = aob.p7;
                au2Var.g(i5, i5);
                view = privacyControlActivity.y0;
                break;
            case 8:
                vnbVar = ((e) privacyControlActivity).resourceProvider;
                view = new wkb(context, vnbVar);
                break;
            case 9:
                vnbVar2 = ((e) privacyControlActivity).resourceProvider;
                view = new bna(context, vnbVar2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                vnbVar3 = ((e) privacyControlActivity).resourceProvider;
                c51 c51Var = new c51(vnbVar3, context, true);
                c51Var.setRoundRadius(24);
                wm2 wm2Var = new wm2(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131746481, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                c51Var.i(spannableStringBuilder, false, true);
                c51Var.setOnClickListener(new jn8(this, b));
                frameLayout.addView(c51Var, tre.d(-1, 48.0f, jn7.D1, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new n69(view);
    }
}
