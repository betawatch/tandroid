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
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d0 extends q59 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21;
    }

    @Override // y59
    public final int b() {
        return this.e.L0;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ThemeActivity themeActivity = this.e;
        if (i == themeActivity.b0 || i == themeActivity.L || i == themeActivity.c0 || i == themeActivity.Z || i == themeActivity.Q || i == themeActivity.R || i == themeActivity.N || i == themeActivity.M) {
            return 1;
        }
        if (i == themeActivity.g0 || i == themeActivity.a0 || i == themeActivity.w0 || i == themeActivity.C0 || i == themeActivity.I0) {
            return 2;
        }
        if (i == themeActivity.s0 || i == themeActivity.W || i == themeActivity.d0 || i == themeActivity.P || i == themeActivity.i0 || i == themeActivity.o0 || i == themeActivity.l0 || i == themeActivity.K || i == themeActivity.K0 || i == themeActivity.A0 || i == themeActivity.D0 || i == themeActivity.E0 || i == themeActivity.F0) {
            return 3;
        }
        if (i == themeActivity.S || i == themeActivity.T || i == themeActivity.U || i == themeActivity.V) {
            return 4;
        }
        if (i == themeActivity.X || i == themeActivity.e0 || i == themeActivity.h0 || i == themeActivity.y || i == themeActivity.j0 || i == themeActivity.x || i == themeActivity.m0 || i == themeActivity.k0 || i == themeActivity.u0 || i == themeActivity.x0 || i == themeActivity.J0 || i == themeActivity.G0 || i == themeActivity.H0) {
            return 5;
        }
        if (i == themeActivity.f0) {
            return 6;
        }
        if (i == themeActivity.Y || i == themeActivity.H || i == themeActivity.F) {
            return 7;
        }
        i2 = themeActivity.raiseToListenRow;
        if (i == i2) {
            return 7;
        }
        i3 = themeActivity.pauseOnRecordRow;
        if (i == i3 || i == themeActivity.E || i == themeActivity.t0) {
            return 7;
        }
        i4 = themeActivity.pauseOnMediaRow;
        if (i == i4 || i == themeActivity.G) {
            return 7;
        }
        i5 = themeActivity.sensitiveContentRow;
        if (i == i5) {
            return 7;
        }
        i6 = themeActivity.textSizeRow;
        if (i == i6) {
            return 8;
        }
        if (i == themeActivity.n0) {
            return 9;
        }
        i7 = themeActivity.nightThemeRow;
        if (i == i7) {
            return 10;
        }
        i8 = themeActivity.browserRow;
        if (i == i8) {
            return 10;
        }
        if (i == themeActivity.p0) {
            return 11;
        }
        if (i == themeActivity.r0) {
            return 12;
        }
        i9 = themeActivity.bubbleRadiusRow;
        if (i == i9) {
            return 13;
        }
        i10 = themeActivity.backgroundRow;
        if (i == i10 || i == themeActivity.z0) {
            return 14;
        }
        i11 = themeActivity.createNewThemeRow;
        if (i == i11) {
            return 14;
        }
        i12 = themeActivity.liteModeRow;
        if (i == i12) {
            return 14;
        }
        i13 = themeActivity.stickersRow;
        if (i == i13 || i == themeActivity.B0) {
            return 14;
        }
        if (i == themeActivity.v0) {
            return 15;
        }
        if (i == themeActivity.y0) {
            return 16;
        }
        if (i == themeActivity.q0) {
            return 17;
        }
        if (i == themeActivity.I || i == themeActivity.J) {
            return 19;
        }
        i14 = themeActivity.appIconSelectorRow;
        if (i == i14) {
            return 20;
        }
        i15 = themeActivity.changeUserColor;
        return i == i15 ? 21 : 1;
    }

    @Override // y59
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
        int i14 = u69Var.f;
        View view = u69Var.a;
        ThemeActivity themeActivity = this.e;
        if (i14 == 1) {
            vkb vkbVar = (vkb) view;
            i2 = themeActivity.nightThemeRow;
            if (i == i2) {
                if (cmb.o == 0 || cmb.J == null) {
                    vkbVar.c(jb6.M0(2131753749, null), jb6.M0(2131753748, null), false, false);
                    return;
                } else {
                    vkbVar.c(jb6.M0(2131753749, null), cmb.A0(), false, false);
                    return;
                }
            }
            if (i == themeActivity.b0) {
                int i15 = cmb.r;
                int i16 = i15 / 60;
                vkbVar.c(jb6.M0(2131753757, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i15 - (i16 * 60))), false, true);
                return;
            }
            if (i == themeActivity.c0) {
                int i17 = cmb.s;
                int i18 = i17 / 60;
                vkbVar.c(jb6.M0(2131753747, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i18), Integer.valueOf(i17 - (i18 * 60))), false, false);
                return;
            }
            if (i == themeActivity.Z) {
                vkbVar.c(jb6.M0(2131753746, "AutoNightUpdateLocation"), cmb.w, false, false);
                return;
            }
            if (i == themeActivity.R) {
                int i19 = oc7.d1().getInt("sortContactsBy", 0);
                vkbVar.c(jb6.M0(2131745025, "SortBy"), i19 == 0 ? jb6.M0(2131751537, "Default") : i19 == 1 ? jb6.M0(2131745021, "FirstName") : jb6.M0(2131745020, "LastName"), false, true);
                return;
            }
            if (i == themeActivity.Q) {
                vkbVar.b(jb6.M0(2131749021, "ImportContacts"), true);
                return;
            }
            if (i == themeActivity.L) {
                int i20 = gda.o1;
                vkbVar.c(jb6.M0(2131751304, "DistanceUnits"), i20 == 0 ? jb6.M0(2131751303, "DistanceUnitsAutomatic") : i20 == 1 ? jb6.M0(2131751302, "DistanceUnitsKilometers") : jb6.M0(2131751301, "DistanceUnitsMiles"), themeActivity.Q0, themeActivity.F0 >= 0);
                themeActivity.Q0 = false;
                return;
            } else if (i == themeActivity.M) {
                vkbVar.c(jb6.M0(2131745533, null), ku9.a().a, themeActivity.R0, false);
                return;
            } else {
                if (i == themeActivity.N) {
                    vkbVar.c(jb6.M0(2131748196, null), jb6.M0(gda.r0 ? 2131748194 : 2131748195, null), themeActivity.P0, false);
                    themeActivity.P0 = false;
                    return;
                }
                return;
            }
        }
        if (i14 == 2) {
            njb njbVar = (njb) view;
            njbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                njbVar.setText(jb6.a0("AutoNightBrightnessInfo", null, 2131753759, Integer.valueOf((int) (cmb.q * 100.0f))));
                return;
            }
            if (i == themeActivity.a0) {
                njbVar.setText(ThemeActivity.x0());
                return;
            }
            if (i == themeActivity.w0) {
                njbVar.setText(jb6.M0(2131752158, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                njbVar.setText(jb6.M0(2131748622, "LiteModeInfo"));
                return;
            } else {
                njbVar.setFixedSize(12);
                njbVar.setText("");
                return;
            }
        }
        if (i14 == 4) {
            cpb cpbVar = (cpb) view;
            if (i == themeActivity.S) {
                cpbVar.a(jb6.M0(2131753758, "AutoNightDisabled"), cmb.o == 0, true);
                return;
            }
            if (i == themeActivity.T) {
                cpbVar.a(jb6.M0(2131753752, "AutoNightScheduled"), cmb.o == 1, true);
                return;
            } else if (i == themeActivity.U) {
                cpbVar.a(jb6.M0(2131753761, "AutoNightAdaptive"), cmb.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i == themeActivity.V) {
                    cpbVar.a(jb6.M0(2131753751, "AutoNightSystemDefault"), cmb.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i14 == 5) {
            jf5 jf5Var = (jf5) view;
            if (i == themeActivity.X) {
                jf5Var.setText(jb6.M0(2131753753, "AutoNightSchedule"));
                return;
            }
            if (i == themeActivity.e0) {
                jf5Var.setText(jb6.M0(2131753760, "AutoNightBrightness"));
                return;
            }
            if (i == themeActivity.h0) {
                jf5Var.setText(jb6.M0(2131753754, "AutoNightPreferred"));
                return;
            }
            if (i == themeActivity.y) {
                jf5Var.setText(jb6.M0(2131745717, "SETTINGS"));
                return;
            }
            if (i == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    jf5Var.setText(jb6.M0(2131752792, "BuildMyOwnTheme"));
                    return;
                } else {
                    jf5Var.setText(jb6.M0(2131751948, "ColorTheme"));
                    return;
                }
            }
            if (i == themeActivity.x) {
                jf5Var.setText(jb6.M0(2131743876, "TextSizeHeader"));
                return;
            }
            if (i == themeActivity.m0) {
                jf5Var.setText(jb6.M0(2131752162, "ChatList"));
                return;
            }
            if (i == themeActivity.k0) {
                jf5Var.setText(jb6.M0(2131752793, "BubbleRadius"));
                return;
            }
            if (i == themeActivity.u0) {
                jf5Var.setText(jb6.M0(2131752159, "ChatListSwipeGesture"));
                return;
            }
            if (i == themeActivity.x0) {
                jf5Var.setText(jb6.M0(2131745385, "SelectTheme"));
                return;
            }
            if (i == themeActivity.J0) {
                jf5Var.setText(jb6.M0(2131754205, null));
                return;
            } else if (i == themeActivity.H0) {
                jf5Var.setText(jb6.M0(2131747498, "OtherSettings"));
                return;
            } else {
                if (i == themeActivity.G0) {
                    jf5Var.setText(jb6.M0(2131748417, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i14 == 6) {
            ((b01) view).setProgress(cmb.q);
            return;
        }
        if (i14 == 7) {
            bjb bjbVar = (bjb) view;
            if (i == themeActivity.Y) {
                bjbVar.f(jb6.M0(2131753756, "AutoNightLocation"), cmb.p, true);
                return;
            }
            if (i == themeActivity.O) {
                bjbVar.f(jb6.M0(2131751094, "EnableAnimations"), oc7.d1().getBoolean("view_animations", true), true);
                return;
            }
            if (i == themeActivity.H) {
                bjbVar.f(jb6.M0(2131745366, "SendByEnter"), oc7.d1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i == themeActivity.F) {
                bjbVar.g(jb6.M0(2131746158, "RaiseToSpeak"), jb6.M0(2131746157, "RaiseToSpeakInfo"), gda.o0, true, true);
                return;
            }
            i3 = themeActivity.raiseToListenRow;
            if (i == i3) {
                bjbVar.g(jb6.M0(2131746160, "RaiseToListen"), jb6.M0(2131746159, "RaiseToListenInfo"), gda.p0, true, true);
                return;
            }
            if (i == themeActivity.G) {
                bjbVar.g(jb6.M0(2131747983, "NextMediaTap"), jb6.M0(2131747982, "NextMediaTapInfo"), gda.q0, true, true);
                return;
            }
            i4 = themeActivity.pauseOnRecordRow;
            if (i == i4) {
                bjbVar.g(jb6.M0(2131747164, null), jb6.M0(2131747163, "PauseMusicOnRecordInfo"), gda.B0, true, true);
                return;
            }
            i5 = themeActivity.pauseOnMediaRow;
            if (i == i5) {
                bjbVar.f(jb6.M0(2131747165, null), gda.C0, true);
                return;
            }
            if (i == themeActivity.E) {
                bjbVar.g(jb6.M0(2131751375, "DirectShare"), jb6.M0(2131751374, "DirectShareInfo"), gda.u0, false, true);
                return;
            }
            i6 = themeActivity.sensitiveContentRow;
            if (i == i6) {
                bjbVar.g(jb6.M0(2131745064, null), jb6.M0(2131745063, null), themeActivity.getMessagesController().a5(), true, true);
                return;
            } else {
                if (i == themeActivity.t0) {
                    bjbVar.f(jb6.M0(2131753640, "BlurInChat"), gda.f(), true);
                    return;
                }
                return;
            }
        }
        if (i14 != 14) {
            if (i14 == 17) {
                ((ud3) view).a();
                return;
            }
            if (i14 == 19) {
                v09 v09Var = (v09) view;
                if (i == themeActivity.I) {
                    v09Var.b("save media only from peer chats", "", true, false);
                    return;
                } else {
                    v09Var.b("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i14 == 21) {
                ((g28) view).set(themeActivity.getUserConfig().f());
                return;
            }
            switch (i14) {
                case 10:
                    yn7 yn7Var = (yn7) view;
                    i12 = themeActivity.nightThemeRow;
                    if (i != i12) {
                        i13 = themeActivity.browserRow;
                        if (i == i13) {
                            yn7Var.b(jb6.M0(2131748966, null), jb6.M0(2131748965, null), R.drawable.msg2_language, themeActivity.getMessagesController().O2(), 0, false, true, false);
                            break;
                        }
                    } else {
                        boolean z = cmb.o != 0;
                        String A0 = z ? cmb.A0() : jb6.M0(2131753748, "AutoNightThemeOff");
                        if (z) {
                            int i21 = cmb.o;
                            A0 = kt6.o(i21 == 1 ? jb6.M0(2131753752, "AutoNightScheduled") : i21 == 3 ? jb6.M0(2131753751, "AutoNightSystemDefault") : jb6.M0(2131753761, "AutoNightAdaptive"), " ", A0);
                        }
                        yn7Var.b(jb6.M0(2131753749, "AutoNightTheme"), A0, R.drawable.menu_night_mode_24, z, 0, false, true, false);
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
                    r59 r59Var = (r59) view;
                    e0 e0Var = (e0) r59Var.getAdapter();
                    e0Var.f();
                    int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                    if (indexOf == -1) {
                        indexOf = e0Var.b() - 1;
                    }
                    if (indexOf != -1) {
                        ((u46) r59Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - gm.L(42.0f));
                        break;
                    }
                    break;
            }
            return;
        }
        xib xibVar = (xib) view;
        xibVar.w = (byte) 48;
        i7 = themeActivity.backgroundRow;
        if (i == i7) {
            xibVar.setSubtitle(null);
            int i22 = cmb.p6;
            xibVar.g(i22, i22);
            String M0 = jb6.M0(2131752503, null);
            i11 = themeActivity.changeUserColor;
            xibVar.o(R.drawable.msg_background, M0, i11 >= 0);
            return;
        }
        if (i == themeActivity.z0) {
            xibVar.setSubtitle(null);
            int i23 = cmb.p6;
            xibVar.g(i23, i23);
            xibVar.o(R.drawable.msg_theme, jb6.M0(2131751218, null), true);
            return;
        }
        i8 = themeActivity.createNewThemeRow;
        if (i == i8) {
            xibVar.setSubtitle(null);
            int i24 = cmb.p6;
            xibVar.g(i24, i24);
            xibVar.o(R.drawable.msg_colors, jb6.M0(2131751649, null), false);
            return;
        }
        i9 = themeActivity.liteModeRow;
        if (i == i9) {
            xibVar.g(cmb.I5, cmb.F6);
            xibVar.o(R.drawable.msg2_animations, jb6.M0(2131748623, null), true);
            xibVar.setSubtitle(jb6.M0(2131748622, null));
            xibVar.w = (byte) 60;
            xibVar.s = 64;
            xibVar.x = 20;
            return;
        }
        i10 = themeActivity.stickersRow;
        if (i == i10) {
            xibVar.g(cmb.I5, cmb.F6);
            xibVar.o(R.drawable.msg2_sticker, jb6.M0(2131744546, null), true);
            xibVar.setSubtitle(jb6.M0(2131744545, null));
            xibVar.s = 64;
            xibVar.w = (byte) 60;
            xibVar.x = 20;
            return;
        }
        if (i == themeActivity.B0) {
            xibVar.g(cmb.I5, cmb.F6);
            xibVar.o(R.drawable.msg2_speech, jb6.M0(2131744965, null), false);
            xibVar.setSubtitle(jb6.M0(2131744966, null));
            xibVar.s = 64;
            xibVar.w = (byte) 60;
            xibVar.x = 20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, cpb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, qmb] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ?? cpbVar;
        View view;
        int i2;
        tk5 tk5Var;
        int i3;
        int i4;
        ylb ylbVar = null;
        byte b = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new vkb(context);
                break;
            case 2:
                view = new njb(context);
                break;
            case 3:
                view = new bba(context, (hg9) null);
                break;
            case 4:
                cpbVar = new cpb(context);
                cpbVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                cpbVar.a = textView;
                anb.X(textView, cmb.F6, null);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                boolean z = jb6.a0;
                cpbVar.addView(textView, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 71.0f : 21.0f, 0.0f, z ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                cpbVar.b = imageView;
                anb.s(imageView, cmb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                cpbVar.addView(imageView, qoe.d(19, 14.0f, (jb6.a0 ? (byte) 3 : (byte) 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = cpbVar;
                break;
            case 5:
                view = new jf5(context);
                break;
            case 6:
                view = new pmb(this, context);
                break;
            case 7:
                view = new bjb(context);
                break;
            case 8:
                view = new tmb(themeActivity, context);
                break;
            case 9:
                cpbVar = new qmb(context, (byte) 0);
                cpbVar.b = new kb2[2];
                cpbVar.setOrientation(0);
                cpbVar.setPadding(gm.L(21.0f), gm.L(10.0f), gm.L(21.0f), 0);
                int i5 = 0;
                while (true) {
                    kb2[] kb2VarArr = (kb2[]) cpbVar.b;
                    if (i5 >= kb2VarArr.length) {
                        view = cpbVar;
                        break;
                    } else {
                        boolean z2 = i5 == 1;
                        kb2 kb2Var = new kb2(context, (byte) 0);
                        kb2Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        kb2Var.e = textPaint;
                        kb2Var.setWillNotDraw(false);
                        kb2Var.c = z2;
                        kb2Var.setContentDescription(jb6.M0(z2 ? 2131752160 : 2131752161, null));
                        textPaint.setTextSize(gm.L(13.0f));
                        jb2 jb2Var = new jb2(kb2Var, context);
                        kb2Var.d = jb2Var;
                        jb2Var.setSize(gm.L(20.0f));
                        kb2Var.addView(jb2Var, qoe.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z3 = gda.l1;
                        jb2Var.a(!z2 ? z3 : !z3, false);
                        kb2VarArr[i5] = kb2Var;
                        cpbVar.addView(((kb2[]) cpbVar.b)[i5], qoe.m(0.5f, -1, -1, i5 == 1 ? 10 : 0, 0, 0));
                        ((kb2[]) cpbVar.b)[i5].setOnClickListener(new v6(r0, cpbVar, z2));
                        i5++;
                    }
                }
            case 10:
                view = new yn7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                rmb rmbVar = new rmb(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = rmbVar;
                rmbVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new g69(-1, gm.L(148.0f)));
                view = view2;
                break;
            case 12:
                final smb smbVar = new smb(context, ylbVar, b);
                smbVar.setFocusable(false);
                smbVar.setItemAnimator(null);
                smbVar.setLayoutAnimation(null);
                smbVar.setPadding(gm.L(11.0f), 0, gm.L(11.0f), 0);
                smbVar.setClipToPadding(false);
                u46 u46Var = new u46();
                u46Var.i1(0);
                smbVar.setLayoutManager(u46Var);
                final e0 e0Var = new e0(themeActivity, context);
                smbVar.setAdapter(e0Var);
                smbVar.setOnItemClickListener(new f59() { // from class: org.telegram.ui.c0
                    @Override // f59
                    public final void g(int i6, View view3) {
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b2 = themeActivity2.f;
                        bmb B0 = b2 == 1 ? cmb.J : cmb.B0();
                        e0 e0Var2 = e0Var;
                        if (i6 == e0Var2.b() - 1) {
                            themeActivity2.presentFragment(new rob(B0, false, 1, false, b2 == 1));
                        } else {
                            amb ambVar = (amb) e0Var2.e.get(i6);
                            int i7 = B0.Z;
                            int i8 = ambVar.a;
                            if (i7 != i8) {
                                cmb.I1(B0, b2 == 1, i8, view3);
                                tz3.q(B0, ambVar.a);
                                cmb.K1(themeActivity2);
                            } else {
                                themeActivity2.presentFragment(new rob(B0, false, 1, i8 >= 100, b2 == 1));
                            }
                        }
                        int left = view3.getLeft();
                        int right = view3.getRight();
                        int L = gm.L(52.0f);
                        int i9 = left - L;
                        smb smbVar2 = smbVar;
                        if (i9 < 0) {
                            smbVar2.x0(i9, 0, null);
                        } else {
                            int i10 = right + L;
                            if (i10 > smbVar2.getMeasuredWidth()) {
                                smbVar2.x0(i10 - smbVar2.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = smbVar2.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = smbVar2.getChildAt(i11);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                smbVar.setOnItemLongClickListener(new xr8(this, e0Var, (byte) 26));
                smbVar.setLayoutParams(new g69(-1, gm.L(62.0f)));
                view = smbVar;
                break;
            case 13:
                view = new nmb(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new xib(context);
                break;
            case 15:
                i2 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                view = new reb(context, i2);
                break;
            case 16:
                tk5Var = ((org.telegram.ui.ActionBar.d) themeActivity).parentLayout;
                View r28Var = new r28(context, tk5Var, 0);
                r28Var.setImportantForAccessibility(4);
                view = r28Var;
                break;
            case 17:
                View ud3Var = new ud3(context, themeActivity, themeActivity.f);
                ud3Var.setFocusable(false);
                ud3Var.setLayoutParams(new g69(-1, -2));
                view = ud3Var;
                break;
            case 19:
                view = new v09(context, false);
                break;
            case 20:
                i3 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                os osVar = new os(context, null);
                osVar.f3 = new ArrayList();
                osVar.h3 = i3;
                osVar.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
                osVar.setFocusable(false);
                osVar.setItemAnimator(null);
                osVar.setLayoutAnimation(null);
                u46 u46Var2 = new u46(0, false);
                osVar.g3 = u46Var2;
                osVar.setLayoutManager(u46Var2);
                osVar.setAdapter(new js(osVar, b));
                osVar.i(new ks(osVar, b));
                osVar.setOnItemClickListener(new is(osVar, themeActivity, context, b));
                osVar.z1();
                view = osVar;
                break;
            case 21:
                i4 = ((org.telegram.ui.ActionBar.d) themeActivity).currentAccount;
                view = new g28(i4, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        if (u69Var.f == 4) {
            ((cpb) u69Var.a).setTypeChecked(u69Var.b() == cmb.o);
        }
    }
}
