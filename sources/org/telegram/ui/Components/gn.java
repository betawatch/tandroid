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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gn extends yk0 {
    public final Context c;
    public final /* synthetic */ in d;

    public gn(in inVar, Context context) {
        this.d = inVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int b10 = o1Var.b();
        in inVar = this.d;
        return b10 == inVar.q0 || b10 == inVar.C0 || b10 == inVar.x0 || b10 == inVar.B0 || b10 == inVar.y0 || b10 == inVar.D0 || b10 == inVar.z0 || b10 == inVar.A0 || b10 == inVar.E0 || b10 == inVar.F0 || b10 == inVar.J0.b || b10 == inVar.I0.b || b10 == inVar.H0;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.M0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        in inVar = this.d;
        if (i10 == inVar.x0 || i10 == inVar.B0 || i10 == inVar.C0 || i10 == inVar.y0 || i10 == inVar.z0 || i10 == inVar.A0 || i10 == inVar.D0 || i10 == inVar.I0.b || i10 == inVar.J0.b) {
            return 10;
        }
        if (i10 == inVar.h0 || i10 == inVar.o0 || i10 == inVar.s0 || i10 == inVar.k0) {
            return 0;
        }
        if (i10 == inVar.n0) {
            return 1;
        }
        if (i10 == inVar.r0 || i10 == inVar.t0 || i10 == inVar.m0 || i10 == inVar.G0) {
            return 2;
        }
        if (i10 == inVar.q0 || i10 == inVar.E0 || i10 == inVar.H0) {
            return 3;
        }
        if (i10 == inVar.i0) {
            return 4;
        }
        if (i10 == inVar.j0) {
            return 11;
        }
        if (i10 == inVar.l0) {
            return 7;
        }
        if (i10 == inVar.u0 || i10 == inVar.v0 || i10 == inVar.F0) {
            return 6;
        }
        if (i10 == inVar.w0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        in inVar = this.d;
        boolean z10 = inVar.a0;
        m.a aVar = inVar.I0;
        m.a aVar2 = inVar.J0;
        org.telegram.ui.ActionBar.c6 c6Var = inVar.a;
        boolean z11 = inVar.n;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == inVar.h0) {
                j4Var.getTextView().setGravity(19);
                j4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == inVar.k0) {
                j4Var.getTextView().setGravity(19);
                j4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            j4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != inVar.o0) {
                if (i10 == inVar.s0) {
                    j4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                j4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                j4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == inVar.u0) {
                p8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), inVar.b0, inVar.v0 != -1);
                p8Var.e(null, true);
                return;
            } else if (i10 == inVar.v0) {
                p8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), inVar.c0, false);
                p8Var.e(null, true);
                return;
            } else {
                if (i10 == inVar.F0) {
                    p8Var.f(LocaleController.getString(R.string.PollV2HideResults), inVar.S, false);
                    p8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setFixedSize(0);
            new dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7)).w = true;
            if (i10 == inVar.m0) {
                x8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == inVar.t0) {
                x8Var.setFixedSize(12);
                x8Var.setText(null);
                return;
            }
            int i12 = inVar.F - inVar.I;
            if (i12 <= 0) {
                x8Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                x8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == inVar.G0) {
                x8Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                x8Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == inVar.H0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = inVar.L0;
                l8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == inVar.E0) {
                    inVar.U(l8Var, false);
                    return;
                }
                l8Var.e(-1, org.telegram.ui.ActionBar.g6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k7, c6Var), mode));
                l8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new dq(drawable, drawable2), false);
                l8Var.w = 20;
                l8Var.s = 58;
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
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        x5Var.setDivider(false);
        if (i10 == inVar.x0) {
            x5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !inVar.T);
        } else {
            if (i10 == inVar.B0) {
                x5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, inVar.U);
            } else if (i10 == inVar.z0) {
                x5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, inVar.N);
            } else if (i10 == inVar.y0) {
                x5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, inVar.P);
            } else if (i10 == inVar.A0) {
                x5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, inVar.O);
            } else if (i10 == inVar.C0) {
                x5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, inVar.V);
            } else if (i10 == aVar2.b) {
                x5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                x5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == inVar.D0) {
                x5Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (inVar.Q == 0 && inVar.R == 0) ? false : true);
                x5Var = x5Var;
                x5Var.setDivider((inVar.Q == 0 && inVar.R == 0) ? false : true);
            }
            x5Var = x5Var;
        }
        if (i10 == inVar.C0) {
            x5Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != inVar.y0) {
            x5Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = x5Var.getCheckBox();
        if (!inVar.V && !inVar.T) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.an] */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        View view;
        in inVar = this.d;
        boolean z10 = inVar.n;
        org.telegram.ui.ActionBar.c6 c6Var = inVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                j4Var = new org.telegram.ui.Cells.j4(this.c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, inVar.a);
                break;
            case 1:
                View w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                new dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7)).w = true;
                j4Var = w6Var;
                break;
            case 2:
                j4Var = new org.telegram.ui.Cells.x8(context, c6Var);
                break;
            case 3:
                j4Var = new org.telegram.ui.Cells.l8(context, c6Var);
                break;
            case 4:
            case 11:
                cn cnVar = new cn(this, this.c, inVar.E ? 1 : 0, inVar.a, i10);
                if (i10 == 11 && !z10) {
                    cnVar.setTextRight(98);
                    final int i11 = 0;
                    cnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.an
                        public final /* synthetic */ gn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    in.O(this.b.d, -2);
                                    break;
                                case 1:
                                    in.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                cnVar.d();
                cnVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                cnVar.c(new dn(this, cnVar, i10));
                j4Var = cnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                fn fnVar = new fn(this, this.c, inVar.E ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.an
                    public final /* synthetic */ gn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                in.O(this.b.d, -2);
                                break;
                            case 1:
                                in.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                break;
                        }
                    }
                }, inVar.a);
                if (!z10) {
                    fnVar.setTextRight(140);
                    fnVar.b().setOnClickListener(new q2(11, this, fnVar));
                }
                int i13 = org.telegram.ui.ActionBar.g6.o7;
                fnVar.setIconsColor(i13);
                bp bpVar = fnVar.r;
                if (bpVar != null) {
                    bpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = bpVar.getCheckBoxBase();
                    float f10 = fnVar.a.e;
                    if (checkBoxBase.w != f10) {
                        checkBoxBase.w = f10;
                        checkBoxBase.b();
                    }
                }
                fnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.g6.k7);
                fnVar.c(new gh.n4(this, fnVar, false, 7));
                fnVar.setShowNextButton(true);
                EditTextBoldCursor textView = fnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.td(2, this, fnVar));
                textView.setOnKeyListener(new bn(fnVar, 0));
                j4Var = fnVar;
                break;
            case 6:
                j4Var = new org.telegram.ui.Cells.p8(context, c6Var);
                break;
            case 7:
                en enVar = new en(this, context, inVar.E ? 1 : 0);
                enVar.d();
                if (!z10) {
                    enVar.setTextRight(98);
                    final int i14 = 1;
                    enVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.an
                        public final /* synthetic */ gn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    in.O(this.b.d, -2);
                                    break;
                                case 1:
                                    in.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.z5) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                enVar.setIconsColor(org.telegram.ui.ActionBar.g6.o7);
                enVar.c(new gh.n4(this, enVar, false, 6));
                j4Var = enVar;
                break;
            case 8:
                View zmVar = new zm(context, 0);
                zmVar.setTag(-33024);
                view = zmVar;
                j4Var = view;
                break;
            case 9:
                View s0Var = new ag.s0(this, context, 13);
                s0Var.setTag(-33024);
                view = s0Var;
                j4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context, c6Var);
                x5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                j4Var = x5Var;
                break;
        }
        return org.telegram.ui.Cells.pa.l(j4Var, j4Var, -1, -2);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        in inVar = this.d;
        zg.f fVar = inVar.h1;
        boolean z10 = inVar.n;
        int i10 = o1Var.f;
        View view = o1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            CharSequence charSequence = inVar.J;
            z5Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            z5Var.setTag(null);
            in.L(inVar, view, o1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
            z5Var2.setTag(1);
            CharSequence charSequence2 = inVar.K;
            z5Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            z5Var2.setTag(null);
            z5Var2.e.a(fVar.b(-2), false);
            in.L(inVar, view, o1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
                z5Var3.setTag(1);
                CharSequence charSequence3 = inVar.L;
                z5Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                z5Var3.setTag(null);
                if (!z10) {
                    z5Var3.e.a(fVar.b(-3), false);
                }
                in.L(inVar, view, o1Var.b());
                return;
            }
            return;
        }
        int b10 = o1Var.b();
        org.telegram.ui.Cells.z5 z5Var4 = (org.telegram.ui.Cells.z5) view;
        z5Var4.setTag(1);
        z5Var4.a.a(inVar.U, false);
        int i11 = b10 - inVar.p0;
        z5Var4.n(inVar.G[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        z5Var4.setTag(null);
        if (inVar.g0 == b10) {
            EditTextBoldCursor textView = z5Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            inVar.g0 = -1;
        }
        if (!z10) {
            z5Var4.e.a(fVar.b(i11), false);
        }
        in.L(inVar, view, b10);
    }

    @Override // f2.q0
    public final void z(f2.o1 o1Var) {
        int i10 = o1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) o1Var.a).getTextView();
            if (textView.isFocused()) {
                in inVar = this.d;
                if (inVar.E) {
                    ym ymVar = inVar.x;
                    if (ymVar != null) {
                        ymVar.f();
                    }
                    inVar.Z(true);
                }
                inVar.c1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
