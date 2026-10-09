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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k8 extends pm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public i8 f;
    public boolean h;
    public final /* synthetic */ l8 n;

    public k8(l8 l8Var, Context context) {
        this.n = l8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return (this.n.v0 && d1Var.b() == 0) ? false : true;
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
            i8 i8Var = new i8(this, str, 0);
            this.f = i8Var;
            dispatchQueue.postRunnable(i8Var, 300L);
        }
    }

    @Override // s4.i0
    public final int h() {
        int size;
        l8 l8Var = this.n;
        boolean z10 = l8Var.v0;
        if (l8Var.f) {
            size = this.d.size();
        } else {
            if (l8Var.x0.size() <= 1) {
                return 0;
            }
            size = l8Var.x0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return (this.n.v0 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.i0
    public final void l() {
        super.l();
        l8 l8Var = this.n;
        View view = l8Var.e;
        r7 r7Var = l8Var.E;
        w7 w7Var = l8Var.n;
        if ((l8Var.x0.size() > 1) != this.h) {
            boolean z10 = l8Var.x0.size() > 1;
            this.h = z10;
            if (z10) {
                w7Var.setVisibility(0);
                w7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                w7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.h8
                    public final /* synthetic */ k8 b;

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
                }).setDuration(420L).setInterpolator(hs.h).start();
            } else {
                final int i11 = 1;
                w7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.h8
                    public final /* synthetic */ k8 b;

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
                }).setDuration(420L).setInterpolator(hs.h).withEndAction(new rg(this, 9)).start();
            }
        }
        if (l8Var.x0.size() > 1) {
            r7Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            w7Var.setPadding(0, w7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            r7Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ri));
            view.setVisibility(0);
            w7Var.setPadding(0, w7Var.getPaddingTop(), 0, 0);
        }
        l8Var.v.setVisibility((l8Var.h && l8Var.s.h() == 0) ? 0 : 8);
        l8Var.E0();
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
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        l8 l8Var = this.n;
        if (l8Var.v0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) d1Var.a;
        if (l8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (l8Var.w0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = l8Var.x0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) l8Var.x0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        ci.p1 p1Var = l8Var.t0() ? new ci.p1(2, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.i6.h5;
        e6Var = ((org.telegram.ui.ActionBar.f3) l8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        boolean t02 = l8Var.t0();
        ai.d0 d0Var = (l8Var.t0() || l8Var.z0 || messageObject.getId() <= 0) ? null : new ai.d0(this, xVar, messageObject, 15);
        RadialProgress2 radialProgress2 = xVar.H;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(t02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((t02 || d0Var != null) ? 0 : 8);
        imageView.setOnClickListener(d0Var);
        imageView.setOnTouchListener(p1Var);
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

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.c;
        if (i10 == 1) {
            ao aoVar = new ao(context, 10);
            aoVar.setTag(-33024);
            return new am0(aoVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        e6Var = ((org.telegram.ui.ActionBar.f3) this.n).resourcesProvider;
        return new am0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, e6Var));
    }
}
