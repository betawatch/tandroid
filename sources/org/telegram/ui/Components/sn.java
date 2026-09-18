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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sn extends ll0 {
    public final Context c;
    public final /* synthetic */ un d;

    public sn(un unVar, Context context) {
        this.d = unVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        un unVar = this.d;
        return b10 == unVar.u0 || b10 == unVar.G0 || b10 == unVar.B0 || b10 == unVar.F0 || b10 == unVar.C0 || b10 == unVar.H0 || b10 == unVar.D0 || b10 == unVar.E0 || b10 == unVar.I0 || b10 == unVar.J0 || b10 == unVar.N0.b || b10 == unVar.M0.b || b10 == unVar.L0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        un unVar = this.d;
        if (i10 == unVar.B0 || i10 == unVar.F0 || i10 == unVar.G0 || i10 == unVar.C0 || i10 == unVar.D0 || i10 == unVar.E0 || i10 == unVar.H0 || i10 == unVar.M0.b || i10 == unVar.N0.b) {
            return 10;
        }
        if (i10 == unVar.l0 || i10 == unVar.s0 || i10 == unVar.w0 || i10 == unVar.o0) {
            return 0;
        }
        if (i10 == unVar.r0) {
            return 1;
        }
        if (i10 == unVar.v0 || i10 == unVar.x0 || i10 == unVar.q0 || i10 == unVar.K0) {
            return 2;
        }
        if (i10 == unVar.u0 || i10 == unVar.I0 || i10 == unVar.L0) {
            return 3;
        }
        if (i10 == unVar.m0) {
            return 4;
        }
        if (i10 == unVar.n0) {
            return 11;
        }
        if (i10 == unVar.p0) {
            return 7;
        }
        if (i10 == unVar.y0 || i10 == unVar.z0 || i10 == unVar.J0) {
            return 6;
        }
        if (i10 == unVar.A0) {
            return 8;
        }
        return i10 == 0 ? 9 : 5;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        un unVar = this.d;
        boolean z10 = unVar.e0;
        c2.a aVar = unVar.M0;
        c2.a aVar2 = unVar.N0;
        org.telegram.ui.ActionBar.f6 f6Var = unVar.a;
        boolean z11 = unVar.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == unVar.l0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == unVar.o0) {
                l4Var.getTextView().setGravity(19);
                l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            l4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != unVar.s0) {
                if (i10 == unVar.w0) {
                    l4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                l4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == unVar.y0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), unVar.f0, unVar.z0 != -1);
                w8Var.e(null, true);
                return;
            } else if (i10 == unVar.z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), unVar.g0, false);
                w8Var.e(null, true);
                return;
            } else {
                if (i10 == unVar.J0) {
                    w8Var.f(LocaleController.getString(R.string.PollV2HideResults), unVar.W, false);
                    w8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setFixedSize(0);
            new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == unVar.q0) {
                e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == unVar.x0) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            }
            int i12 = unVar.J - unVar.M;
            if (i12 <= 0) {
                e9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == unVar.K0) {
                e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == unVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = unVar.P0;
                r8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == unVar.I0) {
                    unVar.U(r8Var, false);
                    return;
                }
                r8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                r8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new pq(drawable, drawable2), false);
                r8Var.w = 20;
                r8Var.s = 58;
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setDivider(false);
        if (i10 == unVar.B0) {
            z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !unVar.a0);
        } else {
            if (i10 == unVar.F0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, unVar.b0);
            } else if (i10 == unVar.D0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, unVar.R);
            } else if (i10 == unVar.C0) {
                z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, unVar.T);
            } else if (i10 == unVar.E0) {
                z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, unVar.S);
            } else if (i10 == unVar.G0) {
                z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, unVar.c0);
            } else if (i10 == aVar2.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == unVar.H0) {
                z5Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (unVar.U == 0 && unVar.V == 0) ? false : true);
                z5Var = z5Var;
                z5Var.setDivider((unVar.U == 0 && unVar.V == 0) ? false : true);
            }
            z5Var = z5Var;
        }
        if (i10 == unVar.G0) {
            z5Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != unVar.C0) {
            z5Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = z5Var.getCheckBox();
        if (!unVar.c0 && !unVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.ln] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        un unVar = this.d;
        boolean z10 = unVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = unVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, unVar.a);
                break;
            case 1:
                View a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                l4Var = a7Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                break;
            case 4:
            case 11:
                nn nnVar = new nn(this, this.c, unVar.I ? 1 : 0, unVar.a, i10);
                if (i10 == 11 && !z10) {
                    nnVar.setTextRight(98);
                    final int i11 = 0;
                    nnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ln
                        public final /* synthetic */ sn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    un.O(this.b.d, -2);
                                    break;
                                case 1:
                                    un.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                nnVar.d();
                nnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                nnVar.c(new on(this, nnVar, i10));
                l4Var = nnVar;
                break;
            case 5:
            default:
                final int i12 = 2;
                rn rnVar = new rn(this, this.c, unVar.I ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ln
                    public final /* synthetic */ sn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                un.O(this.b.d, -2);
                                break;
                            case 1:
                                un.O(this.b.d, -3);
                                break;
                            default:
                                this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                break;
                        }
                    }
                }, unVar.a);
                if (!z10) {
                    rnVar.setTextRight(140);
                    rnVar.b().setOnClickListener(new org.telegram.ui.tf(23, this, rnVar));
                }
                int i13 = org.telegram.ui.ActionBar.j6.o7;
                rnVar.setIconsColor(i13);
                np npVar = rnVar.r;
                if (npVar != null) {
                    npVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
                    float f7 = rnVar.a.e;
                    if (checkBoxBase.w != f7) {
                        checkBoxBase.w = f7;
                        checkBoxBase.b();
                    }
                }
                rnVar.getCheckBox().b(-1, i13, org.telegram.ui.ActionBar.j6.k7);
                rnVar.c(new qn(1, this, rnVar));
                rnVar.setShowNextButton(true);
                EditTextBoldCursor textView = rnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.xd(2, this, rnVar));
                textView.setOnKeyListener(new mn(rnVar, 0));
                l4Var = rnVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, f6Var);
                break;
            case 7:
                pn pnVar = new pn(this, context, unVar.I ? 1 : 0);
                pnVar.d();
                if (!z10) {
                    pnVar.setTextRight(98);
                    final int i14 = 1;
                    pnVar.b().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ln
                        public final /* synthetic */ sn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    un.O(this.b.d, -2);
                                    break;
                                case 1:
                                    un.O(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                pnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                pnVar.c(new qn(0, this, pnVar));
                l4Var = pnVar;
                break;
            case 8:
                View knVar = new kn(context, 0);
                knVar.setTag(-33024);
                view = knVar;
                l4Var = view;
                break;
            case 9:
                View ebVar = new ci.eb(this, context, 14);
                ebVar.setTag(-33024);
                view = ebVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, f6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(l4Var, l4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        un unVar = this.d;
        qh.f fVar = unVar.l1;
        boolean z10 = unVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence = unVar.N;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            c6Var.setTag(null);
            un.L(unVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence2 = unVar.O;
            c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(fVar.b(-2), false);
            un.L(unVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
                c6Var3.setTag(1);
                CharSequence charSequence3 = unVar.P;
                c6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var3.setTag(null);
                if (!z10) {
                    c6Var3.e.a(fVar.b(-3), false);
                }
                un.L(unVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
        c6Var4.setTag(1);
        c6Var4.a.a(unVar.b0, false);
        int i11 = b10 - unVar.t0;
        c6Var4.n(unVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var4.setTag(null);
        if (unVar.k0 == b10) {
            EditTextBoldCursor textView = c6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            unVar.k0 = -1;
        }
        if (!z10) {
            c6Var4.e.a(fVar.b(i11), false);
        }
        un.L(unVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                un unVar = this.d;
                if (unVar.I) {
                    jn jnVar = unVar.x;
                    if (jnVar != null) {
                        jnVar.f();
                    }
                    unVar.Z(true);
                }
                unVar.g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
