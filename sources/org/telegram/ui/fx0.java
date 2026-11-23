package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fx0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ hx0 d;

    public fx0(hx0 hx0Var, Context context) {
        this.d = hx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        hx0 hx0Var = this.d;
        if (b10 == hx0Var.G) {
            return hx0Var.r;
        }
        if (f1Var.b() == hx0Var.Y) {
            return true;
        }
        switch (f1Var.f) {
        }
        return hx0Var.r;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.a0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        hx0 hx0Var = this.d;
        if (i7 == hx0Var.x || i7 == hx0Var.M || i7 == hx0Var.V || i7 == hx0Var.R) {
            return 0;
        }
        if (i7 == hx0Var.H || i7 == hx0Var.I || i7 == hx0Var.K || i7 == hx0Var.J || i7 == hx0Var.S || i7 == hx0Var.T || i7 == hx0Var.Y) {
            return 1;
        }
        if (i7 == hx0Var.P || i7 == hx0Var.X || i7 == hx0Var.L || i7 == hx0Var.U) {
            return 2;
        }
        if (i7 == hx0Var.W) {
            return 3;
        }
        if (i7 == hx0Var.N || i7 == hx0Var.O) {
            return 4;
        }
        if (i7 == hx0Var.y) {
            return 5;
        }
        if (i7 == hx0Var.E || i7 == hx0Var.Z) {
            return 6;
        }
        return (i7 == hx0Var.F || i7 == hx0Var.G || i7 == hx0Var.Q) ? 7 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        TLObject O0;
        int i14;
        int i15;
        hx0 hx0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = hx0Var.e;
        long j3 = hx0Var.h;
        long j10 = hx0Var.f;
        int i16 = f1Var.f;
        View view = f1Var.a;
        switch (i16) {
            case 0:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 != hx0Var.x) {
                    if (i7 != hx0Var.M) {
                        if (i7 != hx0Var.V) {
                            if (i7 == hx0Var.R) {
                                o4Var.setText(org.telegram.messenger.gd.N0(2131743029, null));
                                break;
                            }
                        } else {
                            o4Var.setText(org.telegram.messenger.gd.N0(2131747710, null));
                            break;
                        }
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131746443, null));
                        break;
                    }
                } else {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131750457, null));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                String v = org.telegram.messenger.xs.v(j10, j3, false);
                i10 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).g7;
                if (i7 != hx0Var.Y) {
                    org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, i6Var);
                    if (i7 != hx0Var.H) {
                        if (i7 != hx0Var.S) {
                            if (i7 != hx0Var.I) {
                                if (i7 != hx0Var.K) {
                                    if (i7 != hx0Var.J) {
                                        if (i7 == hx0Var.T) {
                                            int c10 = org.telegram.messenger.f3.c("calls_vibrate_", v, sharedPreferences, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            w9Var.c(org.telegram.messenger.gd.N0(2131743367, null), org.telegram.messenger.gd.N0(2131748530, null), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        w9Var.c(org.telegram.messenger.gd.N0(2131743367, null), org.telegram.messenger.gd.N0(2131743365, null), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.gd.N0(2131743367, null), org.telegram.messenger.gd.N0(2131745170, null), false, true);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.gd.N0(2131743367, null), org.telegram.messenger.gd.N0(2131743366, null), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.f3.c("smart_max_count_", v, sharedPreferences, 2);
                                        int c12 = org.telegram.messenger.f3.c("smart_delay_", v, sharedPreferences, org.telegram.messenger.ks.K2);
                                        if (c11 != 0) {
                                            w9Var.c(org.telegram.messenger.gd.N0(2131745104, null), org.telegram.messenger.gd.a0("SmartNotificationsInfo", null, 2131745102, Integer.valueOf(c11), org.telegram.messenger.gd.G(c12 / 60, "Minutes", new Object[0])), false, hx0Var.K != -1);
                                            break;
                                        } else {
                                            w9Var.c(org.telegram.messenger.gd.N0(2131745104, null), org.telegram.messenger.gd.N0(2131745103, null), false, hx0Var.K != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.f3.c("priority_", v, sharedPreferences, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        w9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747687, null), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    w9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747688, null), false, false);
                                                    break;
                                                }
                                            } else {
                                                w9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747686, null), false, false);
                                                break;
                                            }
                                        } else {
                                            w9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747685, null), false, false);
                                            break;
                                        }
                                    } else {
                                        w9Var.c(org.telegram.messenger.gd.N0(2131747712, null), org.telegram.messenger.gd.N0(2131747689, null), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.f3.c("vibrate_", v, sharedPreferences, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String N0 = org.telegram.messenger.gd.N0(2131743367, null);
                                                String N02 = org.telegram.messenger.gd.N0(2131748530, null);
                                                if (hx0Var.J == -1 && hx0Var.K == -1) {
                                                    r12 = false;
                                                }
                                                w9Var.c(N0, N02, false, r12);
                                                break;
                                            }
                                        } else {
                                            String N03 = org.telegram.messenger.gd.N0(2131743367, null);
                                            String N04 = org.telegram.messenger.gd.N0(2131743365, null);
                                            if (hx0Var.J == -1 && hx0Var.K == -1) {
                                                r12 = false;
                                            }
                                            w9Var.c(N03, N04, false, r12);
                                            break;
                                        }
                                    } else {
                                        String N05 = org.telegram.messenger.gd.N0(2131743367, null);
                                        String N06 = org.telegram.messenger.gd.N0(2131745170, null);
                                        if (hx0Var.J == -1 && hx0Var.K == -1) {
                                            r12 = false;
                                        }
                                        w9Var.c(N05, N06, false, r12);
                                        break;
                                    }
                                } else {
                                    String N07 = org.telegram.messenger.gd.N0(2131743367, null);
                                    String N08 = org.telegram.messenger.gd.N0(2131743366, null);
                                    if (hx0Var.J == -1 && hx0Var.K == -1) {
                                        r12 = false;
                                    }
                                    w9Var.c(N07, N08, false, r12);
                                    break;
                                }
                            }
                        } else {
                            String string = sharedPreferences.getString(p5.c.k("ringtone_", v), org.telegram.messenger.gd.N0(2131751587, null));
                            if (string.equals("NoSound")) {
                                string = org.telegram.messenger.gd.N0(2131747958, null);
                            }
                            w9Var.c(org.telegram.messenger.gd.N0(2131742991, null), string, false, false);
                            break;
                        }
                    } else {
                        String string2 = sharedPreferences.getString(p5.c.k("sound_", v), org.telegram.messenger.gd.N0(2131745084, null));
                        long j11 = sharedPreferences.getLong("sound_document_id_" + v, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = hx0Var.getMediaDataController().A0.c(j11);
                            string2 = c15 == null ? org.telegram.messenger.gd.N0(2131751667, null) : wh0.g0(c15, c15.file_name_fixed);
                        } else if (string2.equals("NoSound")) {
                            string2 = org.telegram.messenger.gd.N0(2131747958, null);
                        } else if (string2.equals("Default")) {
                            string2 = org.telegram.messenger.gd.N0(2131745084, null);
                        }
                        w9Var.c(org.telegram.messenger.gd.N0(2131745087, null), string2, false, true);
                        break;
                    }
                } else {
                    w9Var.b(org.telegram.messenger.gd.N0(2131745908, null), false);
                    org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.q7, i6Var);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 != hx0Var.P) {
                    if (i7 != hx0Var.X) {
                        if (i7 != hx0Var.L) {
                            if (i7 == hx0Var.U) {
                                z8Var.setText(org.telegram.messenger.gd.N0(2131742994, null));
                                break;
                            }
                        } else if (hx0Var.K != -1) {
                            z8Var.setText(org.telegram.messenger.gd.N0(2131746675, null));
                            break;
                        } else {
                            z8Var.setText("");
                            break;
                        }
                    } else {
                        z8Var.setText(org.telegram.messenger.gd.N0(2131747708, null));
                        break;
                    }
                } else {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131746442, null));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                String v10 = org.telegram.messenger.xs.v(j10, j3, false);
                i11 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(i11).g7;
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(v10);
                int c16 = sharedPreferences2.contains(sb2.toString()) ? org.telegram.messenger.f3.c("color_", v10, sharedPreferences2, -16776961) : org.telegram.messenger.n5.z(j10) ? sharedPreferences2.getInt("GroupLed", -16776961) : sharedPreferences2.getInt("MessagesLed", -16776961);
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
                t8Var.b(c16, org.telegram.messenger.gd.N0(2131747709, null), false);
                break;
            case 4:
                org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) view;
                i12 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                SharedPreferences sharedPreferences3 = org.telegram.messenger.mp.u1(i12).g7;
                int c17 = org.telegram.messenger.f3.c("popup_", org.telegram.messenger.xs.v(j10, j3, false), sharedPreferences3, 0);
                if (c17 == 0) {
                    c17 = sharedPreferences3.getInt(org.telegram.messenger.n5.z(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i7 != hx0Var.N) {
                    if (i7 == hx0Var.O) {
                        i6Var2.c(org.telegram.messenger.gd.N0(2131746906, null), c17 == 2, false);
                        i6Var2.setTag(2);
                        break;
                    }
                } else {
                    i6Var2.c(org.telegram.messenger.gd.N0(2131746905, null), c17 == 1, true);
                    i6Var2.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                if (org.telegram.messenger.n5.E(j10)) {
                    i14 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j10));
                } else {
                    i13 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    O0 = org.telegram.messenger.mp.u1(i13).O0(Long.valueOf(-j10));
                }
                raVar.a(null, O0);
                break;
            case 6:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                boolean z10 = i7 > 0;
                r12 = i7 < hx0Var.a0 - 1;
                if (y6Var.c != z10 || y6Var.d != r12) {
                    y6Var.c = z10;
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
                i15 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                SharedPreferences sharedPreferences4 = org.telegram.messenger.mp.u1(i15).g7;
                if (i7 != hx0Var.F) {
                    if (i7 != hx0Var.G) {
                        if (i7 == hx0Var.Q) {
                            String k10 = p5.c.k("stories_", org.telegram.messenger.xs.v(j10, j3, false));
                            if (hx0Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                                r13 = true;
                            }
                            r8Var.f(org.telegram.messenger.gd.N0(2131744503, null), sharedPreferences4.getBoolean(k10, r13), true);
                            break;
                        }
                    } else {
                        String v11 = org.telegram.messenger.xs.v(j10, j3, false);
                        r8Var.f(org.telegram.messenger.gd.N0(2131748344, null), sharedPreferences4.getBoolean("content_preview_" + v11, true), true);
                        break;
                    }
                } else {
                    r8Var.f(org.telegram.messenger.gd.N0(2131747730, null), hx0Var.r, true);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.d.e;
        Context context = this.c;
        switch (i7) {
            case 0:
                o4Var = new org.telegram.ui.Cells.o4(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
            case 1:
                o4Var = new org.telegram.ui.Cells.w9(0, context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
            case 2:
                o4Var = new org.telegram.ui.Cells.z8(context, i6Var);
                break;
            case 3:
                o4Var = new org.telegram.ui.Cells.t8(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
            case 4:
                o4Var = new org.telegram.ui.Cells.i6(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
            case 5:
                o4Var = new org.telegram.ui.Cells.ra(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
            case 6:
                o4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            default:
                o4Var = new org.telegram.ui.Cells.r8(context, i6Var);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                break;
        }
        return i5.c.q(o4Var, o4Var, -1, -2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        View view = f1Var.a;
        hx0 hx0Var = this.d;
        if (i7 == 0) {
            ((org.telegram.ui.Cells.o4) view).a(null, hx0Var.r);
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (f1Var.b() == hx0Var.Y) {
                w9Var.a(null, true);
                return;
            } else {
                w9Var.a(null, hx0Var.r);
                return;
            }
        }
        if (i7 == 2) {
            ((org.telegram.ui.Cells.z8) view).c(null, hx0Var.r);
            return;
        }
        if (i7 == 3) {
            ((org.telegram.ui.Cells.t8) view).a(null, hx0Var.r);
            return;
        }
        if (i7 == 4) {
            ((org.telegram.ui.Cells.i6) view).b(null, hx0Var.r);
            return;
        }
        if (i7 != 7) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (f1Var.b() == hx0Var.G) {
            r8Var.e(null, hx0Var.r);
        } else if (f1Var.b() == hx0Var.Q) {
            r8Var.e(null, hx0Var.r);
        } else {
            r8Var.e(null, true);
        }
    }
}
