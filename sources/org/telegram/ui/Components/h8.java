package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h8 extends xl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public f8 f;
    public boolean h;
    public final /* synthetic */ i8 n;

    public h8(i8 i8Var, Context context) {
        this.n = i8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return (this.n.v0 && c1Var.b() == 0) ? false : true;
    }

    public final void E(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f8 f8Var = new f8(this, str, 0);
            this.f = f8Var;
            dispatchQueue.postRunnable(f8Var, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        int size;
        i8 i8Var = this.n;
        boolean z10 = i8Var.v0;
        if (i8Var.f) {
            size = this.d.size();
        } else {
            if (i8Var.x0.size() <= 1) {
                return 0;
            }
            size = i8Var.x0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (this.n.v0 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        i8 i8Var = this.n;
        View view = i8Var.e;
        o7 o7Var = i8Var.E;
        t7 t7Var = i8Var.n;
        if ((i8Var.x0.size() > 1) != this.h) {
            boolean z10 = i8Var.x0.size() > 1;
            this.h = z10;
            if (z10) {
                t7Var.setVisibility(0);
                t7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                t7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.e8
                    public final /* synthetic */ h8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).start();
            } else {
                final int i11 = 1;
                t7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.e8
                    public final /* synthetic */ h8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i11) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).withEndAction(new og(this, 9)).start();
            }
        }
        if (i8Var.x0.size() > 1) {
            o7Var.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            o7Var.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            t7Var.setPadding(0, t7Var.getPaddingTop(), 0, 0);
        }
        i8Var.v.setVisibility((i8Var.h && i8Var.s.h() == 0) ? 0 : 8);
        i8Var.E0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r12 + 1) < r10.d.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0028, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        if (((r0.x0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.x0.size()) goto L11;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        i8 i8Var = this.n;
        if (i8Var.v0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) c1Var.a;
        if (i8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (i8Var.w0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = i8Var.x0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) i8Var.x0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        ci.q1 q1Var = i8Var.s0() ? new ci.q1(2, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        f6Var = ((org.telegram.ui.ActionBar.f3) i8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        boolean s02 = i8Var.s0();
        ai.d0 d0Var = (i8Var.s0() || i8Var.z0 || messageObject.getId() <= 0) ? null : new ai.d0(this, xVar, messageObject, 15);
        RadialProgress2 radialProgress2 = xVar.H;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(s02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((s02 || d0Var != null) ? 0 : 8);
        imageView.setOnClickListener(d0Var);
        imageView.setOnTouchListener(q1Var);
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90) : null;
        if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = messageObject.getArtworkUrl(true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        xVar.requestLayout();
        xVar.b(false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        if (i10 == 1) {
            kn knVar = new kn(context, 10);
            knVar.setTag(-33024);
            return new il0(knVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.f3) this.n).resourcesProvider;
        return new il0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
