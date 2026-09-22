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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sn extends xl0 {
    public final Context c;
    public final /* synthetic */ un d;

    public sn(un unVar, Context context) {
        this.d = unVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
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
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i10 == unVar.l0) {
                n4Var.getTextView().setGravity(19);
                n4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i10 == unVar.o0) {
                n4Var.getTextView().setGravity(19);
                n4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            n4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i10 != unVar.s0) {
                if (i10 == unVar.w0) {
                    n4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (z10) {
                n4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                n4Var.setText(LocaleController.getString(z11 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        boolean z12 = true;
        if (i11 == 6) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == unVar.y0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), unVar.f0, unVar.z0 != -1);
                x8Var.e(null, true);
                return;
            } else if (i10 == unVar.z0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), unVar.g0, false);
                x8Var.e(null, true);
                return;
            } else {
                if (i10 == unVar.J0) {
                    x8Var.f(LocaleController.getString(R.string.PollV2HideResults), unVar.W, false);
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
            new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7)).w = true;
            if (i10 == unVar.q0) {
                f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i10 == unVar.x0) {
                f9Var.setFixedSize(12);
                f9Var.setText(null);
                return;
            }
            int i12 = unVar.J - unVar.M;
            if (i12 <= 0) {
                f9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                f9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i12));
                return;
            } else if (i10 == unVar.K0) {
                f9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                f9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i12, new Object[0])));
                return;
            }
        }
        if (i11 == 3) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == unVar.L0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = unVar.P0;
                s8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i10 == unVar.I0) {
                    unVar.U(s8Var, false);
                    return;
                }
                s8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
                s8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new pq(drawable, drawable2), false);
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
        if (i10 == unVar.B0) {
            b6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !unVar.a0);
        } else {
            if (i10 == unVar.F0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, unVar.b0);
            } else if (i10 == unVar.D0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, unVar.R);
            } else if (i10 == unVar.C0) {
                b6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, unVar.T);
            } else if (i10 == unVar.E0) {
                b6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, unVar.S);
            } else if (i10 == unVar.G0) {
                b6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, unVar.c0);
            } else if (i10 == aVar2.b) {
                b6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i10 == aVar.b) {
                b6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i10 == unVar.H0) {
                b6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (unVar.U == 0 && unVar.V == 0) ? false : true);
                b6Var = b6Var;
                b6Var.setDivider((unVar.U == 0 && unVar.V == 0) ? false : true);
            }
            b6Var = b6Var;
        }
        if (i10 == unVar.G0) {
            b6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i10 != unVar.C0) {
            b6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = b6Var.getCheckBox();
        if (!unVar.c0 && !unVar.a0) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [org.telegram.ui.Components.ln] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View n4Var;
        View view;
        un unVar = this.d;
        boolean z10 = unVar.n;
        org.telegram.ui.ActionBar.f6 f6Var = unVar.a;
        Context context = this.c;
        switch (i10) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, unVar.a);
                break;
            case 1:
                View c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7)).w = true;
                n4Var = c7Var;
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.f9(context, f6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.s8(context, f6Var);
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
                                    this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                nnVar.d();
                nnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                nnVar.c(new on(this, nnVar, i10));
                n4Var = nnVar;
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
                                this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                break;
                        }
                    }
                }, unVar.a);
                if (!z10) {
                    rnVar.setTextRight(140);
                    rnVar.b().setOnClickListener(new org.telegram.ui.sf(23, this, rnVar));
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
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, rnVar));
                textView.setOnKeyListener(new mn(rnVar, 0));
                n4Var = rnVar;
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.x8(context, f6Var);
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
                                    this.b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                pnVar.setIconsColor(org.telegram.ui.ActionBar.j6.o7);
                pnVar.c(new qn(0, this, pnVar));
                n4Var = pnVar;
                break;
            case 8:
                View knVar = new kn(context, 0);
                knVar.setTag(-33024);
                view = knVar;
                n4Var = view;
                break;
            case 9:
                View ebVar = new ci.eb(this, context, 14);
                ebVar.setTag(-33024);
                view = ebVar;
                n4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context, f6Var);
                b6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                n4Var = b6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(n4Var, n4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        un unVar = this.d;
        qh.f fVar = unVar.l1;
        boolean z10 = unVar.n;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            CharSequence charSequence = unVar.N;
            e6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            e6Var.setTag(null);
            un.L(unVar, view, c1Var.b());
            return;
        }
        if (i10 == 11) {
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.setTag(1);
            CharSequence charSequence2 = unVar.O;
            e6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            e6Var2.setTag(null);
            e6Var2.e.a(fVar.b(-2), false);
            un.L(unVar, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
                e6Var3.setTag(1);
                CharSequence charSequence3 = unVar.P;
                e6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                e6Var3.setTag(null);
                if (!z10) {
                    e6Var3.e.a(fVar.b(-3), false);
                }
                un.L(unVar, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.e6 e6Var4 = (org.telegram.ui.Cells.e6) view;
        e6Var4.setTag(1);
        e6Var4.a.a(unVar.b0, false);
        int i11 = b10 - unVar.t0;
        e6Var4.n(unVar.K[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        e6Var4.setTag(null);
        if (unVar.k0 == b10) {
            EditTextBoldCursor textView = e6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            unVar.k0 = -1;
        }
        if (!z10) {
            e6Var4.e.a(fVar.b(i11), false);
        }
        un.L(unVar, view, b10);
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.a).getTextView();
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
