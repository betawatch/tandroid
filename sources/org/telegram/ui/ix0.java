package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ kx0 d;

    public ix0(kx0 kx0Var, Context context) {
        this.d = kx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        kx0 kx0Var = this.d;
        if (b10 == kx0Var.F) {
            return kx0Var.r;
        }
        if (d1Var.b() == kx0Var.X) {
            return true;
        }
        switch (d1Var.f) {
        }
        return kx0Var.r;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.Z;
    }

    @Override // v4.g0
    public final int d(int i7) {
        kx0 kx0Var = this.d;
        if (i7 == kx0Var.x || i7 == kx0Var.L || i7 == kx0Var.U || i7 == kx0Var.Q) {
            return 0;
        }
        if (i7 == kx0Var.G || i7 == kx0Var.H || i7 == kx0Var.J || i7 == kx0Var.I || i7 == kx0Var.R || i7 == kx0Var.S || i7 == kx0Var.X) {
            return 1;
        }
        if (i7 == kx0Var.O || i7 == kx0Var.W || i7 == kx0Var.K || i7 == kx0Var.T) {
            return 2;
        }
        if (i7 == kx0Var.V) {
            return 3;
        }
        if (i7 == kx0Var.M || i7 == kx0Var.N) {
            return 4;
        }
        if (i7 == kx0Var.y) {
            return 5;
        }
        if (i7 == kx0Var.D || i7 == kx0Var.Y) {
            return 6;
        }
        return (i7 == kx0Var.E || i7 == kx0Var.F || i7 == kx0Var.P) ? 7 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject M0;
        int i14;
        int i15;
        kx0 kx0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = kx0Var.e;
        long j3 = kx0Var.h;
        long j10 = kx0Var.f;
        int i16 = d1Var.f;
        View view = d1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 != kx0Var.x) {
                    if (i7 != kx0Var.L) {
                        if (i7 != kx0Var.U) {
                            if (i7 == kx0Var.Q) {
                                n4Var.setText(org.telegram.messenger.id.M0(2131743279, null));
                                break;
                            }
                        } else {
                            n4Var.setText(org.telegram.messenger.id.M0(2131747904, null));
                            break;
                        }
                    } else {
                        n4Var.setText(org.telegram.messenger.id.M0(2131746639, null));
                        break;
                    }
                } else {
                    n4Var.setText(org.telegram.messenger.id.M0(2131750474, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String v = org.telegram.messenger.dt.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).d7;
                if (i7 != kx0Var.X) {
                    org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.G6, g6Var);
                    if (i7 != kx0Var.G) {
                        if (i7 != kx0Var.R) {
                            if (i7 != kx0Var.H) {
                                if (i7 != kx0Var.J) {
                                    if (i7 != kx0Var.I) {
                                        if (i7 == kx0Var.S) {
                                            int c10 = org.telegram.messenger.k5.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            w9Var.c(org.telegram.messenger.id.M0(2131743614, null), org.telegram.messenger.id.M0(2131748723, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        w9Var.c(org.telegram.messenger.id.M0(2131743614, null), org.telegram.messenger.id.M0(2131743612, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.id.M0(2131743614, null), org.telegram.messenger.id.M0(2131745366, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.id.M0(2131743614, null), org.telegram.messenger.id.M0(2131743613, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.k5.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.k5.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.qs.K2);
                                        if (c11 != 0) {
                                            w9Var.c(org.telegram.messenger.id.M0(2131745300, null), org.telegram.messenger.id.a0("SmartNotificationsInfo", null, 2131745298, Integer.valueOf(c11), org.telegram.messenger.id.G(c12 / 60, "Minutes", new Object[0])), false, kx0Var.J != -1);
                                            break;
                                        } else {
                                            w9Var.c(org.telegram.messenger.id.M0(2131745300, null), org.telegram.messenger.id.M0(2131745299, null), false, kx0Var.J != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.k5.c("priority_", v, sharedPreferences, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        w9Var.c(org.telegram.messenger.id.M0(2131747906, null), org.telegram.messenger.id.M0(2131747881, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.id.M0(2131747906, null), org.telegram.messenger.id.M0(2131747882, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.id.M0(2131747906, null), org.telegram.messenger.id.M0(2131747880, null), false, false);
                                                break;
                                            }
                                        } else {
                                            w9Var.c(org.telegram.messenger.id.M0(2131747906, null), org.telegram.messenger.id.M0(2131747879, null), false, false);
                                            break;
                                        }
                                    } else {
                                        w9Var.c(org.telegram.messenger.id.M0(2131747906, null), org.telegram.messenger.id.M0(2131747883, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.k5.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String M02 = org.telegram.messenger.id.M0(2131743614, null);
                                                String M03 = org.telegram.messenger.id.M0(2131748723, null);
                                                if (kx0Var.I == -1 && kx0Var.J == -1) {
                                                    r12 = false;
                                                }
                                                w9Var.c(M02, M03, false, r12);
                                                break;
                                            }
                                        } else {
                                            String M04 = org.telegram.messenger.id.M0(2131743614, null);
                                            String M05 = org.telegram.messenger.id.M0(2131743612, null);
                                            if (kx0Var.I == -1 && kx0Var.J == -1) {
                                                r12 = false;
                                            }
                                            w9Var.c(M04, M05, false, r12);
                                            break;
                                        }
                                    } else {
                                        String M06 = org.telegram.messenger.id.M0(2131743614, null);
                                        String M07 = org.telegram.messenger.id.M0(2131745366, null);
                                        if (kx0Var.I == -1 && kx0Var.J == -1) {
                                            r12 = false;
                                        }
                                        w9Var.c(M06, M07, false, r12);
                                        break;
                                    }
                                } else {
                                    String M08 = org.telegram.messenger.id.M0(2131743614, null);
                                    String M09 = org.telegram.messenger.id.M0(2131743613, null);
                                    if (kx0Var.I == -1 && kx0Var.J == -1) {
                                        r12 = false;
                                    }
                                    w9Var.c(M08, M09, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(rf.b.i("ringtone_", v), org.telegram.messenger.id.M0(2131751599, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.id.M0(2131748151, null);
                            }
                            w9Var.c(org.telegram.messenger.id.M0(2131743241, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(rf.b.i("sound_", v), org.telegram.messenger.id.M0(2131745280, null));
                        long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = kx0Var.getMediaDataController().z0.c(j11);
                            string2 = c15 == null ? org.telegram.messenger.id.M0(2131751679, null) : uh0.g0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.id.M0(2131748151, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.id.M0(2131745280, null);
                        }
                        w9Var.c(org.telegram.messenger.id.M0(2131745283, null), string2, false, true);
                        break;
                    }
                } else {
                    w9Var.b(org.telegram.messenger.id.M0(2131746104, null), false);
                    org.telegram.ui.ActionBar.s6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.l6.q7, g6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 != kx0Var.O) {
                    if (i7 != kx0Var.W) {
                        if (i7 != kx0Var.K) {
                            if (i7 == kx0Var.T) {
                                z8Var.setText(org.telegram.messenger.id.M0(2131743244, null));
                                break;
                            }
                        } else if (kx0Var.J != -1) {
                            z8Var.setText(org.telegram.messenger.id.M0(2131746869, null));
                            break;
                        } else {
                            z8Var.setText("");
                            break;
                        }
                    } else {
                        z8Var.setText(org.telegram.messenger.id.M0(2131747902, null));
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131746638, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String v10 = org.telegram.messenger.dt.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(i11).d7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.k5.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.m5.z(j10) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
                int i17 = 0;
                while (true) {
                    if (i17 < 9) {
                        if (org.telegram.ui.Cells.t8.f[i17] == c16) {
                            c16 = org.telegram.ui.Cells.t8.e[i17];
                        } else {
                            i17++;
                        }
                    }
                }
                t8Var.b(c16, org.telegram.messenger.id.M0(2131747903, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i12 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.qp.s1(i12).d7;
                int c17 = org.telegram.messenger.k5.c("popup_", org.telegram.messenger.dt.v(j10, j3, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.m5.z(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i7 != kx0Var.M) {
                    if (i7 == kx0Var.N) {
                        i6Var.c(org.telegram.messenger.id.M0(2131747100, null), c17 == 2, false);
                        i6Var.setTag(2);
                        break;
                    }
                } else {
                    i6Var.c(org.telegram.messenger.id.M0(2131747099, null), c17 == 1, true);
                    i6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
                if (org.telegram.messenger.m5.E(j10)) {
                    i14 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j10));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                    M0 = org.telegram.messenger.qp.s1(i13).M0(Long.valueOf(-j10));
                }
                oaVar.a(null, M0);
                break;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                boolean z9 = i7 > 0;
                r12 = i7 < kx0Var.Z - 1;
                if (y6Var.c != z9 || y6Var.d != r12) {
                    y6Var.c = z9;
                    y6Var.d = r12;
                    int i18 = y6Var.b;
                    if (i18 != 0) {
                        y6Var.setBackgroundColor(i18);
                        break;
                    } else {
                        y6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                i15 = ((org.telegram.ui.ActionBar.f2) kx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.qp.s1(i15).d7;
                if (i7 != kx0Var.E) {
                    if (i7 != kx0Var.F) {
                        if (i7 == kx0Var.P) {
                            String i19 = rf.b.i("stories_", org.telegram.messenger.dt.v(j10, j3, false));
                            if (kx0Var.a0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            r8Var.f(org.telegram.messenger.id.M0(2131744744, null), sharedPreferences4.getBoolean(i19, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.dt.v(j10, j3, false);
                        r8Var.f(org.telegram.messenger.id.M0(2131748537, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    r8Var.f(org.telegram.messenger.id.M0(2131747924, null), kx0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        org.telegram.ui.ActionBar.g6 g6Var = this.d.e;
        Context context = this.c;
        switch (i7) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.w9(0, context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.z8(context, g6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.t8(context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.i6(context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.oa(context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.r8(context, g6Var);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                break;
        }
        return jg.g.r(n4Var, n4Var, -1, -2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f;
        View view = d1Var.a;
        kx0 kx0Var = this.d;
        if (i7 == 0) {
            ((org.telegram.ui.Cells.n4) view).a(null, kx0Var.r);
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (d1Var.b() == kx0Var.X) {
                w9Var.a(null, true);
                return;
            } else {
                w9Var.a(null, kx0Var.r);
                return;
            }
        }
        if (i7 == 2) {
            ((org.telegram.ui.Cells.z8) view).c(null, kx0Var.r);
            return;
        }
        if (i7 == 3) {
            ((org.telegram.ui.Cells.t8) view).a(null, kx0Var.r);
            return;
        }
        if (i7 == 4) {
            ((org.telegram.ui.Cells.i6) view).b(null, kx0Var.r);
            return;
        }
        if (i7 != 7) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (d1Var.b() == kx0Var.F) {
            r8Var.e(null, kx0Var.r);
        } else if (d1Var.b() == kx0Var.P) {
            r8Var.e(null, kx0Var.r);
        } else {
            r8Var.e(null, true);
        }
    }
}
