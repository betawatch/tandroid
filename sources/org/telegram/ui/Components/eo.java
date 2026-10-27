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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eo extends mm0 {
    public final Context c;
    public final /* synthetic */ go d;

    public eo(go goVar, Context context) {
        this.d = goVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        go goVar = this.d;
        return b10 == goVar.u0 || b10 == goVar.G0 || b10 == goVar.B0 || b10 == goVar.F0 || b10 == goVar.C0 || b10 == goVar.H0 || b10 == goVar.D0 || b10 == goVar.E0 || b10 == goVar.I0 || b10 == goVar.J0 || b10 == goVar.N0.a || b10 == goVar.M0.a || b10 == goVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        go goVar = this.d;
        if (i10 == goVar.B0 || i10 == goVar.F0 || i10 == goVar.G0 || i10 == goVar.C0 || i10 == goVar.D0 || i10 == goVar.E0 || i10 == goVar.H0 || i10 == goVar.M0.a || i10 == goVar.N0.a) {
            return 10;
        }
        if (i10 == goVar.l0 || i10 == goVar.s0 || i10 == goVar.w0 || i10 == goVar.o0) {
            return 0;
        }
        if (i10 == goVar.r0) {
            return 1;
        }
        if (i10 == goVar.v0 || i10 == goVar.x0 || i10 == goVar.q0 || i10 == goVar.K0) {
            return 2;
        }
        if (i10 == goVar.u0 || i10 == goVar.I0 || i10 == goVar.L0) {
            return 3;
        }
        if (i10 == goVar.m0) {
            return 4;
        }
        if (i10 == goVar.n0) {
            return 11;
        }
        if (i10 == goVar.p0) {
            return 7;
        }
        if (i10 == goVar.y0 || i10 == goVar.z0 || i10 == goVar.J0) {
            return 6;
        }
        if (i10 == goVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        go goVar = this.d;
        boolean z10 = goVar.e0;
        d5.f fVar = goVar.M0;
        d5.f fVar2 = goVar.N0;
        org.telegram.ui.ActionBar.u6 u6Var = goVar.a;
        boolean z11 = goVar.n;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == goVar.l0) {
                q4Var.getTextView().setGravity(19);
                q4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == goVar.o0) {
                q4Var.getTextView().setGravity(19);
                q4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            q4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != goVar.s0) {
                if (i10 == goVar.w0) {
                    q4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                q4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                q4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == goVar.y0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), goVar.f0, goVar.z0 != -1);
                a9Var.e(null, true);
                return;
            } else if (i10 == goVar.z0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), goVar.g0, false);
                a9Var.e(null, true);
                return;
            } else {
                if (i10 == goVar.J0) {
                    a9Var.f(LocaleController.getString(R.string.PollV2HideResults), goVar.W, false);
                    a9Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setFixedSize(0);
            new ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var)), org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7)).w = true;
            if (i10 == goVar.q0) {
                i9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == goVar.x0) {
                i9Var.setFixedSize(12);
                i9Var.setText(null);
                return;
            }
            int i12 = goVar.J - goVar.M;
            if (i12 <= 0) {
                i9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                i9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == goVar.K0) {
                i9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                i9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            if (i10 == goVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = goVar.P0;
                v8Var.q(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            }
            if (i10 == goVar.I0) {
                goVar.X(v8Var, false);
                return;
            }
            v8Var.g(-1, org.telegram.ui.ActionBar.y6.il);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.k7, u6Var), mode));
            goVar.n1 = drawable;
            goVar.o1 = drawable2;
            v8Var.p(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new ar(drawable, drawable2), false);
            v8Var.w = 20;
            v8Var.s = 58;
            return;
        }
        if (i11 == 9) {
            view.requestLayout();
            return;
        }
        if (i11 != 10) {
            return;
        }
        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
        e6Var.setDivider(false);
        if (i10 == goVar.B0) {
            e6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), x40.c, R.drawable.filled_poll_view_24, !goVar.a0);
        } else {
            if (i10 == goVar.F0) {
                e6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), x40.f, R.drawable.filled_poll_multiple_24, goVar.b0);
            } else if (i10 == goVar.D0) {
                e6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), x40.v, R.drawable.filled_poll_revote_24, goVar.R);
            } else if (i10 == goVar.C0) {
                e6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), x40.s, R.drawable.filled_poll_add_24, goVar.T);
            } else if (i10 == goVar.E0) {
                e6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), x40.h, R.drawable.filled_poll_shuffle_24, goVar.S);
            } else if (i10 == goVar.G0) {
                e6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), x40.n, R.drawable.filled_poll_correct_24, goVar.c0);
            } else if (i10 == fVar2.a) {
                e6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), x40.e, R.drawable.filled_location, fVar2.b);
            } else if (i10 == fVar.a) {
                e6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), x40.d, R.drawable.msg_folders_groups, fVar.b);
            } else if (i10 == goVar.H0) {
                e6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), x40.r, R.drawable.filled_poll_deadline_24, (goVar.U == 0 && goVar.V == 0) ? false : true);
                e6Var = e6Var;
                e6Var.setDivider((goVar.U == 0 && goVar.V == 0) ? false : true);
            }
            e6Var = e6Var;
        }
        if (i10 == goVar.G0) {
            e6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != goVar.C0) {
            e6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = e6Var.getCheckBox();
        if (!goVar.c0 && !goVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.wn] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        View view;
        go goVar = this.d;
        boolean z10 = goVar.n;
        org.telegram.ui.ActionBar.u6 u6Var = goVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 21, 15, false, goVar.a);
                break;
            case 1:
                View f7Var = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                new ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var)), org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7)).w = true;
                q4Var = f7Var;
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.i9(context, u6Var);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.v8(context, u6Var);
                break;
            case 4:
            case 11:
                yn ynVar = new yn(this, this.c, goVar.I ? 1 : 0, goVar.a, i10);
                if (i10 == 11 && !z10) {
                    ynVar.setTextRight(98);
                    final int i11 = 0;
                    ynVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wn
                        public final /* synthetic */ eo b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    go.R(this.b.d, -2);
                                    break;
                                case 1:
                                    go.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                ynVar.c();
                ynVar.setIconsColor(org.telegram.ui.ActionBar.y6.o7);
                ynVar.b(new zn(this, ynVar, i10));
                q4Var = ynVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                co coVar = new co(this, this.c, goVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wn
                    public final /* synthetic */ eo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                go.R(this.b.d, -2);
                                break;
                            case 1:
                                go.R(this.b.d, -3);
                                break;
                            default:
                                this.b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                break;
                        }
                    }
                }, goVar.a);
                if (!z10) {
                    coVar.setTextRight(140);
                    coVar.a().setOnClickListener(new ga(5, this, coVar));
                }
                int i13 = org.telegram.ui.ActionBar.y6.o7;
                coVar.setIconsColor(i13);
                aq aqVar = coVar.r;
                if (aqVar != null) {
                    aqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                    float f7 = coVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                coVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.y6.k7);
                coVar.b(new bo(1, this, coVar));
                coVar.setShowNextButton(true);
                EditTextBoldCursor textView = coVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, coVar));
                textView.setOnKeyListener(new xn(coVar, 0));
                q4Var = coVar;
                break;
            case 6:
                q4Var = new org.telegram.ui.Cells.a9(context, u6Var);
                break;
            case 7:
                ao aoVar = new ao(this, context, goVar.I ? 1 : 0);
                aoVar.c();
                if (!z10) {
                    aoVar.setTextRight(98);
                    final int i14 = 1;
                    aoVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wn
                        public final /* synthetic */ eo b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    go.R(this.b.d, -2);
                                    break;
                                case 1:
                                    go.R(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                aoVar.setIconsColor(org.telegram.ui.ActionBar.y6.o7);
                aoVar.b(new bo(0, this, aoVar));
                q4Var = aoVar;
                break;
            case 8:
                View vnVar = new vn(context, 0);
                vnVar.setTag(-33024);
                view = vnVar;
                q4Var = view;
                break;
            case 9:
                View ccVar = new bi.cc(this, context, 14);
                ccVar.setTag(-33024);
                view = ccVar;
                q4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, u6Var);
                e6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                q4Var = e6Var;
                break;
        }
        return ic.a.n(q4Var, q4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        go goVar = this.d;
        sh.f fVar = goVar.m1;
        boolean z10 = goVar.n;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            h6Var.setTag(1);
            CharSequence charSequence = goVar.N;
            h6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            h6Var.setTag(null);
            go.O(goVar, view, e1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.setTag(1);
            CharSequence charSequence2 = goVar.O;
            h6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            h6Var2.setTag(null);
            h6Var2.e.a(fVar.b(-2), false);
            go.O(goVar, view, e1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
                h6Var3.setTag(1);
                CharSequence charSequence3 = goVar.P;
                h6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                h6Var3.setTag(null);
                if (!z10) {
                    h6Var3.e.a(fVar.b(-3), false);
                }
                go.O(goVar, view, e1Var.b());
                return;
            }
            return;
        }
        int b10 = e1Var.b();
        org.telegram.ui.Cells.h6 h6Var4 = (org.telegram.ui.Cells.h6) view;
        h6Var4.setTag(1);
        h6Var4.a.a(goVar.b0, false);
        int i11 = b10 - goVar.t0;
        h6Var4.n(goVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        h6Var4.setTag(null);
        if (goVar.k0 == b10) {
            EditTextBoldCursor textView = h6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            goVar.k0 = -1;
        }
        if (!z10) {
            h6Var4.e.a(fVar.b(i11), false);
        }
        go.O(goVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.h6) e1Var.a).getTextView();
            if (textView.isFocused()) {
                go goVar = this.d;
                if (goVar.I) {
                    un unVar = goVar.x;
                    if (unVar != null) {
                        unVar.f();
                    }
                    goVar.c0(true);
                }
                goVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
