package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xn extends ul0 {
    public final Context c;
    public final /* synthetic */ zn d;

    public xn(zn znVar, Context context) {
        this.d = znVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zn znVar = this.d;
        return b10 == znVar.u0 || b10 == znVar.G0 || b10 == znVar.B0 || b10 == znVar.F0 || b10 == znVar.C0 || b10 == znVar.H0 || b10 == znVar.D0 || b10 == znVar.E0 || b10 == znVar.I0 || b10 == znVar.J0 || b10 == znVar.N0.b || b10 == znVar.M0.b || b10 == znVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        zn znVar = this.d;
        if (i10 == znVar.B0 || i10 == znVar.F0 || i10 == znVar.G0 || i10 == znVar.C0 || i10 == znVar.D0 || i10 == znVar.E0 || i10 == znVar.H0 || i10 == znVar.M0.b || i10 == znVar.N0.b) {
            return 10;
        }
        if (i10 == znVar.l0 || i10 == znVar.s0 || i10 == znVar.w0 || i10 == znVar.o0) {
            return 0;
        }
        if (i10 == znVar.r0) {
            return 1;
        }
        if (i10 == znVar.v0 || i10 == znVar.x0 || i10 == znVar.q0 || i10 == znVar.K0) {
            return 2;
        }
        if (i10 == znVar.u0 || i10 == znVar.I0 || i10 == znVar.L0) {
            return 3;
        }
        if (i10 == znVar.m0) {
            return 4;
        }
        if (i10 == znVar.n0) {
            return 11;
        }
        if (i10 == znVar.p0) {
            return 7;
        }
        if (i10 == znVar.y0 || i10 == znVar.z0 || i10 == znVar.J0) {
            return 6;
        }
        if (i10 == znVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        zn znVar = this.d;
        boolean z10 = znVar.e0;
        c2.a aVar = znVar.M0;
        c2.a aVar2 = znVar.N0;
        org.telegram.ui.ActionBar.f6 f6Var = znVar.a;
        boolean z11 = znVar.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == znVar.l0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == znVar.o0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != znVar.s0) {
                if (i10 == znVar.w0) {
                    m4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == znVar.y0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), znVar.f0, znVar.z0 != -1);
                x8Var.e(null, true);
                return;
            } else if (i10 == znVar.z0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), znVar.g0, false);
                x8Var.e(null, true);
                return;
            } else {
                if (i10 == znVar.J0) {
                    x8Var.f(LocaleController.getString(R.string.PollV2HideResults), znVar.W, false);
                    x8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setFixedSize(0);
            new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == znVar.q0) {
                f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == znVar.x0) {
                f9Var.setFixedSize(12);
                f9Var.setText(null);
                return;
            }
            int i12 = znVar.J - znVar.M;
            if (i12 <= 0) {
                f9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                f9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == znVar.K0) {
                f9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                f9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == znVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = znVar.P0;
                s8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == znVar.I0) {
                    znVar.U(s8Var, false);
                    return;
                }
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                s8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new vq(drawable, drawable2), false);
                s8Var.w = 20;
                s8Var.s = 58;
                return;
            }
        }
        if (i11 == 9) {
            view.requestLayout();
            return;
        }
        if (i11 != 10) {
            return;
        }
        org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
        b6Var.setDivider(false);
        if (i10 == znVar.B0) {
            b6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !znVar.a0);
        } else {
            if (i10 == znVar.F0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, znVar.b0);
            } else if (i10 == znVar.D0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, znVar.R);
            } else if (i10 == znVar.C0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, znVar.T);
            } else if (i10 == znVar.E0) {
                b6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, znVar.S);
            } else if (i10 == znVar.G0) {
                b6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, znVar.c0);
            } else if (i10 == aVar2.b) {
                b6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                b6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == znVar.H0) {
                b6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (znVar.U == 0 && znVar.V == 0) ? false : true);
                b6Var = b6Var;
                b6Var.setDivider((znVar.U == 0 && znVar.V == 0) ? false : true);
            }
            b6Var = b6Var;
        }
        if (i10 == znVar.G0) {
            b6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != znVar.C0) {
            b6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = b6Var.getCheckBox();
        if (!znVar.c0 && !znVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.rn] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        zn znVar = this.d;
        boolean z10 = znVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = znVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, znVar.a);
                break;
            case 1:
                View c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                m4Var = c7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.f9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.s8(context, f6Var);
                break;
            case 4:
            case 11:
                tn tnVar = new tn(this, this.c, znVar.I ? 1 : 0, znVar.a, i10);
                if (i10 == 11 && !z10) {
                    tnVar.setTextRight(98);
                    final int i11 = 0;
                    tnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rn
                        public final /* synthetic */ xn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    zn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    zn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                tnVar.d();
                tnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                tnVar.c(new un(this, tnVar, i10));
                m4Var = tnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                wn wnVar = new wn(this, this.c, znVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rn
                    public final /* synthetic */ xn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                zn.O(this.b.d, -2);
                                break;
                            case 1:
                                zn.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                break;
                        }
                    }
                }, znVar.a);
                if (!z10) {
                    wnVar.setTextRight(140);
                    wnVar.b().setOnClickListener(new org.telegram.ui.sh(20, this, wnVar));
                }
                int i13 = org.telegram.ui.ActionBar.j6.o7;
                wnVar.setIconsColor(i13);
                tp tpVar = wnVar.r;
                if (tpVar != null) {
                    tpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = tpVar.getCheckBoxBase();
                    float f7 = wnVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                wnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
                wnVar.c(new og.x(2, this, wnVar));
                wnVar.setShowNextButton(true);
                EditTextBoldCursor textView = wnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.xd(2, this, wnVar));
                textView.setOnKeyListener(new sn(wnVar, 0));
                m4Var = wnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.x8(context, f6Var);
                break;
            case 7:
                vn vnVar = new vn(this, context, znVar.I ? 1 : 0);
                vnVar.d();
                if (!z10) {
                    vnVar.setTextRight(98);
                    final int i14 = 1;
                    vnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rn
                        public final /* synthetic */ xn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    zn.O(this.b.d, -2);
                                    break;
                                case 1:
                                    zn.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                vnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                vnVar.c(new og.x(1, this, vnVar));
                m4Var = vnVar;
                break;
            case 8:
                View qnVar = new qn(context, 0);
                qnVar.setTag(-33024);
                view = qnVar;
                m4Var = view;
                break;
            case 9:
                View ncVar = new bi.nc(this, context, 14);
                ncVar.setTag(-33024);
                view = ncVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context, f6Var);
                b6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = b6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(m4Var, m4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        zn znVar = this.d;
        ph.f fVar = znVar.l1;
        boolean z10 = znVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            CharSequence charSequence = znVar.N;
            e6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            e6Var.setTag(null);
            zn.L(znVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.setTag(1);
            CharSequence charSequence2 = znVar.O;
            e6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            e6Var2.setTag(null);
            e6Var2.e.a(fVar.b(-2), false);
            zn.L(znVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
                e6Var3.setTag(1);
                CharSequence charSequence3 = znVar.P;
                e6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                e6Var3.setTag(null);
                if (!z10) {
                    e6Var3.e.a(fVar.b(-3), false);
                }
                zn.L(znVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.e6 e6Var4 = (org.telegram.ui.Cells.e6) view;
        e6Var4.setTag(1);
        e6Var4.a.a(znVar.b0, false);
        int i11 = b10 - znVar.t0;
        e6Var4.n(znVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        e6Var4.setTag(null);
        if (znVar.k0 == b10) {
            EditTextBoldCursor textView = e6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            znVar.k0 = -1;
        }
        if (!z10) {
            e6Var4.e.a(fVar.b(i11), false);
        }
        zn.L(znVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                zn znVar = this.d;
                if (znVar.I) {
                    pn pnVar = znVar.x;
                    if (pnVar != null) {
                        pnVar.f();
                    }
                    znVar.Z(true);
                }
                znVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
