package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                bn.md = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.r1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.bj) obj).d = f10;
                break;
            case 4:
                ((vv0) obj).setCrossfadeProgress(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                mz0 mz0Var = (mz0) obj;
                if (mz0Var.a != f10) {
                    mz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = mz0Var.r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (!mz0Var.b) {
                        if (mz0Var.c) {
                            mz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.Q.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.R.setPivotX(r4.getWidth());
                        secretMediaViewer.R.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.l61 l61Var = secretMediaViewer.P;
                        if (l61Var.y != f11) {
                            l61Var.y = f11;
                            l61Var.v.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.r1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.bj) obj).d);
            case 4:
                return Float.valueOf(((vv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((mz0) obj).a);
        }
    }
}
