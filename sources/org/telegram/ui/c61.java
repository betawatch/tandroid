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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c61 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public c61(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.L0;
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

    @Override // v4.h0
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
        int i22 = e1Var.f;
        View view = e1Var.a;
        ThemeActivity themeActivity = this.e;
        if (i22 == 1) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            i10 = themeActivity.nightThemeRow;
            if (i7 == i10) {
                if (org.telegram.ui.ActionBar.j6.o == 0 || org.telegram.ui.ActionBar.j6.J == null) {
                    v9Var.c(org.telegram.messenger.hd.M0(2131753784, null), org.telegram.messenger.hd.M0(2131753783, null), false, false);
                    return;
                } else {
                    v9Var.c(org.telegram.messenger.hd.M0(2131753784, null), org.telegram.ui.ActionBar.j6.C0(), false, false);
                    return;
                }
            }
            if (i7 == themeActivity.b0) {
                int i23 = org.telegram.ui.ActionBar.j6.r;
                int i24 = i23 / 60;
                v9Var.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i24), Integer.valueOf(i23 - (i24 * 60))), false, true);
                return;
            }
            if (i7 == themeActivity.c0) {
                int i25 = org.telegram.ui.ActionBar.j6.s;
                int i26 = i25 / 60;
                v9Var.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i26), Integer.valueOf(i25 - (i26 * 60))), false, false);
                return;
            }
            if (i7 == themeActivity.Z) {
                v9Var.c(org.telegram.messenger.hd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.j6.w, false, false);
                return;
            }
            if (i7 == themeActivity.R) {
                int i27 = org.telegram.messenger.np.e1().getInt("sortContactsBy", 0);
                v9Var.c(org.telegram.messenger.hd.M0(2131745291, "SortBy"), i27 == 0 ? org.telegram.messenger.hd.M0(2131751600, "Default") : i27 == 1 ? org.telegram.messenger.hd.M0(2131745287, "FirstName") : org.telegram.messenger.hd.M0(2131745286, "LastName"), false, true);
                return;
            }
            if (i7 == themeActivity.Q) {
                v9Var.b(org.telegram.messenger.hd.M0(2131749264, "ImportContacts"), true);
                return;
            }
            if (i7 == themeActivity.L) {
                int i28 = org.telegram.messenger.gz.s1;
                v9Var.c(org.telegram.messenger.hd.M0(2131751367, "DistanceUnits"), i28 == 0 ? org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsAutomatic") : i28 == 1 ? org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsKilometers") : org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsMiles"), themeActivity.Q0, themeActivity.F0 >= 0);
                themeActivity.Q0 = false;
                return;
            } else if (i7 == themeActivity.M) {
                v9Var.c(org.telegram.messenger.hd.M0(2131745799, null), org.telegram.ui.web.d1.a().a, themeActivity.R0, false);
                return;
            } else {
                if (i7 == themeActivity.N) {
                    v9Var.c(org.telegram.messenger.hd.M0(2131748439, null), org.telegram.messenger.hd.M0(org.telegram.messenger.gz.u0 ? 2131748437 : 2131748438, null), themeActivity.P0, false);
                    themeActivity.P0 = false;
                    return;
                }
                return;
            }
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i7 == themeActivity.g0) {
                y8Var.setText(org.telegram.messenger.hd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.q * 100.0f))));
                return;
            }
            if (i7 == themeActivity.a0) {
                y8Var.setText(ThemeActivity.D0());
                return;
            }
            if (i7 == themeActivity.w0) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131748865, "LiteModeInfo"));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        if (i22 == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i7 == themeActivity.S) {
                aaVar.a(org.telegram.messenger.hd.M0(2131753793, "AutoNightDisabled"), org.telegram.ui.ActionBar.j6.o == 0, true);
                return;
            }
            if (i7 == themeActivity.T) {
                aaVar.a(org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled"), org.telegram.ui.ActionBar.j6.o == 1, true);
                return;
            } else if (i7 == themeActivity.U) {
                aaVar.a(org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive"), org.telegram.ui.ActionBar.j6.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i7 == themeActivity.V) {
                    aaVar.a(org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault"), org.telegram.ui.ActionBar.j6.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i22 == 5) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == themeActivity.X) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753788, "AutoNightSchedule"));
                return;
            }
            if (i7 == themeActivity.e0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753795, "AutoNightBrightness"));
                return;
            }
            if (i7 == themeActivity.h0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131753789, "AutoNightPreferred"));
                return;
            }
            if (i7 == themeActivity.y) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131745983, "SETTINGS"));
                return;
            }
            if (i7 == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131752839, "BuildMyOwnTheme"));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131752011, "ColorTheme"));
                    return;
                }
            }
            if (i7 == themeActivity.x) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131744191, "TextSizeHeader"));
                return;
            }
            if (i7 == themeActivity.m0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131752225, "ChatList"));
                return;
            }
            if (i7 == themeActivity.k0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131752840, "BubbleRadius"));
                return;
            }
            if (i7 == themeActivity.u0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131752222, "ChatListSwipeGesture"));
                return;
            }
            if (i7 == themeActivity.x0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131745651, "SelectTheme"));
                return;
            }
            if (i7 == themeActivity.J0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131754240, null));
                return;
            } else if (i7 == themeActivity.H0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747765, "OtherSettings"));
                return;
            } else {
                if (i7 == themeActivity.G0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131748660, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i22 == 6) {
            ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.j6.q);
            return;
        }
        if (i22 == 7) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i7 == themeActivity.Y) {
                q8Var.f(org.telegram.messenger.hd.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.j6.p, true);
                return;
            }
            if (i7 == themeActivity.O) {
                q8Var.f(org.telegram.messenger.hd.M0(2131751157, "EnableAnimations"), org.telegram.messenger.np.e1().getBoolean("view_animations", true), true);
                return;
            }
            if (i7 == themeActivity.H) {
                q8Var.f(org.telegram.messenger.hd.M0(2131745632, "SendByEnter"), org.telegram.messenger.np.e1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i7 == themeActivity.F) {
                q8Var.g(org.telegram.messenger.hd.M0(2131746425, "RaiseToSpeak"), org.telegram.messenger.hd.M0(2131746424, "RaiseToSpeakInfo"), org.telegram.messenger.gz.r0, true, true);
                return;
            }
            i11 = themeActivity.raiseToListenRow;
            if (i7 == i11) {
                q8Var.g(org.telegram.messenger.hd.M0(2131746427, "RaiseToListen"), org.telegram.messenger.hd.M0(2131746426, "RaiseToListenInfo"), org.telegram.messenger.gz.s0, true, true);
                return;
            }
            if (i7 == themeActivity.G) {
                q8Var.g(org.telegram.messenger.hd.M0(2131748249, "NextMediaTap"), org.telegram.messenger.hd.M0(2131748248, "NextMediaTapInfo"), org.telegram.messenger.gz.t0, true, true);
                return;
            }
            i12 = themeActivity.pauseOnRecordRow;
            if (i7 == i12) {
                q8Var.g(org.telegram.messenger.hd.M0(2131747431, null), org.telegram.messenger.hd.M0(2131747430, "PauseMusicOnRecordInfo"), org.telegram.messenger.gz.F0, true, true);
                return;
            }
            i13 = themeActivity.pauseOnMediaRow;
            if (i7 == i13) {
                q8Var.f(org.telegram.messenger.hd.M0(2131747432, null), org.telegram.messenger.gz.G0, true);
                return;
            }
            if (i7 == themeActivity.E) {
                q8Var.g(org.telegram.messenger.hd.M0(2131751438, "DirectShare"), org.telegram.messenger.hd.M0(2131751437, "DirectShareInfo"), org.telegram.messenger.gz.x0, false, true);
                return;
            }
            i14 = themeActivity.sensitiveContentRow;
            if (i7 == i14) {
                q8Var.g(org.telegram.messenger.hd.M0(2131745330, null), org.telegram.messenger.hd.M0(2131745329, null), themeActivity.getMessagesController().T4(), true, true);
                return;
            } else {
                if (i7 == themeActivity.t0) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131753675, "BlurInChat"), org.telegram.messenger.gz.f(), true);
                    return;
                }
                return;
            }
        }
        if (i22 != 14) {
            if (i22 == 17) {
                ((vt) view).a();
                return;
            }
            if (i22 == 19) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                if (i7 == themeActivity.I) {
                    g6Var.b("save media only from peer chats", "", true, false);
                    return;
                } else {
                    g6Var.b("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i22 == 21) {
                ((pl0) view).set(themeActivity.getUserConfig().f());
                return;
            }
            switch (i22) {
                case 10:
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                    i20 = themeActivity.nightThemeRow;
                    if (i7 != i20) {
                        i21 = themeActivity.browserRow;
                        if (i7 == i21) {
                            h5Var.b(org.telegram.messenger.hd.M0(2131749209, null), org.telegram.messenger.hd.M0(2131749208, null), R.drawable.msg2_language, themeActivity.getMessagesController().M2(), 0, false, true, false);
                            break;
                        }
                    } else {
                        boolean z10 = org.telegram.ui.ActionBar.j6.o != 0;
                        String C0 = z10 ? org.telegram.ui.ActionBar.j6.C0() : org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
                        if (z10) {
                            int i29 = org.telegram.ui.ActionBar.j6.o;
                            C0 = a8.p0.E(i29 == 1 ? org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled") : i29 == 3 ? org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault") : org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive"), " ", C0);
                        }
                        h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), C0, R.drawable.menu_night_mode_24, z10, 0, false, true, false);
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
                    org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) view;
                    e61 e61Var = (e61) uj0Var.getAdapter();
                    e61Var.f();
                    int indexOf = e61Var.e.indexOf(e61Var.d.k(false));
                    if (indexOf == -1) {
                        indexOf = e61Var.b() - 1;
                    }
                    if (indexOf != -1) {
                        ((v4.b0) uj0Var.getLayoutManager()).h1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                        break;
                    }
                    break;
            }
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        l8Var.w = 48;
        i15 = themeActivity.backgroundRow;
        if (i7 == i15) {
            l8Var.setSubtitle(null);
            int i30 = org.telegram.ui.ActionBar.j6.q6;
            l8Var.g(i30, i30);
            String M0 = org.telegram.messenger.hd.M0(2131752550, null);
            i19 = themeActivity.changeUserColor;
            l8Var.o(R.drawable.msg_background, M0, i19 >= 0);
            return;
        }
        if (i7 == themeActivity.z0) {
            l8Var.setSubtitle(null);
            int i31 = org.telegram.ui.ActionBar.j6.q6;
            l8Var.g(i31, i31);
            l8Var.o(R.drawable.msg_theme, org.telegram.messenger.hd.M0(2131751281, null), true);
            return;
        }
        i16 = themeActivity.createNewThemeRow;
        if (i7 == i16) {
            l8Var.setSubtitle(null);
            int i32 = org.telegram.ui.ActionBar.j6.q6;
            l8Var.g(i32, i32);
            l8Var.o(R.drawable.msg_colors, org.telegram.messenger.hd.M0(2131751712, null), false);
            return;
        }
        i17 = themeActivity.liteModeRow;
        if (i7 == i17) {
            l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
            l8Var.o(R.drawable.msg2_animations, org.telegram.messenger.hd.M0(2131748866, null), true);
            l8Var.setSubtitle(org.telegram.messenger.hd.M0(2131748865, null));
            l8Var.w = 60;
            l8Var.s = 64;
            l8Var.x = 20;
            return;
        }
        i18 = themeActivity.stickersRow;
        if (i7 == i18) {
            l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
            l8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.hd.M0(2131744857, null), true);
            l8Var.setSubtitle(org.telegram.messenger.hd.M0(2131744856, null));
            l8Var.s = 64;
            l8Var.w = 60;
            l8Var.x = 20;
            return;
        }
        if (i7 == themeActivity.B0) {
            l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
            l8Var.o(R.drawable.msg2_speech, "Speech to Text", false);
            l8Var.setSubtitle("Voice message transcription and dictation");
            l8Var.s = 64;
            l8Var.w = 60;
            l8Var.x = 20;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        org.telegram.ui.ActionBar.o4 o4Var;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 1;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        int i15 = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.v9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 4:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                aaVar.a = textView;
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                boolean z10 = org.telegram.messenger.hd.a0;
                aaVar.addView(textView, c8.ja.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 71.0f : 21.0f, 0.0f, z10 ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                aaVar.b = imageView;
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                aaVar.addView(imageView, c8.ja.d(19, 14.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = aaVar;
                break;
            case 5:
                view = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                view = new y51(this, context);
                break;
            case 7:
                view = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                view = new d61(themeActivity, context);
                break;
            case 9:
                z51 z51Var = new z51(context, 0);
                z51Var.b = new org.telegram.ui.Cells.v0[2];
                z51Var.setOrientation(0);
                z51Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i16 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) z51Var.b;
                    if (i16 >= v0VarArr.length) {
                        view = z51Var;
                        break;
                    } else {
                        boolean z11 = i16 == 1;
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.c = z11;
                        v0Var.setContentDescription(org.telegram.messenger.hd.M0(z11 ? 2131752223 : 2131752224, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, c8.ja.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        u0Var.a((z11 && org.telegram.messenger.gz.p1) || !(z11 || org.telegram.messenger.gz.p1), false);
                        v0VarArr[i16] = v0Var;
                        z51Var.addView(((org.telegram.ui.Cells.v0[]) z51Var.b)[i16], c8.ja.m(0.5f, -1, -1, i16 == 1 ? 10 : 0, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) z51Var.b)[i16].setOnClickListener(new fi.x1(r2, z51Var, z11));
                        i16++;
                    }
                }
                break;
            case 10:
                view = new org.telegram.ui.Cells.h5(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                a61 a61Var = new a61(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = a61Var;
                a61Var.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(148.0f)));
                view = view2;
                break;
            case 12:
                b61 b61Var = new b61(i15, context, e6Var);
                b61Var.setFocusable(false);
                b61Var.setItemAnimator(null);
                b61Var.setLayoutAnimation(null);
                b61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                b61Var.setClipToPadding(false);
                v4.b0 b0Var = new v4.b0();
                b0Var.j1(0);
                b61Var.setLayoutManager(b0Var);
                e61 e61Var = new e61(themeActivity, context);
                b61Var.setAdapter(e61Var);
                b61Var.setOnItemClickListener(new w51(this, e61Var, b61Var, i15));
                b61Var.setOnItemLongClickListener(new xi0(21, this, e61Var));
                b61Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(62.0f)));
                view = b61Var;
                break;
            case 13:
                view = new t51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new org.telegram.ui.Cells.l8(context);
                break;
            case 15:
                i10 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                view = new org.telegram.ui.Components.xw0(context, i10);
                break;
            case 16:
                o4Var = ((org.telegram.ui.ActionBar.e2) themeActivity).parentLayout;
                View yl0Var = new yl0(context, o4Var, 0);
                yl0Var.setImportantForAccessibility(4);
                view = yl0Var;
                break;
            case 17:
                View vtVar = new vt(themeActivity.f, context, themeActivity);
                vtVar.setFocusable(false);
                vtVar.setLayoutParams(new v4.p0(-1, -2));
                view = vtVar;
                break;
            case 19:
                view = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i11 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                org.telegram.ui.Cells.t tVar = new org.telegram.ui.Cells.t(context, null);
                tVar.f3 = new ArrayList();
                tVar.h3 = i11;
                tVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                tVar.setFocusable(false);
                tVar.setItemAnimator(null);
                tVar.setLayoutAnimation(null);
                v4.b0 b0Var2 = new v4.b0(0, false);
                tVar.g3 = b0Var2;
                tVar.setLayoutManager(b0Var2);
                tVar.setAdapter(new y7(tVar, i14));
                tVar.i(new ai.i0(tVar, i13));
                tVar.setOnItemClickListener(new fi.f0(tVar, themeActivity, context, r2));
                tVar.z1();
                view = tVar;
                break;
            case 21:
                i12 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                view = new pl0(i12, 0L, this.c, themeActivity.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.cj0(view);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        if (e1Var.f == 4) {
            ((org.telegram.ui.Cells.aa) e1Var.a).setTypeChecked(e1Var.b() == org.telegram.ui.ActionBar.j6.o);
        }
    }
}
