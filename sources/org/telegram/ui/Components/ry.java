package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ry extends ul0 {
    public boolean E;
    public final /* synthetic */ rz F;
    public final ly c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public qy x;
    public boolean y;

    public ry(rz rzVar, Context context) {
        this.F = rzVar;
        ly lyVar = new ly(context, rzVar.c1, new e(this, 11), new pv(this, 1), rzVar.Z1);
        this.c = lyVar;
        lyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        lyVar.setClipToPadding(false);
        lyVar.Y2.r = false;
        lyVar.setNestedScrollingEnabled(false);
        lyVar.setDrawSelection(false);
        lyVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ry ryVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        rz rzVar = ryVar.F;
        String[] strArr = rzVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = ryVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(rzVar.c1).searchStickers(true, str, str2, new gg.u1(ryVar, str2, arrayList, runnable, 6), z10);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        rz rzVar = this.F;
        px pxVar = rzVar.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = pxVar.getAdapter();
            yx yxVar = rzVar.R;
            if (adapter != yxVar) {
                pxVar.setAdapter(yxVar);
                this.y = false;
            }
            this.d = 0L;
            rzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        qy qyVar = this.x;
        if (qyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qyVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        rzVar.V.e(true);
        qy qyVar2 = new qy(this);
        this.x = qyVar2;
        AndroidUtilities.runOnUIThread(qyVar2, z10 ? 300L : 0L);
    }

    @Override // s4.h0
    public final int h() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.y) {
            return this.F.getRecentEmoji().size() + 1;
        }
        int i10 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i10 = 3;
        } else if (arrayList.isEmpty()) {
            i10 = 1;
        }
        int size = arrayList.size() + i10;
        if (arrayList3.isEmpty()) {
            return size;
        }
        return arrayList3.size() + size + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r9 == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0052, code lost:
    
        if (r9 == 1) goto L49;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11 = 2;
        if (this.d != 0) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return 4;
                }
                if (i10 != 2) {
                    return i10 == h() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i10 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i10 == 1 && this.y && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i11 = 3;
                } else if (arrayList3.isEmpty()) {
                    i11 = 1;
                }
                if (i10 != arrayList3.size() + i11) {
                    return 0;
                }
            } else if (i10 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // s4.h0
    public final void l() {
        this.c.Y2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l4;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (this.d != 0) {
                p8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                p8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                p8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        az azVar = (az) view;
        azVar.a = i10;
        azVar.e = null;
        int i13 = i10 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i13 = i10 - 3;
        } else if (!arrayList2.isEmpty()) {
            i13 = i10 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i13);
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.y) {
                str = this.F.getRecentEmoji().get(i13);
                str2 = str;
                document = null;
                z10 = true;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        l4 = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                    }
                    if (document == null || l4 != null) {
                        azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        azVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        azVar.a(null, z10);
                        if (azVar.getSpan() == null || azVar.getSpan().document != document) {
                            azVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        azVar.a(null, z10);
                        if (azVar.getSpan() == null || azVar.getSpan().getDocumentId() != l4.longValue()) {
                            azVar.setSpan(new y5(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        azVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        azVar.setSpan(null);
                    } else {
                        azVar.a(null, z10);
                        azVar.setSpan(null);
                    }
                    azVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                azVar.setTag(str4);
            }
            str = i13 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i13)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i13 - arrayList2.size()) - 1)).emoji;
            str2 = str;
            document = null;
        }
        z10 = false;
        if (str != null) {
            l4 = Long.valueOf(Long.parseLong(str.substring(9)));
            str4 = null;
            str3 = null;
            if (document == null) {
            }
            azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            azVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        azVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        azVar.setTag(str4);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        rz rzVar = this.F;
        if (i10 == 0) {
            view = new az(rzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(rzVar.getContext());
            view2.setLayoutParams(new s4.p0(-1, rzVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.p8(rzVar.getContext(), true, false, rzVar.Z1, rzVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(p0Var);
            view = view3;
        } else if (i10 != 5) {
            bi.ld ldVar = new bi.ld(this, rzVar.getContext(), 11);
            TextView textView = new TextView(rzVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.j6.Le;
            textView.setTextColor(rzVar.z(i11));
            ldVar.addView(textView, w7.a6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(rzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(rzVar.z(i11), PorterDuff.Mode.MULTIPLY));
            ldVar.addView(imageView, w7.a6.e(48, 48, 85));
            imageView.setOnClickListener(new oy(this));
            ldVar.setLayoutParams(new s4.p0(-1, -2));
            view = ldVar;
        } else {
            View view4 = new View(rzVar.getContext());
            view4.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new fl0(view);
    }
}
