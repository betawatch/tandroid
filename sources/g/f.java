package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.api.internal.s1;
import java.util.WeakHashMap;
import m.w1;
import org.telegram.messenger.beta.R;
import r0.c0;
import r0.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class f extends s implements DialogInterface {
    public final e f;

    public f(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // g.s, androidx.activity.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f;
        eVar.b.setContentView(eVar.u);
        Context context = eVar.a;
        Window window = eVar.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = eVar.f;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !e.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.e != null) {
                ((LinearLayout.LayoutParams) ((w1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c3 = e.c(findViewById6, findViewById3);
        ViewGroup c10 = e.c(findViewById7, findViewById4);
        ViewGroup c11 = e.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c10.findViewById(android.R.id.message);
        eVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.m.removeView(eVar.q);
            if (eVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c10.setVisibility(8);
            }
        }
        Button button = (Button) c11.findViewById(android.R.id.button1);
        eVar.h = button;
        androidx.mediarouter.app.y yVar = eVar.A;
        button.setOnClickListener(yVar);
        if (TextUtils.isEmpty(null)) {
            eVar.h.setVisibility(8);
            i10 = 0;
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) c11.findViewById(android.R.id.button2);
        eVar.i = button2;
        button2.setOnClickListener(yVar);
        if (TextUtils.isEmpty(eVar.j)) {
            eVar.i.setVisibility(8);
        } else {
            eVar.i.setText(eVar.j);
            eVar.i.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) c11.findViewById(android.R.id.button3);
        eVar.l = button3;
        button3.setOnClickListener(yVar);
        if (TextUtils.isEmpty(null)) {
            eVar.l.setVisibility(8);
        } else {
            eVar.l.setText((CharSequence) null);
            eVar.l.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = eVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = eVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = eVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            c11.setVisibility(8);
        }
        if (eVar.r != null) {
            c3.addView(eVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.d) || !eVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.o.setVisibility(8);
                c3.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.p = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.n;
                if (drawable != null) {
                    eVar.o.setImageDrawable(drawable);
                } else {
                    eVar.p.setPadding(eVar.o.getPaddingLeft(), eVar.o.getPaddingTop(), eVar.o.getPaddingRight(), eVar.o.getPaddingBottom());
                    eVar.o.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i11 = (c3 == null || c3.getVisibility() == 8) ? 0 : 1;
        boolean z11 = c11.getVisibility() != 8;
        if (!z11 && (findViewById = c10.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = eVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = eVar.e != null ? c3.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c10.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z11 || i11 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z10) {
            View view2 = eVar.e;
            if (view2 == null) {
                view2 = eVar.m;
            }
            if (view2 != null) {
                int i12 = i11 | (z11 ? 2 : 0);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 23) {
                    WeakHashMap weakHashMap = j0.a;
                    if (i13 >= 23) {
                        c0.b(view2, i12, 3);
                    }
                    if (findViewById11 != null) {
                        c10.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        c10.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i12 & 1) == 0) {
                        c10.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (i12 & 2) == 0) {
                        c10.removeView(findViewById12);
                        findViewById12 = null;
                    }
                    if (findViewById11 != null || findViewById12 != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = eVar.e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new a(findViewById11, findViewById12));
                            eVar.e.post(new s1(eVar, findViewById11, findViewById12, 1));
                        } else {
                            if (findViewById11 != null) {
                                c10.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                c10.removeView(findViewById12);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = eVar.e;
        if (alertController$RecycleListView3 == null || (listAdapter = eVar.s) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i14 = eVar.t;
        if (i14 > -1) {
            alertController$RecycleListView3.setItemChecked(i14, true);
            alertController$RecycleListView3.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // g.s, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f;
        eVar.d = charSequence;
        TextView textView = eVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
