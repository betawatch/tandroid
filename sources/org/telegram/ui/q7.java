package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class q7 extends FrameLayout implements org.telegram.ui.Components.hc0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.y71 b;
    public final View c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList e;
    public kh.b f;
    public final org.telegram.ui.Components.z71 h;
    public final p7[] n;
    public f7 r;
    public int s;
    public g7 v;

    public q7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        p7[] p7VarArr = new p7[5];
        this.n = p7VarArr;
        this.d = o2Var;
        p7VarArr[0] = new p7(LocaleController.getString(R.string.FilterChats), 0, new h7(this));
        p7VarArr[1] = new p7(LocaleController.getString(R.string.MediaTab), 1, new m7(this));
        p7VarArr[2] = new p7(LocaleController.getString(R.string.SharedFilesTab2), 2, new j7(this));
        p7VarArr[3] = new p7(LocaleController.getString(R.string.Music), 3, new o7(this));
        int i10 = 0;
        while (true) {
            p7[] p7VarArr2 = this.n;
            if (i10 >= p7VarArr2.length) {
                org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(getContext(), null);
                this.h = z71Var;
                z71Var.setAllowDisallowInterceptTouch(false);
                addView(z71Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.y71 n10 = z71Var.n(3, true);
                this.b = n10;
                addView(n10, i7.f6.c(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false));
                addView(view, i7.f6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                z71Var.setAdapter(new c7(this, context, o2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, i7.f6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                imageView.setImageDrawable(h2Var);
                int i11 = org.telegram.ui.ActionBar.g6.y8;
                h2Var.a(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.g6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(imageView);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y6
                    public final /* synthetic */ q7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.o1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
                o6Var.setTextSize(AndroidUtilities.dp(18.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                linearLayout.addView(o6Var, i7.f6.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(o6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(w0Var);
                final int i14 = 1;
                w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y6
                    public final /* synthetic */ q7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.b.v.o1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            p7 p7Var = p7VarArr2[i10];
            if (p7Var != null) {
                this.e.add(i10, p7Var);
            }
            i10++;
        }
    }

    public static void a(q7 q7Var, k7 k7Var, m7 m7Var, org.telegram.ui.Components.jl0 jl0Var) {
        ArrayList arrayList = m7Var.e;
        PhotoViewer.t1().K2(null, q7Var.d, null);
        if (q7Var.r == null) {
            q7Var.r = new f7(q7Var);
        }
        q7Var.r.a = jl0Var;
        if (arrayList.indexOf(k7Var) >= 0) {
            PhotoViewer.t1().f2(m7Var.r, arrayList.indexOf(k7Var), -1, false, q7Var.r, null);
        }
    }

    public static void b(q7 q7Var, kh.a aVar, i7 i7Var) {
        org.telegram.ui.ActionBar.o2 o2Var = q7Var.d;
        org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) q7Var.h.getCurrentView();
        if (i7Var.e == 2) {
            if (!(jl0Var.getAdapter() instanceof j7)) {
                return;
            }
            PhotoViewer.t1().K2(null, o2Var, null);
            if (q7Var.r == null) {
                q7Var.r = new f7(q7Var);
            }
            q7Var.r.a = jl0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, q7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
            }
        }
        if (i7Var.e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(aVar.f)) {
                MediaController.getInstance().playMessage(aVar.f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(aVar.f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(aVar.f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0100 A[LOOP:2: B:65:0x00fa->B:67:0x0100, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                p7[] p7VarArr = this.n;
                if (i10 >= p7VarArr.length) {
                    break;
                }
                p7 p7Var = p7VarArr[i10];
                if (p7Var != null) {
                    if (p7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    } else if (p7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    } else if (p7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    } else if (p7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    } else if (p7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    } else if (p7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(p7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.z71 z71Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) z71Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((p7) arrayList.get(i11)).b == ((p7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                d7 d7Var = ((p7) arrayList2.get(i12)).c;
                ((p7) arrayList2.get(i12)).c.F();
            }
        }
        z71Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.h;
            if (i10 >= z71Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.jl0) z71Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.jl0 getListView() {
        org.telegram.ui.Components.z71 z71Var = this.h;
        if (z71Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.jl0) z71Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.h;
            if (i11 >= z71Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) z71Var.getViewPages()[i11];
            if (jl0Var != null) {
                jl0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(kh.b bVar) {
        this.f = bVar;
        c();
    }

    public void setDelegate(g7 g7Var) {
        this.v = g7Var;
    }
}
