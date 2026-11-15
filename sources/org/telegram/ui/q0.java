package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                an.ld = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.cj) obj).d = f10;
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
                jz0 jz0Var = (jz0) obj;
                if (jz0Var.a != f10) {
                    jz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = jz0Var.r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (!jz0Var.b) {
                        if (jz0Var.c) {
                            jz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
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
                        org.telegram.ui.Components.w51 w51Var = secretMediaViewer.P;
                        if (w51Var.y != f11) {
                            w51Var.y = f11;
                            w51Var.v.invalidate();
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
                return Float.valueOf(an.ld);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.cj) obj).d);
            case 4:
                return Float.valueOf(((vv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((jz0) obj).a);
        }
    }
}
