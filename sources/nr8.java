// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nr8 extends n39 {
    public final Context c;
    public final /* synthetic */ pr8 d;

    public nr8(pr8 pr8Var, Context context) {
        this.d = pr8Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        pr8 pr8Var = this.d;
        if (b == pr8Var.G) {
            return pr8Var.r;
        }
        if (s49Var.b() == pr8Var.Y) {
            return true;
        }
        switch (s49Var.f) {
        }
        return pr8Var.r;
    }

    @Override // w39
    public final int b() {
        return this.d.a0;
    }

    @Override // w39
    public final int d(int i) {
        pr8 pr8Var = this.d;
        if (i == pr8Var.x || i == pr8Var.M || i == pr8Var.V || i == pr8Var.R) {
            return 0;
        }
        if (i == pr8Var.H || i == pr8Var.I || i == pr8Var.K || i == pr8Var.J || i == pr8Var.S || i == pr8Var.T || i == pr8Var.Y) {
            return 1;
        }
        if (i == pr8Var.P || i == pr8Var.X || i == pr8Var.L || i == pr8Var.U) {
            return 2;
        }
        if (i == pr8Var.W) {
            return 3;
        }
        if (i == pr8Var.N || i == pr8Var.O) {
            return 4;
        }
        if (i == pr8Var.y) {
            return 5;
        }
        if (i == pr8Var.E || i == pr8Var.Z) {
            return 6;
        }
        return (i == pr8Var.F || i == pr8Var.G || i == pr8Var.Q) ? 7 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        TLObject K0;
        int i6;
        int i7;
        pr8 pr8Var = this.d;
        wjb wjbVar = pr8Var.e;
        long j = pr8Var.h;
        long j2 = pr8Var.f;
        int i8 = s49Var.f;
        View view = s49Var.a;
        switch (i8) {
            case 0:
                ld5 ld5Var = (ld5) view;
                if (i != pr8Var.x) {
                    if (i != pr8Var.M) {
                        if (i != pr8Var.V) {
                            if (i == pr8Var.R) {
                                ld5Var.setText(k96.M0(2131743037, null));
                                break;
                            }
                        } else {
                            ld5Var.setText(k96.M0(2131747711, null));
                            break;
                        }
                    } else {
                        ld5Var.setText(k96.M0(2131746446, null));
                        break;
                    }
                } else {
                    ld5Var.setText(k96.M0(2131750458, null));
                    break;
                }
                break;
            case 1:
                uib uibVar = (uib) view;
                String p = im7.p(j2, j, false);
                i2 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences = na7.q1(i2).W3;
                if (i != pr8Var.Y) {
                    zkb.X(uibVar.getTextView(), bkb.F6, wjbVar);
                    if (i != pr8Var.H) {
                        if (i != pr8Var.S) {
                            if (i != pr8Var.I) {
                                if (i != pr8Var.K) {
                                    if (i != pr8Var.J) {
                                        if (i == pr8Var.T) {
                                            int g = ls6.g("calls_vibrate_", p, sharedPreferences, 0);
                                            if (g != 0 && g != 4) {
                                                if (g != 1) {
                                                    if (g != 2) {
                                                        if (g == 3) {
                                                            uibVar.c(k96.M0(2131743375, null), k96.M0(2131748531, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        uibVar.c(k96.M0(2131743375, null), k96.M0(2131743373, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    uibVar.c(k96.M0(2131743375, null), k96.M0(2131745174, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                uibVar.c(k96.M0(2131743375, null), k96.M0(2131743374, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int g2 = ls6.g("smart_max_count_", p, sharedPreferences, 2);
                                        int g3 = ls6.g("smart_delay_", p, sharedPreferences, kk7.J2);
                                        if (g2 != 0) {
                                            uibVar.c(k96.M0(2131745108, null), k96.a0("SmartNotificationsInfo", null, 2131745106, Integer.valueOf(g2), k96.G(g3 / 60, "Minutes", new Object[0])), false, pr8Var.K != -1);
                                            break;
                                        } else {
                                            uibVar.c(k96.M0(2131745108, null), k96.M0(2131745107, null), false, pr8Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int g4 = ls6.g("priority_", p, sharedPreferences, 3);
                                    if (g4 != 0) {
                                        if (g4 != 1 && g4 != 2) {
                                            if (g4 != 3) {
                                                if (g4 != 4) {
                                                    if (g4 == 5) {
                                                        uibVar.c(k96.M0(2131747713, null), k96.M0(2131747688, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    uibVar.c(k96.M0(2131747713, null), k96.M0(2131747689, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                uibVar.c(k96.M0(2131747713, null), k96.M0(2131747687, null), false, false);
                                                break;
                                            }
                                        } else {
                                            uibVar.c(k96.M0(2131747713, null), k96.M0(2131747686, null), false, false);
                                            break;
                                        }
                                    } else {
                                        uibVar.c(k96.M0(2131747713, null), k96.M0(2131747690, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int g5 = ls6.g("vibrate_", p, sharedPreferences, 0);
                                if (g5 != 0 && g5 != 4) {
                                    if (g5 != 1) {
                                        if (g5 != 2) {
                                            if (g5 == 3) {
                                                String M0 = k96.M0(2131743375, null);
                                                String M02 = k96.M0(2131748531, null);
                                                if (pr8Var.J == -1 && pr8Var.K == -1) {
                                                    r11 = false;
                                                }
                                                uibVar.c(M0, M02, false, r11);
                                                break;
                                            }
                                        } else {
                                            String M03 = k96.M0(2131743375, null);
                                            String M04 = k96.M0(2131743373, null);
                                            if (pr8Var.J == -1 && pr8Var.K == -1) {
                                                r11 = false;
                                            }
                                            uibVar.c(M03, M04, false, r11);
                                            break;
                                        }
                                    } else {
                                        String M05 = k96.M0(2131743375, null);
                                        String M06 = k96.M0(2131745174, null);
                                        if (pr8Var.J == -1 && pr8Var.K == -1) {
                                            r11 = false;
                                        }
                                        uibVar.c(M05, M06, false, r11);
                                        break;
                                    }
                                } else {
                                    String M07 = k96.M0(2131743375, null);
                                    String M08 = k96.M0(2131743374, null);
                                    if (pr8Var.J == -1 && pr8Var.K == -1) {
                                        r11 = false;
                                    }
                                    uibVar.c(M07, M08, false, r11);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(b00.h("ringtone_", p), k96.M0(2131751587, null));
                            if (string.equals("NoSound")) {
                                string = k96.M0(2131747959, null);
                            }
                            uibVar.c(k96.M0(2131742999, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(b00.h("sound_", p), k96.M0(2131745088, null));
                        long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                        if (j3 != 0) {
                            TLRPC.Document c = pr8Var.getMediaDataController().A0.c(j3);
                            string2 = c == null ? k96.M0(2131751667, null) : an7.f0(c, c.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = k96.M0(2131747959, null);
                        } else if (string2.equals("Default")) {
                            string2 = k96.M0(2131745088, null);
                        }
                        uibVar.c(k96.M0(2131745091, null), string2, false, true);
                        break;
                    }
                } else {
                    uibVar.b(k96.M0(2131745911, null), false);
                    zkb.X(uibVar.getTextView(), bkb.p7, wjbVar);
                    break;
                }
                break;
            case 2:
                mhb mhbVar = (mhb) view;
                mhbVar.setFixedSize(0);
                if (i != pr8Var.P) {
                    if (i != pr8Var.X) {
                        if (i != pr8Var.L) {
                            if (i == pr8Var.U) {
                                mhbVar.setText(k96.M0(2131743002, null));
                                break;
                            }
                        } else if (pr8Var.K != -1) {
                            mhbVar.setText(k96.M0(2131746678, null));
                            break;
                        } else {
                            mhbVar.setText("");
                            break;
                        }
                    } else {
                        mhbVar.setText(k96.M0(2131747709, null));
                        break;
                    }
                } else {
                    mhbVar.setText(k96.M0(2131746445, null));
                    break;
                }
                break;
            case 3:
                chb chbVar = (chb) view;
                String p2 = im7.p(j2, j, false);
                i3 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences2 = na7.q1(i3).W3;
                StringBuilder sb = new StringBuilder("color_");
                sb.append(p2);
                int g6 = sharedPreferences2.contains(sb.toString()) ? ls6.g("color_", p2, sharedPreferences2, -16776961) : cf3.y(j2) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        if (chb.f[i9] == g6) {
                            g6 = chb.e[i9];
                        } else {
                            i9++;
                        }
                    }
                }
                chbVar.b(g6, k96.M0(2131747710, null), false);
                break;
            case 4:
                vy8 vy8Var = (vy8) view;
                i4 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences3 = na7.q1(i4).W3;
                int g7 = ls6.g("popup_", im7.p(j2, j, false), sharedPreferences3, 0);
                if (g7 == 0) {
                    g7 = sharedPreferences3.getInt(cf3.y(j2) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i != pr8Var.N) {
                    if (i == pr8Var.O) {
                        vy8Var.c(k96.M0(2131746907, null), g7 == 2, false);
                        vy8Var.setTag(2);
                        break;
                    }
                } else {
                    vy8Var.c(k96.M0(2131746906, null), g7 == 1, true);
                    vy8Var.setTag(1);
                    break;
                }
                break;
            case 5:
                u6c u6cVar = (u6c) view;
                if (cf3.D(j2)) {
                    i6 = ((d) pr8Var).currentAccount;
                    K0 = na7.q1(i6).V1(Long.valueOf(j2));
                } else {
                    i5 = ((d) pr8Var).currentAccount;
                    K0 = na7.q1(i5).K0(Long.valueOf(-j2));
                }
                u6cVar.a(null, K0);
                break;
            case 6:
                b9a b9aVar = (b9a) view;
                boolean z = i > 0;
                r11 = i < pr8Var.a0 - 1;
                if (b9aVar.c != z || b9aVar.d != r11) {
                    b9aVar.c = z;
                    b9aVar.d = r11;
                    int i10 = b9aVar.b;
                    if (i10 != 0) {
                        b9aVar.setBackgroundColor(i10);
                        break;
                    } else {
                        b9aVar.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                ahb ahbVar = (ahb) view;
                i7 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences4 = na7.q1(i7).W3;
                if (i != pr8Var.F) {
                    if (i != pr8Var.G) {
                        if (i == pr8Var.Q) {
                            String h = b00.h("stories_", im7.p(j2, j, false));
                            if (pr8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r12 = true;
                            }
                            ahbVar.f(k96.M0(2131744507, null), sharedPreferences4.getBoolean(h, r12), true);
                            break;
                        }
                    } else {
                        String p3 = im7.p(j2, j, false);
                        ahbVar.f(k96.M0(2131748345, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                        break;
                    }
                } else {
                    ahbVar.f(k96.M0(2131747731, null), pr8Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View ld5Var;
        wjb wjbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                ld5Var = new ld5(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 1:
                ld5Var = new uib(0, wjbVar, context);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 2:
                ld5Var = new mhb(context, wjbVar);
                break;
            case 3:
                ld5Var = new chb(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 4:
                ld5Var = new vy8(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 5:
                ld5Var = new u6c(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 6:
                ld5Var = new b9a(context, (de9) null);
                break;
            default:
                ld5Var = new ahb(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
        }
        return ls6.h(ld5Var, ld5Var, -1, -2);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        View view = s49Var.a;
        pr8 pr8Var = this.d;
        if (i == 0) {
            ((ld5) view).a(null, pr8Var.r);
            return;
        }
        if (i == 1) {
            uib uibVar = (uib) view;
            if (s49Var.b() == pr8Var.Y) {
                uibVar.a(null, true);
                return;
            } else {
                uibVar.a(null, pr8Var.r);
                return;
            }
        }
        if (i == 2) {
            ((mhb) view).c(null, pr8Var.r);
            return;
        }
        if (i == 3) {
            ((chb) view).a(null, pr8Var.r);
            return;
        }
        if (i == 4) {
            ((vy8) view).b(null, pr8Var.r);
            return;
        }
        if (i != 7) {
            return;
        }
        ahb ahbVar = (ahb) view;
        if (s49Var.b() == pr8Var.G) {
            ahbVar.e(null, pr8Var.r);
        } else if (s49Var.b() == pr8Var.Q) {
            ahbVar.e(null, pr8Var.r);
        } else {
            ahbVar.e(null, true);
        }
    }
}
