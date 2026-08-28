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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hn extends vk0 {
    public final Context c;
    public final /* synthetic */ jn d;

    public hn(jn jnVar, Context context) {
        this.d = jnVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        jn jnVar = this.d;
        return b10 == jnVar.q0 || b10 == jnVar.C0 || b10 == jnVar.x0 || b10 == jnVar.B0 || b10 == jnVar.y0 || b10 == jnVar.D0 || b10 == jnVar.z0 || b10 == jnVar.A0 || b10 == jnVar.E0 || b10 == jnVar.F0 || b10 == jnVar.J0.b || b10 == jnVar.I0.b || b10 == jnVar.H0;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.M0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        jn jnVar = this.d;
        if (i9 == jnVar.x0 || i9 == jnVar.B0 || i9 == jnVar.C0 || i9 == jnVar.y0 || i9 == jnVar.z0 || i9 == jnVar.A0 || i9 == jnVar.D0 || i9 == jnVar.I0.b || i9 == jnVar.J0.b) {
            return 10;
        }
        if (i9 == jnVar.h0 || i9 == jnVar.o0 || i9 == jnVar.s0 || i9 == jnVar.k0) {
            return 0;
        }
        if (i9 == jnVar.n0) {
            return 1;
        }
        if (i9 == jnVar.r0 || i9 == jnVar.t0 || i9 == jnVar.m0 || i9 == jnVar.G0) {
            return 2;
        }
        if (i9 == jnVar.q0 || i9 == jnVar.E0 || i9 == jnVar.H0) {
            return 3;
        }
        if (i9 == jnVar.i0) {
            return 4;
        }
        if (i9 == jnVar.j0) {
            return 11;
        }
        if (i9 == jnVar.l0) {
            return 7;
        }
        if (i9 == jnVar.u0 || i9 == jnVar.v0 || i9 == jnVar.F0) {
            return 6;
        }
        if (i9 == jnVar.w0) {
            return 8;
        }
        return i9 == 0 ? 9 : 5;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        jn jnVar = this.d;
        boolean z10 = jnVar.a0;
        m.a aVar = jnVar.I0;
        m.a aVar2 = jnVar.J0;
        org.telegram.ui.ActionBar.b6 b6Var = jnVar.a;
        boolean z11 = jnVar.n;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == jnVar.h0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(z11 ? R.string.TodoTitle : R.string.PollQuestion2));
                return;
            }
            if (i9 == jnVar.k0) {
                m4Var.getTextView().setGravity(19);
                m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
                return;
            }
            m4Var.getTextView().setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i9 != jnVar.o0) {
                if (i9 == jnVar.s0) {
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
        if (i10 == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            if (i9 == jnVar.u0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), jnVar.b0, jnVar.v0 != -1);
                t8Var.e(null, true);
                return;
            } else if (i9 == jnVar.v0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), jnVar.c0, false);
                t8Var.e(null, true);
                return;
            } else {
                if (i9 == jnVar.F0) {
                    t8Var.f(LocaleController.getString(R.string.PollV2HideResults), jnVar.S, false);
                    t8Var.e(null, true);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i10 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            new fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7)).w = true;
            if (i9 == jnVar.m0) {
                b9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                return;
            }
            if (i9 == jnVar.t0) {
                b9Var.setFixedSize(12);
                b9Var.setText(null);
                return;
            }
            int i11 = jnVar.F - jnVar.I;
            if (i11 <= 0) {
                b9Var.setText(LocaleController.getString(z11 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
                return;
            }
            if (z11) {
                b9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i11));
                return;
            } else if (i9 == jnVar.G0) {
                b9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                return;
            } else {
                b9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i11, new Object[0])));
                return;
            }
        }
        if (i10 == 3) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i9 == jnVar.H0) {
                String string = LocaleController.getString(R.string.PollV2AllowedCountries);
                ArrayList arrayList = jnVar.L0;
                p8Var.o(string, arrayList.isEmpty() ? LocaleController.getString(R.string.SearchCountriesSelect) : arrayList.size() == 1 ? LocaleController.getCountryName((String) arrayList.get(0)) : LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]), false, true);
                return;
            } else {
                if (i9 == jnVar.E0) {
                    jnVar.T(p8Var, false);
                    return;
                }
                p8Var.e(-1, org.telegram.ui.ActionBar.f6.il);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N6, b6Var);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k7, b6Var), mode));
                p8Var.n(LocaleController.getString(z11 ? R.string.TodoNewTask : R.string.AddAnOption), new fq(drawable, drawable2), false);
                p8Var.w = 20;
                p8Var.s = 58;
                return;
            }
        }
        if (i10 == 9) {
            view.requestLayout();
            return;
        }
        if (i10 != 10) {
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
        a6Var.setDivider(false);
        if (i9 == jnVar.x0) {
            a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !jnVar.T);
        } else {
            if (i9 == jnVar.B0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, jnVar.U);
            } else if (i9 == jnVar.z0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, jnVar.N);
            } else if (i9 == jnVar.y0) {
                a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, jnVar.P);
            } else if (i9 == jnVar.A0) {
                a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, jnVar.O);
            } else if (i9 == jnVar.C0) {
                a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, jnVar.V);
            } else if (i9 == aVar2.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.a);
            } else if (i9 == aVar.b) {
                a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.a);
            } else if (i9 == jnVar.D0) {
                a6Var.a(LocaleController.getString(R.string.PollV2LimitDuration), LocaleController.getString(R.string.PollV2LimitDurationInfo), 8, R.drawable.filled_poll_deadline_24, (jnVar.Q == 0 && jnVar.R == 0) ? false : true);
                a6Var = a6Var;
                a6Var.setDivider((jnVar.Q == 0 && jnVar.R == 0) ? false : true);
            }
            a6Var = a6Var;
        }
        if (i9 == jnVar.C0) {
            a6Var.getCheckBox().a.a(z10, false);
            return;
        }
        if (i9 != jnVar.y0) {
            a6Var.getCheckBox().a.a(false, false);
            return;
        }
        Switch checkBox = a6Var.getCheckBox();
        if (!jnVar.V && !jnVar.T) {
            z12 = false;
        }
        checkBox.a.a(z12, false);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [org.telegram.ui.Components.bn] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        View view;
        jn jnVar = this.d;
        boolean z10 = jnVar.n;
        org.telegram.ui.ActionBar.b6 b6Var = jnVar.a;
        Context context = this.c;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 21, 15, false, jnVar.a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                new fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, b6Var)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7)).w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.b9(context, b6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.p8(context, b6Var);
                break;
            case 4:
            case 11:
                dn dnVar = new dn(this, this.c, jnVar.E ? 1 : 0, jnVar.a, i9);
                if (i9 == 11 && !z10) {
                    dnVar.setTextRight(98);
                    final int i10 = 0;
                    dnVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bn
                        public final /* synthetic */ hn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i10) {
                                case 0:
                                    jn.N(this.b.d, -2);
                                    break;
                                case 1:
                                    jn.N(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                dnVar.c();
                dnVar.setIconsColor(org.telegram.ui.ActionBar.f6.o7);
                dnVar.b(new en(this, dnVar, i9));
                m4Var = dnVar;
                break;
            case 5:
            default:
                final int i11 = 2;
                gn gnVar = new gn(this, this.c, jnVar.E ? 1 : 0, new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bn
                    public final /* synthetic */ hn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                jn.N(this.b.d, -2);
                                break;
                            case 1:
                                jn.N(this.b.d, -3);
                                break;
                            default:
                                this.b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                break;
                        }
                    }
                }, jnVar.a);
                if (!z10) {
                    gnVar.setTextRight(140);
                    gnVar.a().setOnClickListener(new s2(10, this, gnVar));
                }
                int i12 = org.telegram.ui.ActionBar.f6.o7;
                gnVar.setIconsColor(i12);
                dp dpVar = gnVar.r;
                if (dpVar != null) {
                    dpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
                    float f10 = gnVar.a.e;
                    if (checkBoxBase.w != f10) {
                        checkBoxBase.w = f10;
                        checkBoxBase.b();
                    }
                }
                gnVar.getCheckBox().b(-1, i12, org.telegram.ui.ActionBar.f6.k7);
                gnVar.b(new fh.t4(this, gnVar, false, 7));
                gnVar.setShowNextButton(true);
                EditTextBoldCursor textView = gnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.td(2, this, gnVar));
                textView.setOnKeyListener(new cn(gnVar, 0));
                m4Var = gnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.t8(context, b6Var);
                break;
            case 7:
                fn fnVar = new fn(this, context, jnVar.E ? 1 : 0);
                fnVar.c();
                if (!z10) {
                    fnVar.setTextRight(98);
                    final int i13 = 1;
                    fnVar.a().setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bn
                        public final /* synthetic */ hn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i13) {
                                case 0:
                                    jn.N(this.b.d, -2);
                                    break;
                                case 1:
                                    jn.N(this.b.d, -3);
                                    break;
                                default:
                                    this.b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    break;
                            }
                        }
                    });
                }
                fnVar.setIconsColor(org.telegram.ui.ActionBar.f6.o7);
                fnVar.b(new fh.t4(this, fnVar, false, 6));
                m4Var = fnVar;
                break;
            case 8:
                View anVar = new an(context, 0);
                anVar.setTag(-33024);
                view = anVar;
                m4Var = view;
                break;
            case 9:
                View l2Var = new fh.l2(this, context, 13);
                l2Var.setTag(-33024);
                view = l2Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, b6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return j3.r0.s(m4Var, m4Var, -1, -2);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        jn jnVar = this.d;
        yg.f fVar = jnVar.h1;
        boolean z10 = jnVar.n;
        int i9 = q1Var.f;
        View view = q1Var.a;
        if (i9 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence = jnVar.J;
            c6Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), true);
            c6Var.setTag(null);
            jn.K(jnVar, view, q1Var.b());
            return;
        }
        if (i9 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence2 = jnVar.K;
            c6Var2.n(charSequence2 != null ? charSequence2 : "", LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(fVar.b(-2), false);
            jn.K(jnVar, view, q1Var.b());
            return;
        }
        if (i9 != 5) {
            if (i9 == 7) {
                org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
                c6Var3.setTag(1);
                CharSequence charSequence3 = jnVar.L;
                c6Var3.n(charSequence3 != null ? charSequence3 : "", LocaleController.getString(R.string.AddAnExplanation), false);
                c6Var3.setTag(null);
                if (!z10) {
                    c6Var3.e.a(fVar.b(-3), false);
                }
                jn.K(jnVar, view, q1Var.b());
                return;
            }
            return;
        }
        int b10 = q1Var.b();
        org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
        c6Var4.setTag(1);
        c6Var4.a.a(jnVar.U, false);
        int i10 = b10 - jnVar.p0;
        c6Var4.n(jnVar.G[i10], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        c6Var4.setTag(null);
        if (jnVar.g0 == b10) {
            EditTextBoldCursor textView = c6Var4.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            jnVar.g0 = -1;
        }
        if (!z10) {
            c6Var4.e.a(fVar.b(i10), false);
        }
        jn.K(jnVar, view, b10);
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 4 || i9 == 11 || i9 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) q1Var.a).getTextView();
            if (textView.isFocused()) {
                jn jnVar = this.d;
                if (jnVar.E) {
                    zm zmVar = jnVar.x;
                    if (zmVar != null) {
                        zmVar.f();
                    }
                    jnVar.Y(true);
                }
                jnVar.c1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
