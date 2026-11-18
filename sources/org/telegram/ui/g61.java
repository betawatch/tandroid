package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.bk0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public g61(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.L0;
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
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeActivity themeActivity = this.e;
        if (i7 == themeActivity.b0 || i7 == themeActivity.L || i7 == themeActivity.c0 || i7 == themeActivity.Z || i7 == themeActivity.Q || i7 == themeActivity.R || i7 == themeActivity.N || i7 == themeActivity.M) {
            return 1;
        }
        if (i7 == themeActivity.g0 || i7 == themeActivity.a0 || i7 == themeActivity.w0 || i7 == themeActivity.C0 || i7 == themeActivity.I0) {
            return 2;
        }
        if (i7 == themeActivity.s0 || i7 == themeActivity.W || i7 == themeActivity.d0 || i7 == themeActivity.P || i7 == themeActivity.i0 || i7 == themeActivity.o0 || i7 == themeActivity.l0 || i7 == themeActivity.K || i7 == themeActivity.K0 || i7 == themeActivity.A0 || i7 == themeActivity.D0 || i7 == themeActivity.E0 || i7 == themeActivity.F0) {
            return 3;
        }
        if (i7 == themeActivity.S || i7 == themeActivity.T || i7 == themeActivity.U || i7 == themeActivity.V) {
            return 4;
        }
        if (i7 == themeActivity.X || i7 == themeActivity.e0 || i7 == themeActivity.h0 || i7 == themeActivity.y || i7 == themeActivity.j0 || i7 == themeActivity.x || i7 == themeActivity.m0 || i7 == themeActivity.k0 || i7 == themeActivity.u0 || i7 == themeActivity.x0 || i7 == themeActivity.J0 || i7 == themeActivity.G0 || i7 == themeActivity.H0) {
            return 5;
        }
        if (i7 == themeActivity.f0) {
            return 6;
        }
        if (i7 == themeActivity.Y || i7 == themeActivity.H || i7 == themeActivity.F) {
            return 7;
        }
        i10 = themeActivity.raiseToListenRow;
        if (i7 == i10) {
            return 7;
        }
        i11 = themeActivity.pauseOnRecordRow;
        if (i7 == i11 || i7 == themeActivity.E || i7 == themeActivity.t0) {
            return 7;
        }
        i12 = themeActivity.pauseOnMediaRow;
        if (i7 == i12 || i7 == themeActivity.G) {
            return 7;
        }
        i13 = themeActivity.sensitiveContentRow;
        if (i7 == i13) {
            return 7;
        }
        i14 = themeActivity.textSizeRow;
        if (i7 == i14) {
            return 8;
        }
        if (i7 == themeActivity.n0) {
            return 9;
        }
        i15 = themeActivity.nightThemeRow;
        if (i7 == i15) {
            return 10;
        }
        i16 = themeActivity.browserRow;
        if (i7 == i16) {
            return 10;
        }
        if (i7 == themeActivity.p0) {
            return 11;
        }
        if (i7 == themeActivity.r0) {
            return 12;
        }
        i17 = themeActivity.bubbleRadiusRow;
        if (i7 == i17) {
            return 13;
        }
        i18 = themeActivity.backgroundRow;
        if (i7 == i18 || i7 == themeActivity.z0) {
            return 14;
        }
        i19 = themeActivity.createNewThemeRow;
        if (i7 == i19) {
            return 14;
        }
        i20 = themeActivity.liteModeRow;
        if (i7 == i20) {
            return 14;
        }
        i21 = themeActivity.stickersRow;
        if (i7 == i21 || i7 == themeActivity.B0) {
            return 14;
        }
        if (i7 == themeActivity.v0) {
            return 15;
        }
        if (i7 == themeActivity.y0) {
            return 16;
        }
        if (i7 == themeActivity.q0) {
            return 17;
        }
        if (i7 == themeActivity.I || i7 == themeActivity.J) {
            return 19;
        }
        i22 = themeActivity.appIconSelectorRow;
        if (i7 == i22) {
            return 20;
        }
        i23 = themeActivity.changeUserColor;
        return i7 == i23 ? 21 : 1;
    }

    @Override // v4.i0
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
        int i22 = f1Var.f;
        View view = f1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i22 == 1) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            i10 = themeActivity.nightThemeRow;
            if (i7 == i10) {
                if (org.telegram.ui.ActionBar.n6.o == 0 || org.telegram.ui.ActionBar.n6.J == null) {
                    w9Var.c(org.telegram.messenger.gd.M0(2131753782, null), org.telegram.messenger.gd.M0(2131753781, null), false, false);
                    return;
                } else {
                    w9Var.c(org.telegram.messenger.gd.M0(2131753782, null), org.telegram.ui.ActionBar.n6.C0(), false, false);
                    return;
                }
            }
            if (i7 == themeActivity.b0) {
                int i23 = org.telegram.ui.ActionBar.n6.r;
                int i24 = i23 / 60;
                w9Var.c(org.telegram.messenger.gd.M0(2131753790, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i23 - (i24 * 60))), false, true);
                return;
            }
            if (i7 == themeActivity.c0) {
                int i25 = org.telegram.ui.ActionBar.n6.s;
                int i26 = i25 / 60;
                w9Var.c(org.telegram.messenger.gd.M0(2131753780, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i25 - (i26 * 60))), false, false);
                return;
            }
            if (i7 == themeActivity.Z) {
                w9Var.c(org.telegram.messenger.gd.M0(2131753779, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.w, false, false);
                return;
            }
            if (i7 == themeActivity.R) {
                int i27 = org.telegram.messenger.mp.g1().getInt("sortContactsBy", 0);
                w9Var.c(org.telegram.messenger.gd.M0(2131745096, "SortBy"), i27 == 0 ? org.telegram.messenger.gd.M0(2131751589, "Default") : i27 == 1 ? org.telegram.messenger.gd.M0(2131745092, "FirstName") : org.telegram.messenger.gd.M0(2131745091, "LastName"), false, true);
                return;
            }
            if (i7 == themeActivity.Q) {
                w9Var.b(org.telegram.messenger.gd.M0(2131749072, "ImportContacts"), true);
                return;
            }
            if (i7 == themeActivity.L) {
                int i28 = org.telegram.messenger.bz.s1;
                w9Var.c(org.telegram.messenger.gd.M0(2131751356, "DistanceUnits"), i28 == 0 ? org.telegram.messenger.gd.M0(2131751355, "DistanceUnitsAutomatic") : i28 == 1 ? org.telegram.messenger.gd.M0(2131751354, "DistanceUnitsKilometers") : org.telegram.messenger.gd.M0(2131751353, "DistanceUnitsMiles"), themeActivity.Q0, themeActivity.F0 >= 0);
                themeActivity.Q0 = false;
                return;
            } else if (i7 == themeActivity.M) {
                w9Var.c(org.telegram.messenger.gd.M0(2131745604, null), org.telegram.ui.web.e1.a().a, themeActivity.R0, false);
                return;
            } else {
                if (i7 == themeActivity.N) {
                    w9Var.c(org.telegram.messenger.gd.M0(2131748247, null), org.telegram.messenger.gd.M0(org.telegram.messenger.bz.u0 ? 2131748245 : 2131748246, null), themeActivity.P0, false);
                    themeActivity.P0 = false;
                    return;
                }
                return;
            }
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i7 == themeActivity.g0) {
                z8Var.setText(org.telegram.messenger.gd.a0("AutoNightBrightnessInfo", null, 2131753792, Integer.valueOf((int) (org.telegram.ui.ActionBar.n6.q * 100.0f))));
                return;
            }
            if (i7 == themeActivity.a0) {
                z8Var.setText(ThemeActivity.D0());
                return;
            }
            if (i7 == themeActivity.w0) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131752210, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131748673, "LiteModeInfo"));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        if (i22 == 4) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (i7 == themeActivity.S) {
                baVar.a(org.telegram.messenger.gd.M0(2131753791, "AutoNightDisabled"), org.telegram.ui.ActionBar.n6.o == 0, true);
                return;
            }
            if (i7 == themeActivity.T) {
                baVar.a(org.telegram.messenger.gd.M0(2131753785, "AutoNightScheduled"), org.telegram.ui.ActionBar.n6.o == 1, true);
                return;
            } else if (i7 == themeActivity.U) {
                baVar.a(org.telegram.messenger.gd.M0(2131753794, "AutoNightAdaptive"), org.telegram.ui.ActionBar.n6.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i7 == themeActivity.V) {
                    baVar.a(org.telegram.messenger.gd.M0(2131753784, "AutoNightSystemDefault"), org.telegram.ui.ActionBar.n6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i22 == 5) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == themeActivity.X) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131753786, "AutoNightSchedule"));
                return;
            }
            if (i7 == themeActivity.e0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131753793, "AutoNightBrightness"));
                return;
            }
            if (i7 == themeActivity.h0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131753787, "AutoNightPreferred"));
                return;
            }
            if (i7 == themeActivity.y) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131745788, "SETTINGS"));
                return;
            }
            if (i7 == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    n4Var.setText(org.telegram.messenger.gd.M0(2131752828, "BuildMyOwnTheme"));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.gd.M0(2131752000, "ColorTheme"));
                    return;
                }
            }
            if (i7 == themeActivity.x) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131743956, "TextSizeHeader"));
                return;
            }
            if (i7 == themeActivity.m0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131752214, "ChatList"));
                return;
            }
            if (i7 == themeActivity.k0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131752829, "BubbleRadius"));
                return;
            }
            if (i7 == themeActivity.u0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131752211, "ChatListSwipeGesture"));
                return;
            }
            if (i7 == themeActivity.x0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131745456, "SelectTheme"));
                return;
            }
            if (i7 == themeActivity.J0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131754238, null));
                return;
            } else if (i7 == themeActivity.H0) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131747572, "OtherSettings"));
                return;
            } else {
                if (i7 == themeActivity.G0) {
                    n4Var.setText(org.telegram.messenger.gd.M0(2131748468, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i22 == 6) {
            ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.n6.q);
            return;
        }
        if (i22 == 7) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i7 == themeActivity.Y) {
                r8Var.f(org.telegram.messenger.gd.M0(2131753789, "AutoNightLocation"), org.telegram.ui.ActionBar.n6.p, true);
                return;
            }
            if (i7 == themeActivity.O) {
                r8Var.f(org.telegram.messenger.gd.M0(2131751146, "EnableAnimations"), org.telegram.messenger.mp.g1().getBoolean("view_animations", true), true);
                return;
            }
            if (i7 == themeActivity.H) {
                r8Var.f(org.telegram.messenger.gd.M0(2131745437, "SendByEnter"), org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i7 == themeActivity.F) {
                r8Var.g(org.telegram.messenger.gd.M0(2131746230, "RaiseToSpeak"), org.telegram.messenger.gd.M0(2131746229, "RaiseToSpeakInfo"), org.telegram.messenger.bz.r0, true, true);
                return;
            }
            i11 = themeActivity.raiseToListenRow;
            if (i7 == i11) {
                r8Var.g(org.telegram.messenger.gd.M0(2131746232, "RaiseToListen"), org.telegram.messenger.gd.M0(2131746231, "RaiseToListenInfo"), org.telegram.messenger.bz.s0, true, true);
                return;
            }
            if (i7 == themeActivity.G) {
                r8Var.g(org.telegram.messenger.gd.M0(2131748057, "NextMediaTap"), org.telegram.messenger.gd.M0(2131748056, "NextMediaTapInfo"), org.telegram.messenger.bz.t0, true, true);
                return;
            }
            i12 = themeActivity.pauseOnRecordRow;
            if (i7 == i12) {
                r8Var.g(org.telegram.messenger.gd.M0(2131747238, null), org.telegram.messenger.gd.M0(2131747237, "PauseMusicOnRecordInfo"), org.telegram.messenger.bz.F0, true, true);
                return;
            }
            i13 = themeActivity.pauseOnMediaRow;
            if (i7 == i13) {
                r8Var.f(org.telegram.messenger.gd.M0(2131747239, null), org.telegram.messenger.bz.G0, true);
                return;
            }
            if (i7 == themeActivity.E) {
                r8Var.g(org.telegram.messenger.gd.M0(2131751427, "DirectShare"), org.telegram.messenger.gd.M0(2131751426, "DirectShareInfo"), org.telegram.messenger.bz.x0, false, true);
                return;
            }
            i14 = themeActivity.sensitiveContentRow;
            if (i7 == i14) {
                r8Var.g(org.telegram.messenger.gd.M0(2131745135, null), org.telegram.messenger.gd.M0(2131745134, null), themeActivity.getMessagesController().e5(), true, true);
                return;
            } else {
                if (i7 == themeActivity.t0) {
                    r8Var.f(org.telegram.messenger.gd.M0(2131753673, "BlurInChat"), org.telegram.messenger.bz.f(), true);
                    return;
                }
                return;
            }
        }
        if (i22 != 14) {
            if (i22 == 17) {
                ((xt) view).a();
                return;
            }
            if (i22 == 19) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (i7 == themeActivity.I) {
                    h6Var.b("save media only from peer chats", "", true, false);
                    return;
                } else {
                    h6Var.b("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i22 == 21) {
                ((rl0) view).set(themeActivity.getUserConfig().f());
                return;
            }
            switch (i22) {
                case 10:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    i20 = themeActivity.nightThemeRow;
                    if (i7 != i20) {
                        i21 = themeActivity.browserRow;
                        if (i7 == i21) {
                            i5Var.b(org.telegram.messenger.gd.M0(2131749017, null), org.telegram.messenger.gd.M0(2131749016, null), R.drawable.msg2_language, themeActivity.getMessagesController().S2(), 0, false, true, false);
                            break;
                        }
                    } else {
                        boolean z10 = org.telegram.ui.ActionBar.n6.o != 0;
                        String C0 = z10 ? org.telegram.ui.ActionBar.n6.C0() : org.telegram.messenger.gd.M0(2131753781, "AutoNightThemeOff");
                        if (z10) {
                            int i29 = org.telegram.ui.ActionBar.n6.o;
                            C0 = a8.p0.E(i29 == 1 ? org.telegram.messenger.gd.M0(2131753785, "AutoNightScheduled") : i29 == 3 ? org.telegram.messenger.gd.M0(2131753784, "AutoNightSystemDefault") : org.telegram.messenger.gd.M0(2131753794, "AutoNightAdaptive"), " ", C0);
                        }
                        i5Var.b(org.telegram.messenger.gd.M0(2131753782, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
                        break;
                    }
                    break;
                case 11:
                    if (this.d) {
                        themeActivity.c.A1(themeActivity.b.getMeasuredWidth());
                        this.d = false;
                        break;
                    }
                    break;
                case 12:
                    org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) view;
                    i61 i61Var = (i61) ck0Var.getAdapter();
                    i61Var.f();
                    int indexOf = i61Var.e.indexOf(i61Var.d.k(false));
                    if (indexOf == -1) {
                        indexOf = i61Var.b() - 1;
                    }
                    if (indexOf != -1) {
                        ((v4.c0) ck0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                        break;
                    }
                    break;
            }
            return;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.w = 48;
        i15 = themeActivity.backgroundRow;
        if (i7 == i15) {
            m8Var.setSubtitle(null);
            int i30 = org.telegram.ui.ActionBar.n6.q6;
            m8Var.g(i30, i30);
            String M0 = org.telegram.messenger.gd.M0(2131752539, null);
            i19 = themeActivity.changeUserColor;
            m8Var.o(R.drawable.msg_background, M0, i19 >= 0);
            return;
        }
        if (i7 == themeActivity.z0) {
            m8Var.setSubtitle(null);
            int i31 = org.telegram.ui.ActionBar.n6.q6;
            m8Var.g(i31, i31);
            m8Var.o(R.drawable.msg_theme, org.telegram.messenger.gd.M0(2131751270, null), true);
            return;
        }
        i16 = themeActivity.createNewThemeRow;
        if (i7 == i16) {
            m8Var.setSubtitle(null);
            int i32 = org.telegram.ui.ActionBar.n6.q6;
            m8Var.g(i32, i32);
            m8Var.o(R.drawable.msg_colors, org.telegram.messenger.gd.M0(2131751701, null), false);
            return;
        }
        i17 = themeActivity.liteModeRow;
        if (i7 == i17) {
            m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
            m8Var.o(R.drawable.msg2_animations, org.telegram.messenger.gd.M0(2131748674, null), true);
            m8Var.setSubtitle(org.telegram.messenger.gd.M0(2131748673, null));
            m8Var.w = 60;
            m8Var.s = 64;
            m8Var.x = 20;
            return;
        }
        i18 = themeActivity.stickersRow;
        if (i7 == i18) {
            m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
            m8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.gd.M0(2131744622, null), true);
            m8Var.setSubtitle(org.telegram.messenger.gd.M0(2131744621, null));
            m8Var.s = 64;
            m8Var.w = 60;
            m8Var.x = 20;
            return;
        }
        if (i7 == themeActivity.B0) {
            m8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
            m8Var.o(R.drawable.msg2_speech, org.telegram.messenger.gd.M0(2131745041, null), false);
            m8Var.setSubtitle(org.telegram.messenger.gd.M0(2131745042, null));
            m8Var.s = 64;
            m8Var.w = 60;
            m8Var.x = 20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, org.telegram.ui.Cells.ba] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [org.telegram.ui.rl0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, org.telegram.ui.d61] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? baVar;
        View i5Var;
        int i10;
        org.telegram.ui.ActionBar.s4 s4Var;
        int i11;
        int i12;
        int i13 = 4;
        int i14 = 2;
        int i15 = 1;
        org.telegram.ui.ActionBar.i6 i6Var = null;
        int i16 = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i7) {
            case 1:
                i5Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 2:
                i5Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                i5Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                baVar.a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                boolean z10 = org.telegram.messenger.gd.a0;
                baVar.addView(textView, c8.ma.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                baVar.b = imageView;
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                baVar.addView(imageView, c8.ma.d(19, 14.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                i5Var = baVar;
                break;
            case 5:
                i5Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                i5Var = new c61(this, context);
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                i5Var = new h61(themeActivity, context);
                break;
            case 9:
                baVar = new d61(context, 0);
                baVar.b = new org.telegram.ui.Cells.w0[2];
                baVar.setOrientation(0);
                baVar.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i17 = 0;
                while (true) {
                    org.telegram.ui.Cells.w0[] w0VarArr = (org.telegram.ui.Cells.w0[]) baVar.b;
                    if (i17 >= w0VarArr.length) {
                        i5Var = baVar;
                        break;
                    } else {
                        boolean z11 = i17 == 1;
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, 0);
                        w0Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        w0Var.e = textPaint;
                        w0Var.setWillNotDraw(false);
                        w0Var.c = z11;
                        w0Var.setContentDescription(org.telegram.messenger.gd.M0(z11 ? 2131752212 : 2131752213, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(w0Var, context);
                        w0Var.d = v0Var;
                        v0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        w0Var.addView(v0Var, c8.ma.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        v0Var.a((z11 && org.telegram.messenger.bz.p1) || !(z11 || org.telegram.messenger.bz.p1), false);
                        w0VarArr[i17] = w0Var;
                        baVar.addView(((org.telegram.ui.Cells.w0[]) baVar.b)[i17], c8.ma.m(0.5f, -1, -1, i17 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.w0[]) baVar.b)[i17].setOnClickListener(new fi.v1(r0, baVar, z11));
                        i17++;
                    }
                }
                break;
            case 10:
                i5Var = new org.telegram.ui.Cells.i5(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                e61 e61Var = new e61(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = e61Var;
                e61Var.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view = themeActivity.c;
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(148.0f)));
                i5Var = view;
                break;
            case 12:
                f61 f61Var = new f61(i16, context, i6Var);
                f61Var.setFocusable(false);
                f61Var.setItemAnimator(null);
                f61Var.setLayoutAnimation(null);
                f61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                f61Var.setClipToPadding(false);
                v4.c0 c0Var = new v4.c0();
                c0Var.j1(0);
                f61Var.setLayoutManager(c0Var);
                i61 i61Var = new i61(themeActivity, context);
                f61Var.setAdapter(i61Var);
                f61Var.setOnItemClickListener(new a61(this, i61Var, f61Var, i16));
                f61Var.setOnItemLongClickListener(new aj0(20, this, i61Var));
                f61Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(62.0f)));
                i5Var = f61Var;
                break;
            case 13:
                i5Var = new x51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                i5Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i10 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                i5Var = new org.telegram.ui.Components.ex0(context, i10);
                break;
            case 16:
                s4Var = ((org.telegram.ui.ActionBar.h2) themeActivity).parentLayout;
                View am0Var = new am0(context, s4Var, 0);
                am0Var.setImportantForAccessibility(4);
                i5Var = am0Var;
                break;
            case 17:
                View xtVar = new xt(themeActivity.f, context, themeActivity);
                xtVar.setFocusable(false);
                xtVar.setLayoutParams(new v4.q0(-1, -2));
                i5Var = xtVar;
                break;
            case 19:
                i5Var = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.f3 = new ArrayList();
                tVar.h3 = i11;
                tVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                v4.c0 c0Var2 = new v4.c0(0, false);
                tVar.g3 = c0Var2;
                tVar.setLayoutManager(c0Var2);
                tVar.setAdapter(new y7(tVar, i15));
                tVar.i(new ai.i0(tVar, i14));
                tVar.setOnItemClickListener(new bi.p1(tVar, themeActivity, context, i13));
                tVar.z1();
                i5Var = tVar;
                break;
            case 21:
                i12 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                baVar = new rl0(i12, 0L, this.c, themeActivity.getResourceProvider());
                i5Var = baVar;
                break;
        }
        return new org.telegram.ui.Components.kj0(i5Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        if (f1Var.f == 4) {
            ((org.telegram.ui.Cells.ba) f1Var.a).setTypeChecked(f1Var.b() == org.telegram.ui.ActionBar.n6.o);
        }
    }
}
