package androidx.car.app.model;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private ogb mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper wrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        wrap.setRefresh(templateWrapper.isRefresh());
        wrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            wrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return wrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(ogb ogbVar, String str) {
        Objects.requireNonNull(ogbVar);
        Objects.requireNonNull(str);
        return new TemplateWrapper(ogbVar, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        Objects.requireNonNull(str);
        return str;
    }

    public ogb getTemplate() {
        ogb ogbVar = this.mTemplate;
        Objects.requireNonNull(ogbVar);
        return ogbVar;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        List<TemplateInfo> list = this.mTemplateInfoForScreenStack;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(ogb ogbVar) {
        this.mTemplate = ogbVar;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[template: ");
        sb.append(this.mTemplate);
        sb.append(", ID: ");
        return b00.j(sb, this.mId, "]");
    }

    public static TemplateWrapper wrap(ogb ogbVar) {
        return wrap(ogbVar, createRandomId());
    }

    private TemplateWrapper(ogb ogbVar, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = ogbVar;
        this.mId = str;
    }
}
