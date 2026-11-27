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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d0 extends c79 {
    public final Context c;
    public boolean d = true;
    public final /* synthetic */ ThemeActivity e;

    public d0(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21;
    }

    @Override // j79
    public final int b() {
        return this.e.L0;
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

    @Override // j79
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
        int i14 = f89Var.f;
        View view = f89Var.a;
        ThemeActivity themeActivity = this.e;
        if (i14 == 1) {
            qmb qmbVar = (qmb) view;
            i2 = themeActivity.nightThemeRow;
            if (i == i2) {
                if (aob.o == 0 || aob.J == null) {
                    qmbVar.c(ob6.M0(2131753777, null), ob6.M0(2131753776, null), false, false);
                    return;
                } else {
                    qmbVar.c(ob6.M0(2131753777, null), aob.A0(), false, false);
                    return;
                }
            }
            if (i == themeActivity.b0) {
                int i15 = aob.r;
                int i16 = i15 / 60;
                qmbVar.c(ob6.M0(2131753785, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i15 - (i16 * 60))), false, true);
                return;
            }
            if (i == themeActivity.c0) {
                int i17 = aob.s;
                int i18 = i17 / 60;
                qmbVar.c(ob6.M0(2131753775, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i18), Integer.valueOf(i17 - (i18 * 60))), false, false);
                return;
            }
            if (i == themeActivity.Z) {
                qmbVar.c(ob6.M0(2131753774, "AutoNightUpdateLocation"), aob.w, false, false);
                return;
            }
            if (i == themeActivity.R) {
                int i19 = uc7.e1().getInt("sortContactsBy", 0);
                qmbVar.c(ob6.M0(2131745019, "SortBy"), i19 == 0 ? ob6.M0(2131751565, "Default") : i19 == 1 ? ob6.M0(2131745015, "FirstName") : ob6.M0(2131745014, "LastName"), false, true);
                return;
            }
            if (i == themeActivity.Q) {
                qmbVar.b(ob6.M0(2131749018, "ImportContacts"), true);
                return;
            }
            if (i == themeActivity.L) {
                int i20 = xea.o1;
                qmbVar.c(ob6.M0(2131751332, "DistanceUnits"), i20 == 0 ? ob6.M0(2131751331, "DistanceUnitsAutomatic") : i20 == 1 ? ob6.M0(2131751330, "DistanceUnitsKilometers") : ob6.M0(2131751329, "DistanceUnitsMiles"), themeActivity.Q0, themeActivity.F0 >= 0);
                themeActivity.Q0 = false;
                return;
            } else if (i == themeActivity.M) {
                qmbVar.c(ob6.M0(2131745527, null), bw9.a().a, themeActivity.R0, false);
                return;
            } else {
                if (i == themeActivity.N) {
                    qmbVar.c(ob6.M0(2131748193, null), ob6.M0(xea.r0 ? 2131748191 : 2131748192, null), themeActivity.P0, false);
                    themeActivity.P0 = false;
                    return;
                }
                return;
            }
        }
        if (i14 == 2) {
            ilb ilbVar = (ilb) view;
            ilbVar.setFixedSize(0);
            if (i == themeActivity.g0) {
                ilbVar.setText(ob6.a0("AutoNightBrightnessInfo", null, 2131753787, Integer.valueOf((int) (aob.q * 100.0f))));
                return;
            }
            if (i == themeActivity.a0) {
                ilbVar.setText(ThemeActivity.x0());
                return;
            }
            if (i == themeActivity.w0) {
                ilbVar.setText(ob6.M0(2131752186, "ChatListSwipeGestureInfo"));
                return;
            } else if (i == themeActivity.I0) {
                ilbVar.setText(ob6.M0(2131748619, "LiteModeInfo"));
                return;
            } else {
                ilbVar.setFixedSize(12);
                ilbVar.setText("");
                return;
            }
        }
        if (i14 == 4) {
            arb arbVar = (arb) view;
            if (i == themeActivity.S) {
                arbVar.a(ob6.M0(2131753786, "AutoNightDisabled"), aob.o == 0, true);
                return;
            }
            if (i == themeActivity.T) {
                arbVar.a(ob6.M0(2131753780, "AutoNightScheduled"), aob.o == 1, true);
                return;
            } else if (i == themeActivity.U) {
                arbVar.a(ob6.M0(2131753789, "AutoNightAdaptive"), aob.o == 2, themeActivity.V != -1);
                return;
            } else {
                if (i == themeActivity.V) {
                    arbVar.a(ob6.M0(2131753779, "AutoNightSystemDefault"), aob.o == 3, false);
                    return;
                }
                return;
            }
        }
        if (i14 == 5) {
            mf5 mf5Var = (mf5) view;
            if (i == themeActivity.X) {
                mf5Var.setText(ob6.M0(2131753781, "AutoNightSchedule"));
                return;
            }
            if (i == themeActivity.e0) {
                mf5Var.setText(ob6.M0(2131753788, "AutoNightBrightness"));
                return;
            }
            if (i == themeActivity.h0) {
                mf5Var.setText(ob6.M0(2131753782, "AutoNightPreferred"));
                return;
            }
            if (i == themeActivity.y) {
                mf5Var.setText(ob6.M0(2131745711, "SETTINGS"));
                return;
            }
            if (i == themeActivity.j0) {
                if (themeActivity.f == 3) {
                    mf5Var.setText(ob6.M0(2131752820, "BuildMyOwnTheme"));
                    return;
                } else {
                    mf5Var.setText(ob6.M0(2131751976, "ColorTheme"));
                    return;
                }
            }
            if (i == themeActivity.x) {
                mf5Var.setText(ob6.M0(2131743844, "TextSizeHeader"));
                return;
            }
            if (i == themeActivity.m0) {
                mf5Var.setText(ob6.M0(2131752190, "ChatList"));
                return;
            }
            if (i == themeActivity.k0) {
                mf5Var.setText(ob6.M0(2131752821, "BubbleRadius"));
                return;
            }
            if (i == themeActivity.u0) {
                mf5Var.setText(ob6.M0(2131752187, "ChatListSwipeGesture"));
                return;
            }
            if (i == themeActivity.x0) {
                mf5Var.setText(ob6.M0(2131745379, "SelectTheme"));
                return;
            }
            if (i == themeActivity.J0) {
                mf5Var.setText(ob6.M0(2131754233, null));
                return;
            } else if (i == themeActivity.H0) {
                mf5Var.setText(ob6.M0(2131747492, "OtherSettings"));
                return;
            } else {
                if (i == themeActivity.G0) {
                    mf5Var.setText(ob6.M0(2131748414, "MediaAndSoundSettings"));
                    return;
                }
                return;
            }
        }
        if (i14 == 6) {
            ((cz0) view).setProgress(aob.q);
            return;
        }
        if (i14 == 7) {
            wkb wkbVar = (wkb) view;
            if (i == themeActivity.Y) {
                wkbVar.f(ob6.M0(2131753784, "AutoNightLocation"), aob.p, true);
                return;
            }
            if (i == themeActivity.O) {
                wkbVar.f(ob6.M0(2131751122, "EnableAnimations"), uc7.e1().getBoolean("view_animations", true), true);
                return;
            }
            if (i == themeActivity.H) {
                wkbVar.f(ob6.M0(2131745360, "SendByEnter"), uc7.e1().getBoolean("send_by_enter", false), true);
                return;
            }
            if (i == themeActivity.F) {
                wkbVar.g(ob6.M0(2131746152, "RaiseToSpeak"), ob6.M0(2131746151, "RaiseToSpeakInfo"), xea.o0, true, true);
                return;
            }
            i3 = themeActivity.raiseToListenRow;
            if (i == i3) {
                wkbVar.g(ob6.M0(2131746154, "RaiseToListen"), ob6.M0(2131746153, "RaiseToListenInfo"), xea.p0, true, true);
                return;
            }
            if (i == themeActivity.G) {
                wkbVar.g(ob6.M0(2131747980, "NextMediaTap"), ob6.M0(2131747979, "NextMediaTapInfo"), xea.q0, true, true);
                return;
            }
            i4 = themeActivity.pauseOnRecordRow;
            if (i == i4) {
                wkbVar.g(ob6.M0(2131747158, null), ob6.M0(2131747157, "PauseMusicOnRecordInfo"), xea.B0, true, true);
                return;
            }
            i5 = themeActivity.pauseOnMediaRow;
            if (i == i5) {
                wkbVar.f(ob6.M0(2131747159, null), xea.C0, true);
                return;
            }
            if (i == themeActivity.E) {
                wkbVar.g(ob6.M0(2131751403, "DirectShare"), ob6.M0(2131751402, "DirectShareInfo"), xea.u0, false, true);
                return;
            }
            i6 = themeActivity.sensitiveContentRow;
            if (i == i6) {
                wkbVar.g(ob6.M0(2131745058, null), ob6.M0(2131745057, null), themeActivity.getMessagesController().g5(), true, true);
                return;
            } else {
                if (i == themeActivity.t0) {
                    wkbVar.f(ob6.M0(2131753668, "BlurInChat"), xea.f(), true);
                    return;
                }
                return;
            }
        }
        if (i14 != 14) {
            if (i14 == 17) {
                ((ad3) view).a();
                return;
            }
            if (i14 == 19) {
                h29 h29Var = (h29) view;
                if (i == themeActivity.I) {
                    h29Var.b("save media only from peer chats", "", true, false);
                    return;
                } else {
                    h29Var.b("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i14 == 21) {
                ((j38) view).set(themeActivity.getUserConfig().f());
                return;
            }
            switch (i14) {
                case 10:
                    uo7 uo7Var = (uo7) view;
                    i12 = themeActivity.nightThemeRow;
                    if (i != i12) {
                        i13 = themeActivity.browserRow;
                        if (i == i13) {
                            uo7Var.b(ob6.M0(2131748963, null), ob6.M0(2131748962, null), R.drawable.msg2_language, themeActivity.getMessagesController().S2(), 0, false, true, false);
                            break;
                        }
                    } else {
                        boolean z = aob.o != 0;
                        String A0 = z ? aob.A0() : ob6.M0(2131753776, "AutoNightThemeOff");
                        if (z) {
                            int i21 = aob.o;
                            A0 = qd4.y(i21 == 1 ? ob6.M0(2131753780, "AutoNightScheduled") : i21 == 3 ? ob6.M0(2131753779, "AutoNightSystemDefault") : ob6.M0(2131753789, "AutoNightAdaptive"), " ", A0);
                        }
                        uo7Var.b(ob6.M0(2131753777, "AutoNightTheme"), A0, R.drawable.menu_night_mode_24, z, 0, false, true, false);
                        break;
                    }
                    break;
                case 11:
                    if (this.d) {
                        themeActivity.c.B1(themeActivity.b.getMeasuredWidth());
                        this.d = false;
                        break;
                    }
                    break;
                case 12:
                    d79 d79Var = (d79) view;
                    e0 e0Var = (e0) d79Var.getAdapter();
                    e0Var.f();
                    int indexOf = e0Var.e.indexOf(e0Var.d.i(false));
                    if (indexOf == -1) {
                        indexOf = e0Var.b() - 1;
                    }
                    if (indexOf != -1) {
                        ((x46) d79Var.getLayoutManager()).g1(indexOf, (themeActivity.b.getMeasuredWidth() / 2) - hl.L(42.0f));
                        break;
                    }
                    break;
            }
            return;
        }
        skb skbVar = (skb) view;
        skbVar.w = (byte) 48;
        i7 = themeActivity.backgroundRow;
        if (i == i7) {
            skbVar.setSubtitle(null);
            int i22 = aob.q6;
            skbVar.g(i22, i22);
            String M0 = ob6.M0(2131752531, null);
            i11 = themeActivity.changeUserColor;
            skbVar.o(R.drawable.msg_background, M0, i11 >= 0);
            return;
        }
        if (i == themeActivity.z0) {
            skbVar.setSubtitle(null);
            int i23 = aob.q6;
            skbVar.g(i23, i23);
            skbVar.o(R.drawable.msg_theme, ob6.M0(2131751246, null), true);
            return;
        }
        i8 = themeActivity.createNewThemeRow;
        if (i == i8) {
            skbVar.setSubtitle(null);
            int i24 = aob.q6;
            skbVar.g(i24, i24);
            skbVar.o(R.drawable.msg_colors, ob6.M0(2131751677, null), false);
            return;
        }
        i9 = themeActivity.liteModeRow;
        if (i == i9) {
            skbVar.g(aob.J5, aob.G6);
            skbVar.o(R.drawable.msg2_animations, ob6.M0(2131748620, null), true);
            skbVar.setSubtitle(ob6.M0(2131748619, null));
            skbVar.w = (byte) 60;
            skbVar.s = 64;
            skbVar.x = 20;
            return;
        }
        i10 = themeActivity.stickersRow;
        if (i == i10) {
            skbVar.g(aob.J5, aob.G6);
            skbVar.o(R.drawable.msg2_sticker, ob6.M0(2131744514, null), true);
            skbVar.setSubtitle(ob6.M0(2131744513, null));
            skbVar.s = 64;
            skbVar.w = (byte) 60;
            skbVar.x = 20;
            return;
        }
        if (i == themeActivity.B0) {
            skbVar.g(aob.J5, aob.G6);
            skbVar.o(R.drawable.msg2_speech, ob6.M0(2131744958, null), false);
            skbVar.setSubtitle(ob6.M0(2131744984, null));
            skbVar.s = 64;
            skbVar.w = (byte) 60;
            skbVar.x = 20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, arb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, oob] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        ?? arbVar;
        View view;
        int i2;
        wk5 wk5Var;
        int i3;
        int i4;
        vnb vnbVar = null;
        byte b = 0;
        ThemeActivity themeActivity = this.e;
        Context context = this.c;
        switch (i) {
            case 1:
                view = new qmb(context);
                break;
            case 2:
                view = new ilb(context);
                break;
            case 3:
                view = new rca(context, (uh9) null);
                break;
            case 4:
                arbVar = new arb(context);
                arbVar.setWillNotDraw(false);
                TextView textView = new TextView(context);
                arbVar.a = textView;
                yob.X(textView, aob.G6, null);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                boolean z = ob6.a0;
                arbVar.addView(textView, tre.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 71.0f : 21.0f, 0.0f, z ? 21.0f : 23.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                arbVar.b = imageView;
                yob.s(imageView, aob.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                arbVar.addView(imageView, tre.d(19, 14.0f, (ob6.a0 ? (byte) 3 : (byte) 5) | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                view = arbVar;
                break;
            case 5:
                view = new mf5(context);
                break;
            case 6:
                view = new nob(this, context);
                break;
            case 7:
                view = new wkb(context);
                break;
            case 8:
                view = new rob(themeActivity, context);
                break;
            case 9:
                arbVar = new oob(context, (byte) 0);
                arbVar.b = new pa2[2];
                arbVar.setOrientation(0);
                arbVar.setPadding(hl.L(21.0f), hl.L(10.0f), hl.L(21.0f), 0);
                int i5 = 0;
                while (true) {
                    pa2[] pa2VarArr = (pa2[]) arbVar.b;
                    if (i5 >= pa2VarArr.length) {
                        view = arbVar;
                        break;
                    } else {
                        boolean z2 = i5 == 1;
                        pa2 pa2Var = new pa2(context, (byte) 0);
                        pa2Var.b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        pa2Var.e = textPaint;
                        pa2Var.setWillNotDraw(false);
                        pa2Var.c = z2;
                        pa2Var.setContentDescription(ob6.M0(z2 ? 2131752188 : 2131752189, null));
                        textPaint.setTextSize(hl.L(13.0f));
                        oa2 oa2Var = new oa2(pa2Var, context);
                        pa2Var.d = oa2Var;
                        oa2Var.setSize(hl.L(20.0f));
                        pa2Var.addView(oa2Var, tre.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        boolean z3 = xea.l1;
                        oa2Var.a(!z2 ? z3 : !z3, false);
                        pa2VarArr[i5] = pa2Var;
                        arbVar.addView(((pa2[]) arbVar.b)[i5], tre.m(0.5f, -1, -1, i5 == 1 ? 10 : 0, 0, 0));
                        ((pa2[]) arbVar.b)[i5].setOnClickListener(new w6(r0, arbVar, z2));
                        i5++;
                    }
                }
            case 10:
                view = new uo7(this.c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                pob pobVar = new pob(this, this.c, themeActivity, themeActivity.f, themeActivity.e, themeActivity.d);
                themeActivity.c = pobVar;
                pobVar.setDrawDivider(themeActivity.w);
                themeActivity.c.setFocusable(false);
                View view2 = themeActivity.c;
                view2.setLayoutParams(new r79(-1, hl.L(148.0f)));
                view = view2;
                break;
            case 12:
                final qob qobVar = new qob(context, vnbVar, b);
                qobVar.setFocusable(false);
                qobVar.setItemAnimator(null);
                qobVar.setLayoutAnimation(null);
                qobVar.setPadding(hl.L(11.0f), 0, hl.L(11.0f), 0);
                qobVar.setClipToPadding(false);
                x46 x46Var = new x46();
                x46Var.i1(0);
                qobVar.setLayoutManager(x46Var);
                final e0 e0Var = new e0(themeActivity, context);
                qobVar.setAdapter(e0Var);
                qobVar.setOnItemClickListener(new r69() { // from class: org.telegram.ui.c0
                    @Override // r69
                    public final void e(int i6, View view3) {
                        ThemeActivity themeActivity2 = d0.this.e;
                        byte b2 = themeActivity2.f;
                        znb B0 = b2 == 1 ? aob.J : aob.B0();
                        e0 e0Var2 = e0Var;
                        if (i6 == e0Var2.b() - 1) {
                            themeActivity2.presentFragment(new pqb(B0, false, 1, false, b2 == 1));
                        } else {
                            ynb ynbVar = (ynb) e0Var2.e.get(i6);
                            int i7 = B0.Z;
                            int i8 = ynbVar.a;
                            if (i7 != i8) {
                                aob.I1(B0, b2 == 1, i8, view3);
                                ez3.q(B0, ynbVar.a);
                                aob.K1(themeActivity2);
                            } else {
                                themeActivity2.presentFragment(new pqb(B0, false, 1, i8 >= 100, b2 == 1));
                            }
                        }
                        int left = view3.getLeft();
                        int right = view3.getRight();
                        int L = hl.L(52.0f);
                        int i9 = left - L;
                        qob qobVar2 = qobVar;
                        if (i9 < 0) {
                            qobVar2.y0(i9, 0, null);
                        } else {
                            int i10 = right + L;
                            if (i10 > qobVar2.getMeasuredWidth()) {
                                qobVar2.y0(i10 - qobVar2.getMeasuredWidth(), 0, null);
                            }
                        }
                        int childCount = qobVar2.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = qobVar2.getChildAt(i11);
                            if (childAt instanceof ThemeActivity.InnerAccentView) {
                                ((ThemeActivity.InnerAccentView) childAt).a(true);
                            }
                        }
                    }
                });
                qobVar.setOnItemLongClickListener((t69) new yw9(this, e0Var, (byte) 11));
                qobVar.setLayoutParams(new r79(-1, hl.L(62.0f)));
                view = qobVar;
                break;
            case 13:
                view = new lob(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                view = new skb(context);
                break;
            case 15:
                i2 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                view = new lgb(context, i2);
                break;
            case 16:
                wk5Var = ((org.telegram.ui.ActionBar.e) themeActivity).parentLayout;
                View u38Var = new u38(context, wk5Var, 0);
                u38Var.setImportantForAccessibility(4);
                view = u38Var;
                break;
            case 17:
                View ad3Var = new ad3(context, themeActivity, themeActivity.f);
                ad3Var.setFocusable(false);
                ad3Var.setLayoutParams(new r79(-1, -2));
                view = ad3Var;
                break;
            case 19:
                view = new h29(context, false);
                break;
            case 20:
                i3 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                pr prVar = new pr(context, null);
                prVar.f3 = new ArrayList();
                prVar.h3 = i3;
                prVar.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
                prVar.setFocusable(false);
                prVar.setItemAnimator(null);
                prVar.setLayoutAnimation(null);
                x46 x46Var2 = new x46(0, false);
                prVar.g3 = x46Var2;
                prVar.setLayoutManager(x46Var2);
                prVar.setAdapter(new kr(prVar, b));
                prVar.i(new lr(prVar, b));
                prVar.setOnItemClickListener(new jr(prVar, themeActivity, context, b));
                prVar.A1();
                view = prVar;
                break;
            case 21:
                i4 = ((org.telegram.ui.ActionBar.e) themeActivity).currentAccount;
                view = new j38(i4, 0L, themeActivity.getResourceProvider(), this.c);
                break;
        }
        return new n69(view);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        if (f89Var.f == 4) {
            ((arb) f89Var.a).setTypeChecked(f89Var.b() == aob.o);
        }
    }
}
